# 2a. Explore Spring Framework modules

**Aim:** To explore the core modules of the Spring Framework and map them to Maven starters.

| Module group | What it contains | Starter used here |
|---|---|---|
| Core Container | Beans, Core, Context, SpEL - IoC and Dependency Injection | `spring-boot-starter-web` (pulls in the core) |
| Data Access / Integration | JDBC, ORM, OXM, JMS, Transactions - simplifies DB access | `spring-boot-starter-jdbc` + `h2` |
| Web (MVC / WebFlux) | Web, Web-Servlet (MVC), WebSocket - MVC pattern | `spring-boot-starter-web` |

## How to run
```bash
mvn spring-boot:run
```
H2 console: http://localhost:8080/h2-console  (JDBC URL `jdbc:h2:mem:moduledb`, user `sa`, empty password)
