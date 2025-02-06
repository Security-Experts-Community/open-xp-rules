{"action": "access", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Security-Auditing\",\"Guid\":\"{54849625-5478-4994-a5ba-3e3b0328c30d}\"},\"EventID\":\"4663\",\"Version\":\"0\",\"Level\":\"0\",\"Task\":\"12800\",\"Opcode\":\"0\",\"Keywords\":\"0x8020000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-04-27T19:31:15.3550630Z\"},\"EventRecordID\":\"4988\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"4\",\"ThreadID\":\"68\"},\"Channel\":\"Security\",\"Computer\":\"IEWIN7\",\"Security\":\"\"},\"EventData\":{\"Data\":[{\"Name\":\"SubjectUserSid\",\"text\":\"S-1-5-21-3583694148-1414552638-2922671848-1000\"},{\"Name\":\"SubjectUserName\",\"text\":\"IEUser\"},{\"Name\":\"SubjectDomainName\",\"text\":\"IEWIN7\"},{\"Name\":\"SubjectLogonId\",\"text\":\"0xffa8\"},{\"Name\":\"ObjectServer\",\"text\":\"Security\"},{\"Name\":\"ObjectType\",\"text\":\"File\"},{\"Name\":\"ObjectName\",\"text\":\"C:\\\\Users\\\\IEUser\\\\AppData\\\\Roaming\\\\Opera Software\\\\Opera Stable\\\\Login Data\"},{\"Name\":\"HandleId\",\"text\":\"0x50\"},{\"Name\":\"AccessList\",\"text\":\"%%4416\"},{\"Name\":\"AccessMask\",\"text\":\"0x1\"},{\"Name\":\"ProcessId\",\"text\":\"0x134c\"},{\"Name\":\"ProcessName\",\"text\":\"C:\\\\Users\\\\Defau1t\\\\wsus.exe\"}]}}}", "category.generic": "File System Object", "category.high": "System Management", "category.low": "Manipulation", "datafield1": "0x50", "datafield5": "0x1", "event_src.category": "Operating system", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Security", "event_src.title": "windows", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_4663_An_attempt_was_made_to_access_an_object", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "4663", "normalized": true, "object": "file_object", "object.fullpath": "c:\\users\\ieuser\\appdata\\roaming\\opera software\\opera stable\\login data", "object.name": "login data", "object.path": "c:\\users\\ieuser\\appdata\\roaming\\opera software\\opera stable\\", "object.property": "GrantedAccess", "object.type": "file", "object.value": "0x1", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-04T13:34:14.538Z", "status": "success", "subject": "account", "subject.account.domain": "iewin7", "subject.account.id": "S-1-5-21-3583694148-1414552638-2922671848-1000", "subject.account.name": "ieuser", "subject.account.privileges": "%%4416", "subject.account.session_id": "65448", "subject.process.fullpath": "C:\\Users\\Defau1t\\wsus.exe", "subject.process.id": "4940", "subject.process.name": "wsus.exe", "subject.process.path": "C:\\Users\\Defau1t\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-04-27T19:31:15.355Z", "type": "raw", "uuid": "eda762de-8d4c-48c4-b2ef-5d83de983989"}
{"action": "access", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Security-Auditing\",\"Guid\":\"{54849625-5478-4994-a5ba-3e3b0328c30d}\"},\"EventID\":\"4663\",\"Version\":\"0\",\"Level\":\"0\",\"Task\":\"12800\",\"Opcode\":\"0\",\"Keywords\":\"0x8020000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-04-27T19:33:05.3081880Z\"},\"EventRecordID\":\"4989\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"4\",\"ThreadID\":\"56\"},\"Channel\":\"Security\",\"Computer\":\"IEWIN7\",\"Security\":\"\"},\"EventData\":{\"Data\":[{\"Name\":\"SubjectUserSid\",\"text\":\"S-1-5-21-3583694148-1414552638-2922671848-1000\"},{\"Name\":\"SubjectUserName\",\"text\":\"IEUser\"},{\"Name\":\"SubjectDomainName\",\"text\":\"IEWIN7\"},{\"Name\":\"SubjectLogonId\",\"text\":\"0xffa8\"},{\"Name\":\"ObjectServer\",\"text\":\"Security\"},{\"Name\":\"ObjectType\",\"text\":\"File\"},{\"Name\":\"ObjectName\",\"text\":\"C:\\\\Users\\\\IEUser\\\\AppData\\\\Roaming\\\\Mozilla\\\\Firefox\\\\Profiles\\\\kushu3sd.default\\\\key4.db\"},{\"Name\":\"HandleId\",\"text\":\"0x50\"},{\"Name\":\"AccessList\",\"text\":\"%%4416\"},{\"Name\":\"AccessMask\",\"text\":\"0x1\"},{\"Name\":\"ProcessId\",\"text\":\"0x134c\"},{\"Name\":\"ProcessName\",\"text\":\"C:\\\\Users\\\\Defau1t\\\\wsus.exe\"}]}}}", "category.generic": "File System Object", "category.high": "System Management", "category.low": "Manipulation", "datafield1": "0x50", "datafield5": "0x1", "event_src.category": "Operating system", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Security", "event_src.title": "windows", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_4663_An_attempt_was_made_to_access_an_object", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "4663", "normalized": true, "object": "file_object", "object.fullpath": "c:\\users\\ieuser\\appdata\\roaming\\mozilla\\firefox\\profiles\\kushu3sd.default\\key4.db", "object.name": "key4.db", "object.path": "c:\\users\\ieuser\\appdata\\roaming\\mozilla\\firefox\\profiles\\kushu3sd.default\\", "object.property": "GrantedAccess", "object.type": "file", "object.value": "0x1", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-04T13:34:14.538Z", "status": "success", "subject": "account", "subject.account.domain": "iewin7", "subject.account.id": "S-1-5-21-3583694148-1414552638-2922671848-1000", "subject.account.name": "ieuser", "subject.account.privileges": "%%4416", "subject.account.session_id": "65448", "subject.process.fullpath": "C:\\Users\\Defau1t\\wsus.exe", "subject.process.id": "4940", "subject.process.name": "wsus.exe", "subject.process.path": "C:\\Users\\Defau1t\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-04-27T19:33:05.308Z", "type": "raw", "uuid": "98dd326b-88cf-48b9-8ba1-513fcee3c845"}
{"action": "access", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Security-Auditing\",\"Guid\":\"{54849625-5478-4994-a5ba-3e3b0328c30d}\"},\"EventID\":\"4663\",\"Version\":\"0\",\"Level\":\"0\",\"Task\":\"12800\",\"Opcode\":\"0\",\"Keywords\":\"0x8020000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-04-27T19:33:18.6997552Z\"},\"EventRecordID\":\"4990\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"4\",\"ThreadID\":\"56\"},\"Channel\":\"Security\",\"Computer\":\"IEWIN7\",\"Security\":\"\"},\"EventData\":{\"Data\":[{\"Name\":\"SubjectUserSid\",\"text\":\"S-1-5-21-3583694148-1414552638-2922671848-1000\"},{\"Name\":\"SubjectUserName\",\"text\":\"IEUser\"},{\"Name\":\"SubjectDomainName\",\"text\":\"IEWIN7\"},{\"Name\":\"SubjectLogonId\",\"text\":\"0xffa8\"},{\"Name\":\"ObjectServer\",\"text\":\"Security\"},{\"Name\":\"ObjectType\",\"text\":\"File\"},{\"Name\":\"ObjectName\",\"text\":\"C:\\\\Users\\\\IEUser\\\\AppData\\\\Roaming\\\\Mozilla\\\\Firefox\\\\Profiles\\\\kushu3sd.default\\\\logins.json\"},{\"Name\":\"HandleId\",\"text\":\"0x50\"},{\"Name\":\"AccessList\",\"text\":\"%%4416\"},{\"Name\":\"AccessMask\",\"text\":\"0x1\"},{\"Name\":\"ProcessId\",\"text\":\"0x134c\"},{\"Name\":\"ProcessName\",\"text\":\"C:\\\\Users\\\\Defau1t\\\\wsus.exe\"}]}}}", "category.generic": "File System Object", "category.high": "System Management", "category.low": "Manipulation", "datafield1": "0x50", "datafield5": "0x1", "event_src.category": "Operating system", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Security", "event_src.title": "windows", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_4663_An_attempt_was_made_to_access_an_object", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "4663", "normalized": true, "object": "file_object", "object.fullpath": "c:\\users\\ieuser\\appdata\\roaming\\mozilla\\firefox\\profiles\\kushu3sd.default\\logins.json", "object.name": "logins.json", "object.path": "c:\\users\\ieuser\\appdata\\roaming\\mozilla\\firefox\\profiles\\kushu3sd.default\\", "object.property": "GrantedAccess", "object.type": "file", "object.value": "0x1", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-04T13:34:14.538Z", "status": "success", "subject": "account", "subject.account.domain": "iewin7", "subject.account.id": "S-1-5-21-3583694148-1414552638-2922671848-1000", "subject.account.name": "ieuser", "subject.account.privileges": "%%4416", "subject.account.session_id": "65448", "subject.process.fullpath": "C:\\Users\\Defau1t\\wsus.exe", "subject.process.id": "4940", "subject.process.name": "wsus.exe", "subject.process.path": "C:\\Users\\Defau1t\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-04-27T19:33:18.699Z", "type": "raw", "uuid": "66323e2c-df36-488d-8914-e739970cd231"}
{"action": "access", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Security-Auditing\",\"Guid\":\"{54849625-5478-4994-a5ba-3e3b0328c30d}\"},\"EventID\":\"4663\",\"Version\":\"0\",\"Level\":\"0\",\"Task\":\"12800\",\"Opcode\":\"0\",\"Keywords\":\"0x8020000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-04-27T19:33:50.1342936Z\"},\"EventRecordID\":\"4991\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"4\",\"ThreadID\":\"44\"},\"Channel\":\"Security\",\"Computer\":\"IEWIN7\",\"Security\":\"\"},\"EventData\":{\"Data\":[{\"Name\":\"SubjectUserSid\",\"text\":\"S-1-5-21-3583694148-1414552638-2922671848-1000\"},{\"Name\":\"SubjectUserName\",\"text\":\"IEUser\"},{\"Name\":\"SubjectDomainName\",\"text\":\"IEWIN7\"},{\"Name\":\"SubjectLogonId\",\"text\":\"0xffa8\"},{\"Name\":\"ObjectServer\",\"text\":\"Security\"},{\"Name\":\"ObjectType\",\"text\":\"File\"},{\"Name\":\"ObjectName\",\"text\":\"C:\\\\Users\\\\IEUser\\\\AppData\\\\Local\\\\Google\\\\Chrome\\\\User Data\\\\Default\\\\Login Data\"},{\"Name\":\"HandleId\",\"text\":\"0x50\"},{\"Name\":\"AccessList\",\"text\":\"%%4416\"},{\"Name\":\"AccessMask\",\"text\":\"0x1\"},{\"Name\":\"ProcessId\",\"text\":\"0x134c\"},{\"Name\":\"ProcessName\",\"text\":\"C:\\\\Users\\\\Defau1t\\\\wsus.exe\"}]}}}", "category.generic": "File System Object", "category.high": "System Management", "category.low": "Manipulation", "datafield1": "0x50", "datafield5": "0x1", "event_src.category": "Operating system", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Security", "event_src.title": "windows", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_4663_An_attempt_was_made_to_access_an_object", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "4663", "normalized": true, "object": "file_object", "object.fullpath": "c:\\users\\ieuser\\appdata\\local\\google\\chrome\\user data\\default\\login data", "object.name": "login data", "object.path": "c:\\users\\ieuser\\appdata\\local\\google\\chrome\\user data\\default\\", "object.property": "GrantedAccess", "object.type": "file", "object.value": "0x1", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-04T13:34:14.538Z", "status": "success", "subject": "account", "subject.account.domain": "iewin7", "subject.account.id": "S-1-5-21-3583694148-1414552638-2922671848-1000", "subject.account.name": "ieuser", "subject.account.privileges": "%%4416", "subject.account.session_id": "65448", "subject.process.fullpath": "C:\\Users\\Defau1t\\wsus.exe", "subject.process.id": "4940", "subject.process.name": "wsus.exe", "subject.process.path": "C:\\Users\\Defau1t\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-04-27T19:33:50.134Z", "type": "raw", "uuid": "bed7249b-e9ad-4925-ac6d-1dfa9cf3582e"}

expect 4 {"action":"read","category.generic":"Attack","category.high":"Credential Access","category.low":"Credentials from Password Stores","correlation_name":"Chrome_firefox_opera_cred_read","correlation_type":"incident","event_src.category":"Operating system","event_src.host":"iewin7","event_src.hostname":"iewin7","event_src.subsys":"Security","event_src.title":"windows","event_src.vendor":"microsoft","generator.type":null,"importance":"medium","object":"file","object.property":"GrantedAccess","object.type":"file","object.value":"0x1","status":"success","subject":"account","subject.account.domain":"iewin7","subject.account.id":"S-1-5-21-3583694148-1414552638-2922671848-1000","subject.account.name":"ieuser","subject.account.privileges":"%%4416","subject.account.session_id":"65448","subject.process.fullpath":"C:\\Users\\Defau1t\\wsus.exe","subject.process.id":"4940","subject.process.name":"wsus.exe","subject.process.path":"C:\\Users\\Defau1t\\"}