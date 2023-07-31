{"action": "view", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Security-Auditing\",\"Guid\":\"{54849625-5478-4994-a5ba-3e3b0328c30d}\"},\"EventID\":\"4799\",\"Version\":\"0\",\"Level\":\"0\",\"Task\":\"13826\",\"Opcode\":\"0\",\"Keywords\":\"0x8020000000000000\",\"TimeCreated\":{\"SystemTime\":\"2023-01-24T11:52:02.1550291Z\"},\"EventRecordID\":\"3819707\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"724\",\"ThreadID\":\"10848\"},\"Channel\":\"Security\",\"Computer\":\"01566s-win16-ir.threebeesco.com\",\"Security\":\"\"},\"EventData\":{\"Data\":[{\"Name\":\"TargetUserName\",\"text\":\"Administrators\"},{\"Name\":\"TargetDomainName\",\"text\":\"Builtin\"},{\"Name\":\"TargetSid\",\"text\":\"S-1-5-32-544\"},{\"Name\":\"SubjectUserSid\",\"text\":\"S-1-5-21-308926384-506822093-3341789130-1105\"},{\"Name\":\"SubjectUserName\",\"text\":\"jbrown\"},{\"Name\":\"SubjectDomainName\",\"text\":\"3B\"},{\"Name\":\"SubjectLogonId\",\"text\":\"0x23ec715\"},{\"Name\":\"CallerProcessId\",\"text\":\"0x23e8\"},{\"Name\":\"CallerProcessName\",\"text\":\"C:\\\\Windows\\\\System32\\\\net1.exe\"}]}}}", "category.generic": "Group", "category.high": "Users And Rights Management", "category.low": "Manipulation", "datafield1": "37668629", "datafield2": "9192", "datafield3": "C:\\Windows\\System32\\net1.exe", "datafield4": "net1.exe", "event_src.category": "Operating system", "event_src.fqdn": "01566s-win16-ir.threebeesco.com", "event_src.host": "01566s-win16-ir.threebeesco.com", "event_src.hostname": "01566s-win16-ir", "event_src.subsys": "Security", "event_src.title": "windows", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_4799_Process_enumerates_members_of_security_enabled", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "4799", "normalized": true, "object": "user_group", "object.id": "S-1-5-32-544", "object.name": "Administrators", "object.type": "local security-enabled", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-03T20:50:51.126Z", "status": "success", "subject": "account", "subject.account.domain": "3b", "subject.account.id": "S-1-5-21-308926384-506822093-3341789130-1105", "subject.account.name": "jbrown", "subject.account.session_id": "37668629", "subject.domain": "3b", "subject.id": "S-1-5-21-308926384-506822093-3341789130-1105", "subject.name": "jbrown", "subject.process.fullpath": "C:\\Windows\\System32\\net1.exe", "subject.process.id": "9192", "subject.process.name": "net1.exe", "subject.process.path": "C:\\Windows\\System32\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2023-01-24T11:52:02.155Z", "type": "raw", "uuid": "f5e7e0ce-4a0d-455c-a500-699b039bcdbd"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 	{"action": "read", "alert.context": "3b\\jbrown enumed local group Administrators on 01566s-win16-ir.threebeesco.com", "alert.key": "Administrators", "category.generic": "Attack", "category.high": "Discovery", "category.low": "Account Discovery", "correlation_name": "Local_Groups_Enumeration_Discovery", "correlation_type": "event", "event_src.category": "Operating system", "event_src.host": "01566s-win16-ir.threebeesco.com", "event_src.hostname": "01566s-win16-ir", "event_src.subsys": "Security", "event_src.title": "windows", "event_src.vendor": "microsoft", "importance": "low", "object": "user_group", "object.name": "Administrators", "object.type": "local security-enabled", "status": "success", "subject": "account", "subject.account.domain": "3b", "subject.account.id": "S-1-5-21-308926384-506822093-3341789130-1105", "subject.account.name": "jbrown", "subject.account.session_id": "37668629", "subject.process.fullpath": "C:\\Windows\\System32\\net1.exe", "subject.process.id": "9192", "subject.process.name": "net1.exe", "subject.process.path": "C:\\Windows\\System32\\"}
