# Experiment 6: Pagination and Sorting with Spring Data JPA

**Aim:** To implement pagination and sorting using Pageable and Sort, and custom sorting using @Query.

## How to run
```bash
mvn test -Dtest=UserPaginationTest,UserCustomQueryTest
```

## Expected output
```
[PAGINATION] Total Elements found in H2 Store: 5
[PAGINATION] Total Pages: 2
 -> Name: Ananya Sen | Email: ananya@aditya.edu.in
 -> Name: Bhavana Reddy | Email: bhavana@aditya.edu.in
 -> Name: Deepak Verma | Email: deepak@aditya.edu.in
[@QUERY SORT] (DESC)
 -> Vijay Sharma, Rahul Kumar, Deepak Verma, Bhavana Reddy, Ananya Sen
```
