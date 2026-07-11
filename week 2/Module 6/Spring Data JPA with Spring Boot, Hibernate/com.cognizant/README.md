## Difference Between JPA, Hibernate, and Spring Data JPA

| JPA | Hibernate | Spring Data JPA |
|-----|-----------|-----------------|
| JPA (Java Persistence API) is a specification that defines rules for object-relational mapping (ORM). | Hibernate is an ORM framework that implements the JPA specification. | Spring Data JPA is a Spring framework built on top of JPA that simplifies database operations. |
| It provides interfaces such as `EntityManager`. | It converts Java objects into SQL queries and communicates with the database. | It automatically generates CRUD operations through repository interfaces. |
| JPA itself cannot perform database operations because it is only a specification. | Hibernate provides the actual implementation of JPA. | Spring Data JPA reduces boilerplate code by using `JpaRepository` and query methods. |

### Relationship

```
Spring Data JPA
        ↓
    Hibernate
        ↓
        JPA
        ↓
     MySQL Database
```

### Summary

- **JPA** → Specification (defines the rules).
- **Hibernate** → Implementation of JPA (executes the rules).
- **Spring Data JPA** → Simplifies JPA by providing repositories and automatic CRUD operations with minimal code.