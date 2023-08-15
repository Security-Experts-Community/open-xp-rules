{"action": "start", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"1\",\"Version\":\"5\",\"Level\":\"4\",\"Task\":\"1\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2023-06-05T08:46:55.3985456Z\"},\"EventRecordID\":\"46944136\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"3448\",\"ThreadID\":\"4816\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"win10-work.stand2008.local\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\",\"text\":\"-\"},{\"Name\":\"UtcTime\",\"text\":\"2023-06-05 08:46:55.323\"},{\"Name\":\"ProcessGuid\",\"text\":\"{2b856446-a0ff-647d-4503-00000000ba00}\"},{\"Name\":\"ProcessId\",\"text\":\"2568\"},{\"Name\":\"Image\",\"text\":\"C:\\\\Windows\\\\System32\\\\VSSVC.exe\"},{\"Name\":\"FileVersion\",\"text\":\"10.0.19041.1741 (WinBuild.160101.0800)\"},{\"Name\":\"Description\",\"text\":\"Microsoft® Volume Shadow Copy Service\"},{\"Name\":\"Product\",\"text\":\"Microsoft® Windows® Operating System\"},{\"Name\":\"Company\",\"text\":\"Microsoft Corporation\"},{\"Name\":\"OriginalFileName\",\"text\":\"VSSVC.EXE\"},{\"Name\":\"CommandLine\",\"text\":\"C:\\\\Windows\\\\system32\\\\vssvc.exe\"},{\"Name\":\"CurrentDirectory\",\"text\":\"C:\\\\Windows\\\\system32\\\\\"},{\"Name\":\"User\",\"text\":\"NT AUTHORITY\\\\СИСТЕМА\"},{\"Name\":\"LogonGuid\",\"text\":\"{2b856446-79f9-647d-e703-000000000000}\"},{\"Name\":\"LogonId\",\"text\":\"0x3e7\"},{\"Name\":\"TerminalSessionId\",\"text\":\"0\"},{\"Name\":\"IntegrityLevel\",\"text\":\"System\"},{\"Name\":\"Hashes\",\"text\":\"MD5=875046AD4755396636A68F4A9EDB22A4,SHA256=82459B7D6CEEFF22E6E81CA445F9134C3EE917BDC3DF185700813F23AC7DB77E,IMPHASH=0BF1B64AF19D0AFACCB000F015F48095\"},{\"Name\":\"ParentProcessGuid\",\"text\":\"{2b856446-79f8-647d-0b00-00000000ba00}\"},{\"Name\":\"ParentProcessId\",\"text\":\"836\"},{\"Name\":\"ParentImage\",\"text\":\"C:\\\\Windows\\\\System32\\\\services.exe\"},{\"Name\":\"ParentCommandLine\",\"text\":\"C:\\\\Windows\\\\system32\\\\services.exe\"},{\"Name\":\"ParentUser\",\"text\":\"NT AUTHORITY\\\\СИСТЕМА\"}]}}}", "category.generic": "Process", "category.high": "Availability Management", "category.low": "Control", "datafield6": "2b856446-79f9-647d-e703-000000000000", "event_src.category": "Other", "event_src.fqdn": "win10-work.stand2008.local", "event_src.host": "win10-work.stand2008.local", "event_src.hostname": "win10-work", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_1_Process_creation", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "1", "normalized": true, "object": "process", "object.account.domain": "nt authority", "object.account.id": "synthetic:система@nt authority", "object.account.name": "система", "object.account.privileges": "System", "object.account.session_id": "999", "object.process.cmdline": "C:\\Windows\\system32\\vssvc.exe", "object.process.cwd": "C:\\Windows\\system32\\", "object.process.fullpath": "c:\\windows\\system32\\vssvc.exe", "object.process.guid": "2b856446-a0ff-647d-4503-00000000ba00", "object.process.hash.imphash": "0BF1B64AF19D0AFACCB000F015F48095", "object.process.hash.md5": "875046AD4755396636A68F4A9EDB22A4", "object.process.hash.sha256": "82459B7D6CEEFF22E6E81CA445F9134C3EE917BDC3DF185700813F23AC7DB77E", "object.process.id": "2568", "object.process.meta": "Description:Microsoft® Volume Shadow Copy Service | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation", "object.process.name": "vssvc.exe", "object.process.original_name": "VSSVC.EXE", "object.process.parent.cmdline": "C:\\Windows\\system32\\services.exe", "object.process.parent.fullpath": "c:\\windows\\system32\\services.exe", "object.process.parent.guid": "2b856446-79f8-647d-0b00-00000000ba00", "object.process.parent.id": "836", "object.process.parent.name": "services.exe", "object.process.parent.path": "c:\\windows\\system32\\", "object.process.path": "c:\\windows\\system32\\", "object.process.version": "10.0.19041.1741 (WinBuild.160101.0800)", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-05T09:52:59.463Z", "status": "success", "subject": "account", "subject.account.domain": "nt authority", "subject.account.id": "synthetic:система@nt authority", "subject.account.name": "система", "subject.account.privileges": "System", "subject.account.session_id": "999", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2023-06-05T08:46:55.323Z", "type": "raw", "uuid": "c26f2f41-0876-4ccc-87b1-367e5ffe3843"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 								{"action": "start", "category.generic": "Attack", "category.high": "Execution", "category.low": "System Services: Service Execution", "correlation_name": "VSSVC_service_state_changed", "correlation_type": "event", "event_src.fqdn": "win10-work.stand2008.local", "event_src.host": "win10-work.stand2008.local", "event_src.hostname": "win10-work", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "importance": "medium", "incident.aggregation.key": "VSSVC_service_state_changed|win10-work.stand2008.local", "incident.aggregation.timeout": 7200, "incident.category": "Undefined", "incident.severity": "medium", "object": "service", "object.account.domain": "nt authority", "object.account.id": "synthetic:система@nt authority", "object.account.name": "система", "object.account.session_id": "999", "object.process.cmdline": "C:\\Windows\\system32\\vssvc.exe", "object.process.cwd": "C:\\Windows\\system32\\", "object.process.fullpath": "c:\\windows\\system32\\vssvc.exe", "object.process.guid": "2b856446-a0ff-647d-4503-00000000ba00", "object.process.hash.md5": "875046AD4755396636A68F4A9EDB22A4", "object.process.hash.sha256": "82459B7D6CEEFF22E6E81CA445F9134C3EE917BDC3DF185700813F23AC7DB77E", "object.process.id": "2568", "object.process.meta": "Description:Microsoft® Volume Shadow Copy Service | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation", "object.process.name": "vssvc.exe", "object.process.original_name": "VSSVC.EXE", "object.process.parent.cmdline": "C:\\Windows\\system32\\services.exe", "object.process.parent.fullpath": "c:\\windows\\system32\\services.exe", "object.process.parent.guid": "2b856446-79f8-647d-0b00-00000000ba00", "object.process.parent.id": "836", "object.process.parent.name": "services.exe", "object.process.parent.path": "c:\\windows\\system32\\", "object.process.path": "c:\\windows\\system32\\", "object.process.version": "10.0.19041.1741 (WinBuild.160101.0800)", "reason": "|Service execution", "status": "success", "subject": "account", "subject.account.domain": "nt authority", "subject.account.id": "synthetic:система@nt authority", "subject.account.name": "система", "subject.account.privileges": "System", "subject.account.session_id": "999"}