{"action":"start","category.generic":"Process","category.high":"Availability Management","category.low":"Control","datafield6":"ceed3963-b528-649f-63d9-060000000000","event_src.category":"Other","event_src.fqdn":"pc1","event_src.host":"pc1","event_src.hostname":"pc1","event_src.rule":"technique_id=T1059.001,technique_name=PowerShell","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","generator.type":"logcollector","generator.version":"N26.2.3282","id":"PT_Microsoft_Windows_eventlog_Sysmon_1_Process_creation","importance":"info","input_id":"00000000-0000-0000-0000-000000000000","mime":"application/x-pt-eventlog","msgid":"1","normalized":true,"object":"process","object.account.domain":"pc1","object.account.id":"synthetic:arss@pc1","object.account.name":"arss","object.account.privileges":"High","object.account.session_id":"448867","object.process.cmdline":"\"C:\\Windows\\system32\\wbadmin.exe\" disable backup","object.process.cwd":"C:\\Windows\\system32\\","object.process.fullpath":"c:\\windows\\system32\\wbadmin.exe","object.process.guid":"ceed3963-c7e7-649f-6a02-000000001e00","object.process.hash.imphash":"D72A8A096458529EDF54E67F5F212651","object.process.hash.md5":"F2AA55885A2C014DA99F1355F3F71E4A","object.process.hash.sha1":"F5671266FBF3FFBC32CAA2C1EFFA1768893D0173","object.process.hash.sha256":"508E5F70C29502D7BA66A35959A327E3D658514496EE7B9155D95E7409EB4FB8","object.process.id":"836","object.process.meta":"Description:Command Line Interface for Microsoft® BLB Backup | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation","object.process.name":"wbadmin.exe","object.process.original_name":"WBADMIN.EXE","object.process.parent.cmdline":"\"C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\powershell.exe\"","object.process.parent.fullpath":"c:\\windows\\system32\\windowspowershell\\v1.0\\powershell.exe","object.process.parent.guid":"ceed3963-b783-649f-1201-000000001e00","object.process.parent.id":"4612","object.process.parent.name":"powershell.exe","object.process.parent.path":"c:\\windows\\system32\\windowspowershell\\v1.0\\","object.process.path":"c:\\windows\\system32\\","object.process.version":"10.0.19041.1202 (WinBuild.160101.0800)","recv_ipv4":"127.0.0.1","recv_time":"2023-07-01T06:31:20.519Z","status":"success","subject":"account","subject.account.domain":"pc1","subject.account.id":"synthetic:arss@pc1","subject.account.name":"arss","subject.account.privileges":"High","subject.account.session_id":"448867","tag":"some_tag","task_id":"00000000-0000-0000-0000-000000000000","taxonomy_version":"26.0.220-release-26.0","time":"2023-07-01T06:29:59.046Z","type":"raw","uuid":"29ca4047-8495-48ee-95c4-de85e1b1253b"}

expect 1 {"action":"create","alert.context":"arss run \"C:\\Windows\\system32\\wbadmin.exe\" disable backup via powershell.exe","alert.key":"\"C:\\Windows\\system32\\wbadmin.exe\" disable backup","category.generic":"Information Management","category.high":"Impact","category.low":"Inhibit System Recovery","correlation_name":"Wbadmin","correlation_type":"event","count":1,"datafield6":"ceed3963-b528-649f-63d9-060000000000","event_src.category":"Other","event_src.host":"pc1","event_src.hostname":"pc1","event_src.rule":"technique_id=T1059.001,technique_name=PowerShell","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","generator.type":"correlationengine","importance":"high","normalized":true,"object":"process","object.account.domain":"pc1","object.account.id":"synthetic:arss@pc1","object.account.name":"arss","object.account.privileges":"High","object.account.session_id":"448867","object.process.cmdline":"\"C:\\Windows\\system32\\wbadmin.exe\" disable backup","object.process.cwd":"C:\\Windows\\system32\\","object.process.fullpath":"c:\\windows\\system32\\wbadmin.exe","object.process.guid":"ceed3963-c7e7-649f-6a02-000000001e00","object.process.hash.md5":"F2AA55885A2C014DA99F1355F3F71E4A","object.process.hash.sha1":"F5671266FBF3FFBC32CAA2C1EFFA1768893D0173","object.process.hash.sha256":"508E5F70C29502D7BA66A35959A327E3D658514496EE7B9155D95E7409EB4FB8","object.process.id":"836","object.process.meta":"Description:Command Line Interface for Microsoft® BLB Backup | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation","object.process.name":"wbadmin.exe","object.process.original_name":"WBADMIN.EXE","object.process.parent.cmdline":"\"C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\powershell.exe\"","object.process.parent.fullpath":"c:\\windows\\system32\\windowspowershell\\v1.0\\powershell.exe","object.process.parent.id":"4612","object.process.parent.name":"powershell.exe","object.process.parent.path":"c:\\windows\\system32\\windowspowershell\\v1.0\\","object.process.path":"c:\\windows\\system32\\","object.process.version":"10.0.19041.1202 (WinBuild.160101.0800)","status":"success","subject":"account","subject.account.domain":"pc1","subject.account.id":"synthetic:arss@pc1","subject.account.name":"arss","subject.account.privileges":"High","subject.account.session_id":"448867"}