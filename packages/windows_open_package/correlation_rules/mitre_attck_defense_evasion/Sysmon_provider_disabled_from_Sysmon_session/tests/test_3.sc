{"action":"modify","category.generic":"Registry Object","category.high":"System Management","category.low":"Manipulation","event_src.category":"Operating system","event_src.fqdn":"win10-work.stand2008.local","event_src.host":"win10-work.stand2008.local","event_src.hostname":"win10-work","event_src.subsys":"Security","event_src.title":"windows","event_src.vendor":"microsoft","generator.type":"logcollector","generator.version":"N26.0.2936","id":"PT_Microsoft_Windows_eventlog_4657_Registry_value_changed","importance":"info","input_id":"00000000-0000-0000-0000-000000000000","mime":"application/x-pt-eventlog","msgid":"4657","normalized":true,"object":"reg_object","object.fullpath":"\\registry\\machine\\system\\controlset001\\control\\wmi\\autologger\\eventlog-microsoft-windows-sysmon-operational\\{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\\enabled","object.name":"enabled","object.new_value":"0","object.path":"\\registry\\machine\\system\\controlset001\\control\\wmi\\autologger\\eventlog-microsoft-windows-sysmon-operational\\{5770385f-c22a-43e0-bf4c-06f5698ffbd9}","object.property":"value","object.value":"1","recv_ipv4":"127.0.0.1","recv_time":"2024-06-04T19:05:23.691Z","status":"success","subject":"account","subject.account.domain":"stand2008","subject.account.id":"S-1-5-21-3800063338-4262557262-2801230003-500","subject.account.name":"администратор","subject.account.session_id":"604967","subject.process.fullpath":"C:\\Windows\\regedit.exe","subject.process.name":"regedit.exe","subject.process.path":"C:\\Windows\\","tag":"some_tag","task_id":"00000000-0000-0000-0000-000000000000","taxonomy_version":"26.0.215-release-26.0","time":"2024-06-04T18:55:19.453Z","type":"raw","uuid":"80bbb221-d736-484a-9242-147e81f08deb"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 {"action":"modify","category.generic":"Attack","category.high":"Defense Evasion","category.low":"Impair Defenses","correlation_name":"Sysmon_provider_disabled_from_Sysmon_session","correlation_type":"incident","count":1,"event_src.category":"Operating system","event_src.fqdn":"win10-work.stand2008.local","event_src.host":"win10-work.stand2008.local","event_src.hostname":"win10-work","event_src.subsys":"Security","event_src.title":"windows","event_src.vendor":"microsoft","generator.type":"correlationengine","importance":"medium","incident.aggregation.key":"Sysmon_provider_disabled_from_Sysmon_session|win10-work.stand2008.local|regedit.exe","incident.aggregation.timeout":7200,"incident.category":"ProtectionMalfunction","incident.severity":"medium","normalized":true,"object":"reg_object","object.fullpath":"\\registry\\machine\\system\\controlset001\\control\\wmi\\autologger\\eventlog-microsoft-windows-sysmon-operational\\{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\\enabled","object.name":"enabled","object.new_value":"0","object.path":"\\registry\\machine\\system\\controlset001\\control\\wmi\\autologger\\eventlog-microsoft-windows-sysmon-operational\\{5770385f-c22a-43e0-bf4c-06f5698ffbd9}","object.value":"1","origin_app_id":"00000000-0000-0000-0000-000000000005","primary_siem_app_id":"00000000-0000-0000-0000-000000000005","status":"success","subject":"process","subject.account.domain":"stand2008","subject.account.id":"S-1-5-21-3800063338-4262557262-2801230003-500","subject.account.name":"администратор","subject.account.session_id":"604967","subject.process.fullpath":"C:\\Windows\\regedit.exe","subject.process.name":"regedit.exe","subject.process.path":"C:\\Windows\\","time":"2024-06-04T18:55:19.453Z"}