# LEARNING

This project is going to be used as a learning tool where I will create a minimum example and from there on, advance
with some learning.

## Index

1. Github hooks
2. H2 as database

## H2 as database

In order to set up the database, application properties must be set:

```yaml
spring:
  datasource:
    url: jdbc:h2:file:/Users/zuldare/code/gitJaime/learning
    username: sa
    password: password
    driver-class-name: org.h2.Driver
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
```