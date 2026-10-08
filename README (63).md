# Experiment 3: Spring Boot Application with Auto Wiring and Logging

**Aim:** To create a Spring Boot project, auto-wire Employee into EmployeeService with @Autowired, configure Logback, and verify using a test class.

## How to run
```bash
mvn test -Dtest=EmployeeServiceTest
```

## Expected output
```
2026-07-15 22:30:15 [main] INFO  com.example.demo.service.EmployeeService - Fetching employee information via EmployeeService...
2026-07-15 22:30:15 [main] DEBUG com.example.demo.service.EmployeeService - Employee instance details: Employee [ID=101, Name=John Doe]
Employee [ID=101, Name=John Doe]
```
