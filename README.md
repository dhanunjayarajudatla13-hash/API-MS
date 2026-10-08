# Experiment 9: Simple Spring REST Controller

**Aim:** To create and run a simple REST controller with CRUD operations in a Spring Boot application.

## How to run
```bash
mvn spring-boot:run
```

## Test with curl
```bash
curl http://localhost:8080/api/users
curl -X POST http://localhost:8080/api/users -H "Content-Type: application/json" -d '{"id":3,"name":"Charlie Brown","email":"charlie@example.com"}'
curl -X PUT http://localhost:8080/api/users/1 -H "Content-Type: application/json" -d '{"name":"Alice Johnson","email":"alice.johnson@example.com"}'
curl -X DELETE http://localhost:8080/api/users/2
```

## Expected responses
```
POST   -> User created successfully with ID: 3
PUT    -> User updated successfully!
DELETE -> User deleted successfully!
```
