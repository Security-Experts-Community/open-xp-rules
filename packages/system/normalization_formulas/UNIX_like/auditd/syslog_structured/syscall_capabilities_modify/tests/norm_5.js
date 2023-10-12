{
  "subject": "process",
  "action": "elevate",
  "object": "process",
  "status": "success",
  "category.generic": "Process",
  "category.high": "Users And Rights Management",
  "category.low": "Manipulation",
  "chain_id": "46173974",
  "datafield1": "runc:[2:INIT]",
  "event_src.category": "Operating system",
  "event_src.ip": "10.10.52.190",
  "event_src.rule": "pt_siem_api_caps",
  "event_src.subsys": "auditd",
  "event_src.title": "unix_like",
  "id": "PT_UNIX_like_auditd_syslog_structured_syscall_capabilities_modify",
  "importance": "low",
  "labels": "node_contains_ext_ip",
  "msgid": "capset",
  "object.account.group": "admins",
  "object.account.id": "10000",
  "object.account.name": "unknown(10000)",
  "object.new_value": "0000000000000000",
  "object.process.id": "105954",
  "object.property": "effective_capabilities",
  "object.state": "capabilities_change",
  "subject.account.id": "10000",
  "subject.account.name": "unknown(10000)",
  "subject.account.privileges": "10000",
  "subject.account.session_id": "4294967295",
  "subject.process.fullpath": "/",
  "subject.process.id": "105954",
  "subject.process.meta": "runc init",
  "subject.process.parent.id": "105945",
  "subject.process.path": "/",
  "time": "2021-08-24T06:23:55.000Z"
}