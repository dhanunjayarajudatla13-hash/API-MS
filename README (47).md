# 2b. Data access application using Spring JDBC

**Aim:** To implement a database application using Spring JDBC and JdbcTemplate with CRUD-style queries on an in-memory H2 database.

## How to run
```bash
mvn spring-boot:run
```

## Expected output
```
--- Initializing H2 Database Schema ---
--- Inserting Sample Product Records ---
--- Querying Records from Database ---
Product{id=101, name='MacBook Pro', price=129999.0}
Product{id=102, name='Mechanical Keyboard', price=4500.0}
Product{id=103, name='Wireless Mouse', price=1800.0}
```
