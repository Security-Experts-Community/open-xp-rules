{"action":"create","category.generic":"Service","category.high":"System Management","category.low":"Manipulation","event_src.category":"Operating system","event_src.fqdn":"win10-work.stand2008.local","event_src.host":"win10-work.stand2008.local","event_src.hostname":"win10-work","event_src.subsys":"System","event_src.title":"windows","event_src.vendor":"microsoft","generator.type":"logcollector","generator.version":"N26.0.2936","id":"PT_Microsoft_Windows_eventlog_7045_New_Windows_Service","importance":"info","input_id":"00000000-0000-0000-0000-000000000000","mime":"application/x-pt-eventlog","msgid":"7045","normalized":true,"object":"service","object.account.name":"localsystem","object.name":"Malware","object.process.cmdline":"\\\\?\\GLOBALROOT\\Device\\HarddiskVolumeShadowCopy1\\\\Windows\\Temp\\svhost64.exe","object.property":"start type","object.type":"служба режима пользователя","object.value":"Вручную","recv_ipv4":"127.0.0.1","recv_time":"2024-06-25T19:49:03.974Z","status":"success","subject":"account","subject.account.id":"S-1-5-21-3800063338-4262557262-2801230003-500","tag":"some_tag","task_id":"00000000-0000-0000-0000-000000000000","taxonomy_version":"26.0.215-release-26.0","time":"2024-06-25T19:19:05.243Z","type":"raw","uuid":"ceb5ae3f-99ea-488b-a781-801627e9cca4"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 {"action":"create","category.generic":"Attack","category.high":"Persistence","category.low":"Create or Modify System Process: Windows Service","correlation_name":"Persistence_via_shadow_copy","correlation_type":"incident","count":1,"event_src.category":"Operating system","event_src.fqdn":"win10-work.stand2008.local","event_src.host":"win10-work.stand2008.local","event_src.hostname":"win10-work","event_src.subsys":"System","event_src.title":"windows","event_src.vendor":"microsoft","generator.type":"correlationengine","importance":"medium","incident.aggregation.key":"Persistence_via_shadow_copy|win10-work.stand2008.local|s-1-5-21-3800063338-4262557262-2801230003-500","incident.aggregation.timeout":7200,"incident.category":"ProtectionMalfunction","incident.severity":"medium","normalized":true,"object":"service","object.account.name":"localsystem","object.name":"Malware","object.process.cmdline":"\\\\?\\GLOBALROOT\\Device\\HarddiskVolumeShadowCopy1\\\\Windows\\Temp\\svhost64.exe","object.property":"start type","object.type":"служба режима пользователя","object.value":"Вручную","origin_app_id":"00000000-0000-0000-0000-000000000005","primary_siem_app_id":"00000000-0000-0000-0000-000000000005","reason":"Service","status":"success","subject":"account","subject.account.id":"S-1-5-21-3800063338-4262557262-2801230003-500","time":"2024-06-25T19:19:05.243Z"}