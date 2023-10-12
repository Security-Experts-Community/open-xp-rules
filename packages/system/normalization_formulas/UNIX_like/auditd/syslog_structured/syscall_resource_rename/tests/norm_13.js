{
  "subject": "account",
  "action": "move",
  "object": "file_object",
  "status": "failure",
  "category.generic": "File System Object",
  "category.high": "System Management",
  "category.low": "Manipulation",
  "chain_id": "27852553",
  "datafield1": "mv",
  "event_src.category": "Operating system",
  "event_src.ip": "10.10.52.40",
  "event_src.rule": "pt_siem_rename",
  "event_src.subsys": "auditd",
  "event_src.title": "unix_like",
  "id": "PT_UNIX_like_auditd_syslog_structured_syscall_resource_rename",
  "importance": "low",
  "labels": "node_contains_ext_ip",
  "logon_service": "pts/2",
  "msgid": "renameat2",
  "object.account.group": "0",
  "object.account.id": "0",
  "object.fullpath": "/test/file.log",
  "object.name": "file.log",
  "object.path": "/test/",
  "object.property": "fullpath",
  "reason": "No such file or directory",
  "subject.account.id": "1000",
  "subject.account.privileges": "0",
  "subject.account.session_id": "9",
  "subject.process.cwd": "/root",
  "subject.process.fullpath": "/usr/bin/mv",
  "subject.process.id": "81592",
  "subject.process.meta": "mv /test/file.log /test_1/",
  "subject.process.name": "mv",
  "subject.process.parent.id": "81455",
  "subject.process.path": "/usr/bin/",
  "time": "2023-05-15T07:00:49.000Z"
}