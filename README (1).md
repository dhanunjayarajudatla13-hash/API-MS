# API & Microservices Lab (241AI024)

B.Tech V Semester - Department of Artificial Intelligence and Machine Learning
Aditya University, Surampalem, Kakinada District, Andhra Pradesh - 533437
Academic year 2026-2027

Spring Boot programs for all 10 lab experiments. Each folder is an independent Maven project.

## Experiments

| No. | Experiment | Folder |
|----|-----------|--------|
| 1 | Setting up Spring Framework (a. Initializr, b. structure and dependencies, c. Hello World) | `experiment-01-setting-up-spring/` |
| 2 | Spring Modules (a. module exploration, b. Spring JDBC, c. Spring MVC) | `experiment-02-spring-modules/` |
| 3 | Auto Wiring and Logging (Logback) | `experiment-03-autowiring-logging/` |
| 4 | AOP Advices (`@Aspect`, `@Before`) | `experiment-04-aop-advices/` |
| 5 | Spring Data JPA with Spring Boot | `experiment-05-spring-data-jpa/` |
| 6 | Pagination and Sorting with Spring Data JPA | `experiment-06-pagination-sorting/` |
| 7 | Simple RESTful Web Service | `experiment-07-restful-web-service/` |
| 8 | SOAP-based Web Service | `experiment-08-soap-web-service/` |
| 9 | Simple Spring REST Controller | `experiment-09-spring-rest-controller/` |
| 10 | `@RequestBody` and `ResponseEntity` | `experiment-10-requestbody-responseentity/` |

## Prerequisites
- JDK 17 or higher
- Maven 3.8+
- An IDE (IntelliJ IDEA or VS Code)
- Postman / curl (experiments 7, 9, 10) and SoapUI (experiment 8)

## Running any experiment
```bash
cd experiment-07-restful-web-service
mvn spring-boot:run          # web apps
mvn test                     # experiments with test classes (3, 4, 5, 6)
```
Each experiment's own `README.md` lists the exact command and expected output.
