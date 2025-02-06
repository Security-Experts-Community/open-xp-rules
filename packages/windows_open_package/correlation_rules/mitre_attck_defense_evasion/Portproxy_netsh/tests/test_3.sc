{"action": "create", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Security-Auditing\",\"Guid\":\"{54849625-5478-4994-a5ba-3e3b0328c30d}\"},\"EventID\":\"4657\",\"Version\":\"0\",\"Level\":\"0\",\"Task\":\"12801\",\"Opcode\":\"0\",\"Keywords\":\"0x8020000000000000\",\"TimeCreated\":{\"SystemTime\":\"2023-06-03T09:35:26.2279148Z\"},\"EventRecordID\":\"97027\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"4\",\"ThreadID\":\"6900\"},\"Channel\":\"Security\",\"Computer\":\"pc1.lab.local\",\"Security\":\"\"},\"EventData\":{\"Data\":[{\"Name\":\"SubjectUserSid\",\"text\":\"S-1-5-21-1840087645-2506612525-4240436938-1000\"},{\"Name\":\"SubjectUserName\",\"text\":\"admin\"},{\"Name\":\"SubjectDomainName\",\"text\":\"LAB\"},{\"Name\":\"SubjectLogonId\",\"text\":\"0x520de\"},{\"Name\":\"ObjectName\",\"text\":\"\\\\REGISTRY\\\\MACHINE\\\\SYSTEM\\\\ControlSet001\\\\Services\\\\PortProxy\\\\v4tov4\\\\tcp\"},{\"Name\":\"ObjectValueName\",\"text\":\"0.0.0.0/8882\"},{\"Name\":\"HandleId\",\"text\":\"0x4a0\"},{\"Name\":\"OperationType\",\"text\":\"%%1904\"},{\"Name\":\"OldValueType\",\"text\":\"-\"},{\"Name\":\"OldValue\",\"text\":\"-\"},{\"Name\":\"NewValueType\",\"text\":\"%%1873\"},{\"Name\":\"NewValue\",\"text\":\"0.0.0.0/3382\"},{\"Name\":\"ProcessId\",\"text\":\"0xd00\"},{\"Name\":\"ProcessName\",\"text\":\"C:\\\\Windows\\\\System32\\\\netsh.exe\"}]}}}", "category.generic": "Registry Object", "category.high": "System Management", "category.low": "Manipulation", "event_src.category": "Operating system", "event_src.fqdn": "pc1.lab.local", "event_src.host": "pc1.lab.local", "event_src.hostname": "pc1", "event_src.subsys": "Security", "event_src.title": "windows", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_4657_Registry_value_changed", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "4657", "normalized": true, "object": "reg_object", "object.fullpath": "\\registry\\machine\\system\\controlset001\\services\\portproxy\\v4tov4\\tcp\\0.0.0.0/8882", "object.name": "0.0.0.0/8882", "object.new_value": "0.0.0.0/3382", "object.path": "\\registry\\machine\\system\\controlset001\\services\\portproxy\\v4tov4\\tcp", "object.property": "value", "object.value": "-", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-03T09:36:06.739Z", "status": "success", "subject": "account", "subject.account.domain": "lab", "subject.account.id": "S-1-5-21-1840087645-2506612525-4240436938-1000", "subject.account.name": "admin", "subject.account.session_id": "336094", "subject.process.fullpath": "C:\\Windows\\System32\\netsh.exe", "subject.process.name": "netsh.exe", "subject.process.path": "C:\\Windows\\System32\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2023-06-03T09:35:26.227Z", "type": "raw", "uuid": "246f60fe-90f0-472d-a419-9284174bdeb1"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 								{"action": "create", "alert.context": "C:\\Windows\\System32\\netsh.exe 0.0.0.0/8882->0.0.0.0/3382", "alert.key": "0.0.0.0/8882->0.0.0.0/3382", "category.generic": "Attack", "category.high": "Command and Control", "category.low": "Proxy", "correlation_name": "Portproxy_netsh", "correlation_type": "incident", "event_src.category": "Operating system", "event_src.host": "pc1.lab.local", "event_src.hostname": "pc1", "event_src.subsys": "Security", "event_src.title": "windows", "event_src.vendor": "microsoft", "importance": "medium", "incident.aggregation.key": "Portproxy_netsh|pc1.lab.local", "incident.aggregation.timeout": 7200, "incident.category": "Undefined", "incident.severity": "medium", "object": "reg_object", "object.fullpath": "\\registry\\machine\\system\\controlset001\\services\\portproxy\\v4tov4\\tcp\\0.0.0.0/8882", "object.name": "0.0.0.0/8882", "object.new_value": "0.0.0.0/3382", "object.path": "\\registry\\machine\\system\\controlset001\\services\\portproxy\\v4tov4\\tcp", "object.property": "value", "object.value": "-", "status": "success", "subject.account.domain": "lab", "subject.account.id": "S-1-5-21-1840087645-2506612525-4240436938-1000", "subject.account.name": "admin", "subject.account.session_id": "336094", "subject.process.fullpath": "C:\\Windows\\System32\\netsh.exe", "subject.process.name": "netsh.exe", "subject.process.path": "C:\\Windows\\System32\\"}
