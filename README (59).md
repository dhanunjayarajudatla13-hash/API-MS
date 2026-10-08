# Experiment 7: Simple RESTful Web Service

**Aim:** To create a REST controller with CRUD operations (GET, POST, PUT, DELETE) using an in-memory list, and test it with Postman or curl.

## How to run
```bash
mvn spring-boot:run
```

## Test with curl
```bash
curl http://localhost:8080/api/users
curl http://localhost:8080/api/users/1
curl -X POST http://localhost:8080/api/users -H "Content-Type: application/json" -d '{"name":"Charlie Brown","email":"charlie@example.com"}'
curl -X PUT http://localhost:8080/api/users/1 -H "Content-Type: application/json" -d '{"name":"Alice Johnson","email":"alice.johnson@example.com"}'
curl -X DELETE http://localhost:8080/api/users/2
```
