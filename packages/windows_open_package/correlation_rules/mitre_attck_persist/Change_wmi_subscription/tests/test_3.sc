{"action": "modify", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"19\",\"Version\":\"3\",\"Level\":\"4\",\"Task\":\"19\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-05-11 17:58:39.746908\"},\"EventRecordID\":\"16115\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"2032\",\"ThreadID\":\"4092\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"IEWIN7\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\"},{\"Name\":\"EventType\",\"text\":\"WmiFilterEvent\"},{\"Name\":\"UtcTime\",\"text\":\"2019-05-11 17:58:39.746\"},{\"Name\":\"Operation\",\"text\":\"Created\"},{\"Name\":\"User\",\"text\":\"IEWIN7\\\\IEUser\"},{\"Name\":\"EventNamespace\",\"text\":\"\\\"root\\\\\\\\cimv2\\\"\"},{\"Name\":\"Name\",\"text\":\"\\\"BotFilter82\\\"\"},{\"Name\":\"Query\",\"text\":\"\\\"SELECT * FROM __InstanceModificationEvent WITHIN 10 WHERE TargetInstance ISA 'Win32_PerfFormattedData_PerfOS_System'\\\"\"}]}}}", "event_src.category": "Other", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_19_WMI_event_filter_activity_detected", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "19", "normalized": true, "object": "resource", "object.fullpath": "root\\\\cimv2\\BotFilter82", "object.name": "BotFilter82", "object.path": "root\\\\cimv2", "object.query": "SELECT * FROM __InstanceModificationEvent WITHIN 10 WHERE TargetInstance ISA 'Win32_PerfFormattedData_PerfOS_System'", "object.state": "created", "object.type": "event filter", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-07T03:11:36.186Z", "status": "success", "subject": "account", "subject.account.domain": "iewin7", "subject.account.id": "synthetic:ieuser@iewin7", "subject.account.name": "ieuser", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-05-11T17:58:39.746Z", "type": "raw", "uuid": "3a47e9dc-79a2-4bb8-a2d7-7bd4d7a4ccd0"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 								{"action": "modify", "alert.context": "iewin7\\ieuser -> root\\\\cimv2\\BotFilter82: SELECT * FROM __InstanceModificationEvent WITHIN 10 WHERE TargetInstance ISA 'Win32_PerfFormattedData_PerfOS_System'", "alert.key": "iewin7\\ieuserroot\\\\cimv2\\BotFilter82", "category.generic": "Attack", "category.high": "Persistence", "category.low": "Event Triggered Execution", "correlation_name": "Change_wmi_subscription", "correlation_type": "incident", "event_src.category": "Other", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "importance": "medium", "incident.aggregation.key": "Change_wmi_subscription|iewin7|synthetic:ieuser@iewin7", "incident.aggregation.timeout": 7200, "incident.category": "Undefined", "incident.severity": "medium", "msgid": "19", "object": "resource", "object.fullpath": "root\\\\cimv2\\BotFilter82", "object.name": "BotFilter82", "object.path": "root\\\\cimv2", "object.query": "SELECT * FROM __InstanceModificationEvent WITHIN 10 WHERE TargetInstance ISA 'Win32_PerfFormattedData_PerfOS_System'", "object.type": "event filter", "status": "success", "subject": "account", "subject.account.domain": "iewin7", "subject.account.id": "synthetic:ieuser@iewin7", "subject.account.name": "ieuser"}
							