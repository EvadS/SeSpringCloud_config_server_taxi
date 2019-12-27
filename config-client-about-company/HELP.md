

Данному приложению нужно прочитать свои конфигурации, сохраненные на  Config-Server, поэтому вам нужно ему сказать информацию про  Config-Server. Данная информация конфигурирована на файле  bootstrap.properties (Или  bootstrap.yml). Данный файл используется приложением во время старта.


Запуск приложения

Для начала, вам нужно запустить приложение  Config-Server. Данное приложение будет работать на порту  8888

Тестировать его со следующим URL:
http://localhost:8888/app-about-company.properties


ConfigClientAboutCompany, данное приложение будет работать на порту  7777:
Тестировать его со следующим URL:
http://localhost:7777/showConfig


http://localhost:7777/pingDataSource