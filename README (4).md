# Experiment 10: Using @RequestBody and ResponseEntity

**Aim:** To accept JSON with `@RequestBody` and return explicit HTTP status codes with `ResponseEntity`.

## How to run
```bash
mvn spring-boot:run
```

## Test with curl
```bash
curl -i http://localhost:8080/api/products
curl -i http://localhost:8080/api/products/99      # 404 Not Found
curl -i -X POST http://localhost:8080/api/products -H "Content-Type: application/json" -d '{"name":"Tablet","price":18000}'   # 201 Created
curl -i -X PUT http://localhost:8080/api/products/1 -H "Content-Type: application/json" -d '{"name":"Gaming Laptop","price":90000}'
curl -i -X DELETE http://localhost:8080/api/products/2
curl -i -X DELETE http://localhost:8080/api/products/99   # 404 Not Found
```
