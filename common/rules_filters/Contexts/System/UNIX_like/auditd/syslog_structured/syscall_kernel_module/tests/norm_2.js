{
  "subject": "account",
  "action": "stop",
  "object": "module",
  "status": "success",
  "category.generic": "Executable Module",
  "category.high": "Availability Management",
  "category.low": "Control",
  "chain_id": "9496",
  "datafield1": "rmmod",
  "event_src.category": "Operating system",
  "event_src.hostname": "pewpew-pc",
  "event_src.rule": "pt_siem_api_kernel_mods",
  "event_src.subsys": "auditd",
  "event_src.title": "unix_like",
  "id": "PT_UNIX_like_auditd_syslog_structured_syscall_kernel_module",
  "importance": "medium",
  "logon_service": "pts/1",
  "msgid": "delete_module",
  "object.account.group": "0",
  "object.account.id": "0",
  "object.state": "kernel_module_change",
  "object.type": "executable_module",
  "subject.account.id": "0",
  "subject.account.privileges": "0",
  "subject.account.session_id": "1",
  "subject.process.fullpath": "/usr/bin/kmod",
  "subject.process.id": "19133",
  "subject.process.meta": "modprobe dm_mirror",
  "subject.process.name": "kmod",
  "subject.process.parent.id": "1104",
  "subject.process.path": "/usr/bin/",
  "time": "2019-05-18T20:56:11.000Z"
}