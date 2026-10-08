# Experiment 4: Implementing AOP Advices in Spring Boot

**Aim:** To implement a @Before advice with @Aspect and apply it to StudentService methods, then verify with a test class.

## How to run
```bash
mvn test -Dtest=StudentAopTest
```

## Expected output
```
====== SYSTEM TEST INITIALIZATION ======
[AOP-BEFORE] Intercepting execution route! Triggering before: displayStudentDetails
[Service Method] Core logic: Student name is John Doe with Roll Series: 251AI024
=========================================
[AOP-BEFORE] Intercepting execution route! Triggering before: updateStudentName
[Service Method] Core logic: Modifying current name fields to: Alice Smith
========= SYSTEM TEST COMPLETED =========
```
