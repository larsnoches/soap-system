# SOAP-Client

## Настройка
Следуя подходу `contract-first`, нужно вызвать генерацию классов на основе WDSL-схемы:
```
wsimport -d ./target/classes -s ./src/main/java -verbose -p com.cyrilselyanin.soapclient.dto.gen http://localhost:8080/soap-ws/FormulaService?wsdl
```


