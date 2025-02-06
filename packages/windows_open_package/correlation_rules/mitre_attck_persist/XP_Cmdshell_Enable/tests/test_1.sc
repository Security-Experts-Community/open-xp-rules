{"action": "modify", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"MSSQLSERVER\"},\"EventID\":{\"Qualifiers\":\"16384\",\"text\":\"15457\"},\"Level\":\"4\",\"Task\":\"2\",\"Keywords\":\"0x80000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-11-04T09:27:26.1586215Z\"},\"EventRecordID\":\"9692\",\"Channel\":\"Application\",\"Computer\":\"MSEDGEWIN10\",\"Security\":\"\"},\"EventData\":{\"Data\":[\"xp_cmdshell\",\"0\",\"1\"],\"Binary\":\"613C00000A0000000C0000004D0053004500440047004500570049004E00310030000000070000006D00610073007400650072000000\"}}}", "event_src.category": "Database server", "event_src.fqdn": "msedgewin10", "event_src.host": "msedgewin10", "event_src.hostname": "msedgewin10", "event_src.subsys": "Application", "event_src.title": "sql_server", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_SQL_Server_eventlog_15457_Parameter_enabled", "importance": "low", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "15457", "normalized": true, "object": "configuration", "object.property": "parameter", "object.value": "xp_cmdshell", "reason": "parameter enabled", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-05T11:07:51.676Z", "status": "success", "subject": "account", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-11-04T09:27:26.158Z", "type": "raw", "uuid": "ec2cc867-431a-4238-9d69-8e4720b3f22d"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 								{"action": "modify", "alert.key": "msedgewin10|xp_cmdshell", "category.generic": "Attack", "category.high": "Persistence", "category.low": "Server Software Component: SQL Stored Procedures", "correlation_name": "XP_Cmdshell_Enable", "correlation_type": "event", "event_src.category": "Database server", "event_src.fqdn": "msedgewin10", "event_src.host": "msedgewin10", "event_src.hostname": "msedgewin10", "event_src.subsys": "Application", "event_src.title": "sql_server", "event_src.vendor": "microsoft", "importance": "high", "incident.aggregation.key": "XP_Cmdshell_Enable|msedgewin10", "incident.aggregation.timeout": 7200, "incident.category": "Undefined", "incident.severity": "high", "object": "configuration", "object.property": "parameter", "object.value": "xp_cmdshell", "reason": "parameter enabled", "status": "success", "subject": "account"}
