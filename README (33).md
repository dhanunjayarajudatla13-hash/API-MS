# Experiment 8: SOAP-based Web Service with Spring Boot

**Aim:** To publish a SOAP web service with Spring Web Services, generate the WSDL from an XSD, and test it with SoapUI.

## How to run
```bash
mvn spring-boot:run
```

## Test
1. Open the generated WSDL: http://localhost:8080/ws/users.wsdl
2. In SoapUI: **New SOAP Project** -> paste the WSDL URL above.
3. Send the request in `soap-request-sample.xml`, or use curl:
```bash
curl -X POST http://localhost:8080/ws -H "Content-Type: text/xml" -d @soap-request-sample.xml
```

## Expected response
```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
   <SOAP-ENV:Header/>
   <SOAP-ENV:Body>
      <GetUserResponse xmlns="http://example.com/demo/webservice">
         <id>1</id>
         <name>Rahul Kumar</name>
         <email>rahul@aditya.edu.in</email>
      </GetUserResponse>
   </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```
