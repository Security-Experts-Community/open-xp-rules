{"action": "modify", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Security-Auditing\",\"Guid\":\"{54849625-5478-4994-a5ba-3e3b0328c30d}\"},\"EventID\":\"4703\",\"Version\":\"0\",\"Level\":\"0\",\"Task\":\"13317\",\"Opcode\":\"0\",\"Keywords\":\"0x8020000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-08-14T12:48:15.9215075Z\"},\"EventRecordID\":\"11983\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"4\",\"ThreadID\":\"248\"},\"Channel\":\"Security\",\"Computer\":\"MSEDGEWIN10\",\"Security\":\"\"},\"EventData\":{\"Data\":[{\"Name\":\"SubjectUserSid\",\"text\":\"S-1-5-21-3461203602-4096304019-2269080069-1000\"},{\"Name\":\"SubjectUserName\",\"text\":\"IEUser\"},{\"Name\":\"SubjectDomainName\",\"text\":\"MSEDGEWIN10\"},{\"Name\":\"SubjectLogonId\",\"text\":\"0x342ba\"},{\"Name\":\"TargetUserSid\",\"text\":\"S-1-5-21-3461203602-4096304019-2269080069-1000\"},{\"Name\":\"TargetUserName\",\"text\":\"IEUser\"},{\"Name\":\"TargetDomainName\",\"text\":\"MSEDGEWIN10\"},{\"Name\":\"TargetLogonId\",\"text\":\"0x342ba\"},{\"Name\":\"ProcessName\",\"text\":\"C:\\\\Users\\\\IEUser\\\\Desktop\\\\x64\\\\mimikatz.exe\"},{\"Name\":\"ProcessId\",\"text\":\"0x8fc\"},{\"Name\":\"EnabledPrivilegeList\",\"text\":\"SeDebugPrivilege\"},{\"Name\":\"DisabledPrivilegeList\",\"text\":\"-\"}]}}}", "datafield5": "-", "event_src.category": "Operating system", "event_src.fqdn": "msedgewin10", "event_src.host": "msedgewin10", "event_src.hostname": "msedgewin10", "event_src.subsys": "Security", "event_src.title": "windows", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_4703_A_user_right_was_adjusted", "importance": "medium", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "4703", "normalized": true, "object": "account", "object.account.domain": "msedgewin10", "object.account.name": "ieuser", "object.account.session_id": "213690", "object.property": "privileges", "object.value": "SeDebugPrivilege", "reason": "Privileges assigned", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-01T17:21:48.817Z", "status": "success", "subject": "account", "subject.account.domain": "msedgewin10", "subject.account.id": "s-1-5-21-3461203602-4096304019-2269080069-1000", "subject.account.name": "ieuser", "subject.account.session_id": "213690", "subject.process.fullpath": "C:\\Users\\IEUser\\Desktop\\x64\\mimikatz.exe", "subject.process.id": "2300", "subject.process.name": "mimikatz.exe", "subject.process.path": "C:\\Users\\IEUser\\Desktop\\x64\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-08-14T12:48:15.921Z", "type": "raw", "uuid": "348f1f5a-63b3-46ff-91d6-8de50a734d4e"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 {"action": "modify", "category.generic": "Privilege Escalation", "category.high": "Access Token Manipulation", "category.low": "Adjust Token Privileges", "correlation_name": "SeDebugPrivilege_Enabled", "correlation_type": "incident", "event_src.fqdn": "msedgewin10", "event_src.host": "msedgewin10", "event_src.hostname": "msedgewin10", "event_src.subsys": "Security", "event_src.title": "windows", "event_src.vendor": "microsoft", "importance": "medium", "object": "account", "object.account.domain": "msedgewin10", "object.account.name": "ieuser", "object.account.session_id": "213690", "object.property": "privileges", "object.value": "SeDebugPrivilege", "status": "success", "subject": "process", "subject.account.domain": "msedgewin10", "subject.account.id": "s-1-5-21-3461203602-4096304019-2269080069-1000", "subject.account.name": "ieuser", "subject.account.session_id": "213690", "subject.process.fullpath": "C:\\Users\\IEUser\\Desktop\\x64\\mimikatz.exe", "subject.process.id": "2300", "subject.process.name": "mimikatz.exe", "subject.process.path": "C:\\Users\\IEUser\\Desktop\\x64\\"}