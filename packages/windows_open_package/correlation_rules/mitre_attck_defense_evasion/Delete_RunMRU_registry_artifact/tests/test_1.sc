{"action":"remove","category.generic":"Registry Object","category.high":"System Management","category.low":"Manipulation","event_src.category":"Other","event_src.fqdn":"msedgewin10","event_src.host":"msedgewin10","event_src.hostname":"msedgewin10","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","generator.type":"logcollector","generator.version":"N26.0.2936","id":"PT_Microsoft_Windows_eventlog_Sysmon_12_Registry_object_create_delete","importance":"info","input_id":"00000000-0000-0000-0000-000000000000","mime":"application/x-pt-eventlog","msgid":"12","normalized":true,"object":"reg_object","object.fullpath":"\\registry\\user\\s-1-5-21-3461203602-4096304019-2269080069-1000\\software\\microsoft\\windows\\currentversion\\explorer\\runmru","object.name":"runmru","object.path":"\\registry\\user\\s-1-5-21-3461203602-4096304019-2269080069-1000\\software\\microsoft\\windows\\currentversion\\explorer\\","object.type":"registry key","recv_ipv4":"127.0.0.1","recv_time":"2024-06-27T12:03:44.849Z","status":"success","subject.process.fullpath":"c:\\windows\\regedit.exe","subject.process.guid":"747f3d96-3d4d-5f06-0000-00104cb13b00","subject.process.id":"1392","subject.process.name":"regedit.exe","subject.process.path":"c:\\windows\\","tag":"some_tag","task_id":"00000000-0000-0000-0000-000000000000","taxonomy_version":"26.0.215-release-26.0","time":"2020-07-08T21:41:52.432Z","type":"raw","uuid":"e4b008c2-9c49-4f41-bc7a-a64b74347c5f"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 {"action":"remove","category.generic":"Attack","category.high":"Defense Evasion","category.low":"Indicator Removal","correlation_name":"Delete_RunMRU_registry_artifact","correlation_type":"incident","count":1,"event_src.category":"Other","event_src.fqdn":"msedgewin10","event_src.host":"msedgewin10","event_src.hostname":"msedgewin10","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","generator.type":"correlationengine","importance":"medium","incident.aggregation.key":"Delete_RunMRU_registry_artifact|msedgewin10","incident.aggregation.timeout":7200,"incident.category":"TrojanHorseDetection","incident.severity":"medium","normalized":true,"object":"reg_object","object.fullpath":"\\registry\\user\\s-1-5-21-3461203602-4096304019-2269080069-1000\\software\\microsoft\\windows\\currentversion\\explorer\\runmru","object.name":"runmru","object.path":"\\registry\\user\\s-1-5-21-3461203602-4096304019-2269080069-1000\\software\\microsoft\\windows\\currentversion\\explorer\\","object.type":"registry key","origin_app_id":"00000000-0000-0000-0000-000000000005","primary_siem_app_id":"00000000-0000-0000-0000-000000000005","status":"success","subject.process.fullpath":"c:\\windows\\regedit.exe","subject.process.id":"1392","subject.process.name":"regedit.exe","subject.process.path":"c:\\windows\\","time":"2020-07-08T21:41:52.000Z"}