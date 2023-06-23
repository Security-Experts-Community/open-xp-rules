{"action": "start", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"7\",\"Version\":\"3\",\"Level\":\"4\",\"Task\":\"7\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2020-10-13T20:11:42.2692242Z\"},\"EventRecordID\":\"2196441\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"5340\",\"ThreadID\":\"7092\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"LAPTOP-JU4M3I0E\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\"},{\"Name\":\"UtcTime\",\"text\":\"2020-10-13 20:11:42.268\"},{\"Name\":\"ProcessGuid\",\"text\":\"{00247c92-09fe-5f86-0000-001051841401}\"},{\"Name\":\"ProcessId\",\"text\":\"1716\"},{\"Name\":\"Image\",\"text\":\"C:\\\\Windows\\\\System32\\\\wuauclt.exe\"},{\"Name\":\"ImageLoaded\",\"text\":\"C:\\\\ProgramData\\\\Intel\\\\helpa.dll\"},{\"Name\":\"FileVersion\",\"text\":\"?\"},{\"Name\":\"Description\",\"text\":\"?\"},{\"Name\":\"Product\",\"text\":\"?\"},{\"Name\":\"Company\",\"text\":\"?\"},{\"Name\":\"OriginalFileName\",\"text\":\"?\"},{\"Name\":\"Hashes\",\"text\":\"SHA1=AF7687063F8EE1C8FD57D1A5FE6FA4F28A53C434,MD5=6AB43126243BE72FF7D446D5A496AA76,SHA256=56C5AFF6AC04BDF86EDBC4F0D0F9581F250A4C97DD60FD1179F153AC20230920,IMPHASH=8DEF796746DD54062D5B3186EEF39356\"},{\"Name\":\"Signed\",\"text\":\"false\"},{\"Name\":\"Signature\"},{\"Name\":\"SignatureStatus\",\"text\":\"Unavailable\"}]}}}", "category.generic": "Executable Module", "category.high": "Availability Management", "category.low": "Control", "event_src.category": "Other", "event_src.fqdn": "laptop-ju4m3i0e", "event_src.host": "laptop-ju4m3i0e", "event_src.hostname": "laptop-ju4m3i0e", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_7_Image_loaded", "importance": "low", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "7", "normalized": true, "object": "module", "object.process.fullpath": "c:\\programdata\\intel\\helpa.dll", "object.process.hash.imphash": "8DEF796746DD54062D5B3186EEF39356", "object.process.hash.md5": "6AB43126243BE72FF7D446D5A496AA76", "object.process.hash.sha1": "AF7687063F8EE1C8FD57D1A5FE6FA4F28A53C434", "object.process.hash.sha256": "56C5AFF6AC04BDF86EDBC4F0D0F9581F250A4C97DD60FD1179F153AC20230920", "object.process.meta": "Description:? | Product:? | Company:?", "object.process.name": "helpa.dll", "object.process.original_name": "?", "object.process.path": "c:\\programdata\\intel\\", "object.property": "signature status", "object.value": "not signed", "object.version": "?", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-12T13:57:45.353Z", "status": "success", "subject": "process", "subject.process.fullpath": "c:\\windows\\system32\\wuauclt.exe", "subject.process.guid": "00247c92-09fe-5f86-0000-001051841401", "subject.process.id": "1716", "subject.process.name": "wuauclt.exe", "subject.process.path": "c:\\windows\\system32\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2020-10-13T20:11:42.268Z", "type": "raw", "uuid": "0d97b86b-f82b-4c18-8d42-4c0ca5771038"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 {"action": "start", "alert.key": "c:\\programdata\\intel\\helpa.dll", "category.generic": "Attack", "category.high": "Execution", "category.low": "System Binary Proxy Execution", "correlation_name": "Detect_execution_imageload_wuauclt_lolbas", "correlation_type": "incident", "event_src.category": "Other", "event_src.fqdn": "laptop-ju4m3i0e", "event_src.host": "laptop-ju4m3i0e", "event_src.hostname": "laptop-ju4m3i0e", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "correlationengine", "importance": "high", "incident.aggregation.key": "Detect_execution_imageload_wuauclt_lolbas|laptop-ju4m3i0e||c:\\programdata\\intel\\helpa.dll", "incident.aggregation.timeout": 7200, "incident.category": "Undefined", "incident.severity": "high", "object": "module", "object.process.fullpath": "c:\\programdata\\intel\\helpa.dll", "object.process.meta": "Description:? | Product:? | Company:?", "object.process.name": "helpa.dll", "object.process.original_name": "?", "object.process.path": "c:\\programdata\\intel\\", "object.property": "signature status", "object.value": "not signed", "object.version": "?", "status": "success", "subject": "process", "subject.process.fullpath": "c:\\windows\\system32\\wuauclt.exe", "subject.process.guid": "00247c92-09fe-5f86-0000-001051841401", "subject.process.id": "1716", "subject.process.name": "wuauclt.exe", "subject.process.path": "c:\\windows\\system32\\"}