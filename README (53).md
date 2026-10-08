# Experiment 5: Setting up Spring Data JPA with Spring Boot

**Aim:** To configure Spring Data JPA with an H2 database, create a User entity and UserRepository, and test CRUD operations.

## How to run
```bash
mvn test -Dtest=UserCrudTest
```

## Expected output
```
================= INITIALIZING DATA JPA TESTS =================
[CREATE] Success! ...
[READ ALL] Displaying existing user schema records below:
User{id=1, name='John Doe', email='john.doe@aditya.edu.in'}
User{id=2, name='Alice Smith', email='alice.s@aditya.edu.in'}
[UPDATE] Success! ...
[READ INDIVIDUAL] ...
User{id=1, name='John Developer', email='john.doe@aditya.edu.in'}
[DELETE] Terminated record row with ID: 2
[COUNT] Remaining database row total: 1
================== DATA JPA TESTS COMPLETED ==================
```
