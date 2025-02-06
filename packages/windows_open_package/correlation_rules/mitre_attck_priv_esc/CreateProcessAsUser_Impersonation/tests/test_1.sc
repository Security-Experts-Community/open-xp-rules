{"action": "elevate", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Security-Auditing\",\"Guid\":\"{54849625-5478-4994-a5ba-3e3b0328c30d}\"},\"EventID\":\"4624\",\"Version\":\"2\",\"Level\":\"0\",\"Task\":\"12544\",\"Opcode\":\"0\",\"Keywords\":\"0x8020000000000000\",\"TimeCreated\":{\"SystemTime\":\"2020-09-15T18:04:39.9871239Z\"},\"EventRecordID\":\"161473\",\"Correlation\":{\"ActivityID\":\"{c5412e82-8bc5-0000-0a2f-41c5c58bd601}\"},\"Execution\":{\"ProcessID\":\"644\",\"ThreadID\":\"5436\"},\"Channel\":\"Security\",\"Computer\":\"MSEDGEWIN10\",\"Security\":\"\"},\"EventData\":{\"Data\":[{\"Name\":\"SubjectUserSid\",\"text\":\"S-1-5-21-3461203602-4096304019-2269080069-1009\"},{\"Name\":\"SubjectUserName\",\"text\":\"svc01\"},{\"Name\":\"SubjectDomainName\",\"text\":\"MSEDGEWIN10\"},{\"Name\":\"SubjectLogonId\",\"text\":\"0x10b6b3\"},{\"Name\":\"TargetUserSid\",\"text\":\"S-1-5-21-3461203602-4096304019-2269080069-1000\"},{\"Name\":\"TargetUserName\",\"text\":\"IEUser\"},{\"Name\":\"TargetDomainName\",\"text\":\"MSEDGEWIN10\"},{\"Name\":\"TargetLogonId\",\"text\":\"0x22afa1\"},{\"Name\":\"LogonType\",\"text\":\"3\"},{\"Name\":\"LogonProcessName\",\"text\":\"Advapi\"},{\"Name\":\"AuthenticationPackageName\",\"text\":\"MICROSOFT_AUTHENTICATION_PACKAGE_V1_0\"},{\"Name\":\"WorkstationName\",\"text\":\"MSEDGEWIN10\"},{\"Name\":\"LogonGuid\",\"text\":\"{00000000-0000-0000-0000-000000000000}\"},{\"Name\":\"TransmittedServices\",\"text\":\"-\"},{\"Name\":\"LmPackageName\",\"text\":\"-\"},{\"Name\":\"KeyLength\",\"text\":\"0\"},{\"Name\":\"ProcessId\",\"text\":\"0x140c\"},{\"Name\":\"ProcessName\",\"text\":\"C:\\\\Windows\\\\System32\\\\inetsrv\\\\w3wp.exe\"},{\"Name\":\"IpAddress\",\"text\":\"-\"},{\"Name\":\"IpPort\",\"text\":\"-\"},{\"Name\":\"ImpersonationLevel\",\"text\":\"%%1833\"},{\"Name\":\"RestrictedAdminMode\",\"text\":\"-\"},{\"Name\":\"TargetOutboundUserName\",\"text\":\"-\"},{\"Name\":\"TargetOutboundDomainName\",\"text\":\"-\"},{\"Name\":\"VirtualAccount\",\"text\":\"%%1843\"},{\"Name\":\"TargetLinkedLogonId\",\"text\":\"0x0\"},{\"Name\":\"ElevatedToken\",\"text\":\"%%1842\"}]}}}", "category.generic": "Account", "category.high": "Users And Rights Management", "category.low": "Manipulation", "chain_id": "c5412e82-8bc5-0000-0a2f-41c5c58bd601", "datafield6": "Network", "datafield9": "MICROSOFT_AUTHENTICATION_PACKAGE_V1_0", "dst.host": "msedgewin10", "dst.hostname": "msedgewin10", "event_src.category": "AAA", "event_src.fqdn": "msedgewin10", "event_src.host": "msedgewin10", "event_src.hostname": "msedgewin10", "event_src.subsys": "Security", "event_src.title": "windows", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_4624_An_account_was_successfully_logged_on", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "logon_auth_method": "remote", "logon_service": "Advapi", "logon_type": 3, "mime": "application/x-pt-eventlog", "msgid": "4624", "normalized": true, "object": "account", "object.account.domain": "msedgewin10", "object.account.id": "S-1-5-21-3461203602-4096304019-2269080069-1000", "object.account.name": "ieuser", "object.account.session_id": "2273185", "object.property": "session ID with ElevatedToken", "object.value": "0", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-07T10:55:20.773Z", "status": "success", "subject": "account", "subject.account.domain": "msedgewin10", "subject.account.id": "S-1-5-21-3461203602-4096304019-2269080069-1009", "subject.account.name": "svc01", "subject.account.privileges": "local administrator rights", "subject.account.session_id": "1095347", "subject.process.fullpath": "c:\\windows\\system32\\inetsrv\\w3wp.exe", "subject.process.id": "5132", "subject.process.name": "w3wp.exe", "subject.process.path": "c:\\windows\\system32\\inetsrv\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2020-09-15T18:04:39.987Z", "type": "raw", "uuid": "829ce377-a5ed-431e-b00b-142f8a299ee5"}
{"action": "elevate", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Security-Auditing\",\"Guid\":\"{54849625-5478-4994-a5ba-3e3b0328c30d}\"},\"EventID\":\"4648\",\"Version\":\"0\",\"Level\":\"0\",\"Task\":\"12544\",\"Opcode\":\"0\",\"Keywords\":\"0x8020000000000000\",\"TimeCreated\":{\"SystemTime\":\"2020-09-15T18:04:39.9870522Z\"},\"EventRecordID\":\"161472\",\"Correlation\":{\"ActivityID\":\"{c5412e82-8bc5-0000-0a2f-41c5c58bd601}\"},\"Execution\":{\"ProcessID\":\"644\",\"ThreadID\":\"5436\"},\"Channel\":\"Security\",\"Computer\":\"MSEDGEWIN10\",\"Security\":\"\"},\"EventData\":{\"Data\":[{\"Name\":\"SubjectUserSid\",\"text\":\"S-1-5-21-3461203602-4096304019-2269080069-1009\"},{\"Name\":\"SubjectUserName\",\"text\":\"svc01\"},{\"Name\":\"SubjectDomainName\",\"text\":\"MSEDGEWIN10\"},{\"Name\":\"SubjectLogonId\",\"text\":\"0x10b6b3\"},{\"Name\":\"LogonGuid\",\"text\":\"{00000000-0000-0000-0000-000000000000}\"},{\"Name\":\"TargetUserName\",\"text\":\"IEUser\"},{\"Name\":\"TargetDomainName\",\"text\":\"MSEDGEWIN10\"},{\"Name\":\"TargetLogonGuid\",\"text\":\"{00000000-0000-0000-0000-000000000000}\"},{\"Name\":\"TargetServerName\",\"text\":\"localhost\"},{\"Name\":\"TargetInfo\",\"text\":\"localhost\"},{\"Name\":\"ProcessId\",\"text\":\"0x140c\"},{\"Name\":\"ProcessName\",\"text\":\"C:\\\\Windows\\\\System32\\\\inetsrv\\\\w3wp.exe\"},{\"Name\":\"IpAddress\",\"text\":\"-\"},{\"Name\":\"IpPort\",\"text\":\"-\"}]}}}", "category.generic": "Account", "category.high": "Users And Rights Management", "category.low": "Manipulation", "datafield6": "00000000-0000-0000-0000-000000000000", "datafield8": "00000000-0000-0000-0000-000000000000", "dst.host": "localhost", "dst.hostname": "localhost", "event_src.category": "AAA", "event_src.fqdn": "msedgewin10", "event_src.host": "msedgewin10", "event_src.hostname": "msedgewin10", "event_src.subsys": "Security", "event_src.title": "windows", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_4648_A_logon_was_attempted_using_explicit_credentials", "importance": "medium", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "4648", "normalized": true, "object": "account", "object.account.domain": "msedgewin10", "object.account.name": "ieuser", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-07T10:55:20.776Z", "status": "success", "subject": "account", "subject.account.domain": "msedgewin10", "subject.account.id": "S-1-5-21-3461203602-4096304019-2269080069-1009", "subject.account.name": "svc01", "subject.account.session_id": "1095347", "subject.process.fullpath": "c:\\windows\\system32\\inetsrv\\w3wp.exe", "subject.process.id": "5132", "subject.process.name": "w3wp.exe", "subject.process.path": "c:\\windows\\system32\\inetsrv\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2020-09-15T18:04:39.987Z", "type": "raw", "uuid": "1a7d57e9-6488-4c0d-aca8-b2ac3e619852"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 								{"action": "elevate", "category.generic": "Attack", "category.high": "Privilege Escalation", "category.low": "Access Token Manipulation: Token Impersonation/Theft", "correlation_name": "CreateProcessAsUser_Impersonation", "correlation_type": "incident", "datafield9": "MICROSOFT_AUTHENTICATION_PACKAGE_V1_0", "dst.host": "localhost", "dst.hostname": "localhost", "event_src.category": "AAA", "event_src.fqdn": "msedgewin10", "event_src.host": "msedgewin10", "event_src.hostname": "msedgewin10", "event_src.subsys": "Security", "event_src.title": "windows", "event_src.vendor": "microsoft", "importance": "medium", "incident.aggregation.key": "CreateProcessAsUser_Impersonation|msedgewin10|svc01|5132|ieuser", "incident.aggregation.timeout": 7200, "incident.category": "Undefined", "incident.severity": "medium", "logon_auth_method": "remote", "logon_service": "Advapi", "logon_type": 3, "object": "account", "object.account.domain": "msedgewin10", "object.account.id": "S-1-5-21-3461203602-4096304019-2269080069-1000", "object.account.name": "ieuser", "object.account.session_id": "2273185", "status": "success", "subject": "account", "subject.account.domain": "msedgewin10", "subject.account.id": "S-1-5-21-3461203602-4096304019-2269080069-1009", "subject.account.name": "svc01", "subject.account.privileges": "local administrator rights", "subject.account.session_id": "1095347", "subject.process.fullpath": "c:\\windows\\system32\\inetsrv\\w3wp.exe", "subject.process.id": "5132", "subject.process.name": "w3wp.exe", "subject.process.path": "c:\\windows\\system32\\inetsrv\\"}
