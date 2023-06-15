{
  "subject": "account",
  "action": "execute",
  "object": "command",
  "status": "success",
  "datafield1": "EXEC master.sys.xp_instance_regread N'HKEY_LOCAL_MACHINE', N'Software\\Microsoft\\MSSQLServer\\MSSQLServer', N'LoginMode', @NumErrorLogs OUTPUT",
  "datafield2": "DESKTOP-GB13G7P",
  "datafield3": "master",
  "datafield4": "EX",
  "datafield5": "X",
  "event_src.category": "Database server",
  "event_src.hostname": "desktop-gb13g7p",
  "event_src.subsys": "Application",
  "event_src.title": "sql_server",
  "event_src.vendor": "microsoft",
  "id": "PT_Microsoft_SQL_Server_eventlog_33205_audit_exec_used",
  "importance": "low",
  "msgid": "33205",
  "object.path": "HKEY_LOCAL_MACHINE\\Software\\Microsoft\\MSSQLServer\\MSSQLServer\\LoginMode",
  "object.property": "command name",
  "object.query": "EXEC master.sys.xp_instance_regread N'HKEY_LOCAL_MACHINE', N'Software\\Microsoft\\MSSQLServer\\MSSQLServer', N'LoginMode', @NumErrorLogs OUTPUT",
  "object.type": "read registry value",
  "object.value": "xp_instance_regread",
  "subject.account.id": "51dd4b885506ac48827997ba5521b176",
  "subject.account.name": "siemagent",
  "subject.id": "51dd4b885506ac48827997ba5521b176",
  "subject.name": "siemagent",
  "time": "2020-02-04T11:24:57Z"
}