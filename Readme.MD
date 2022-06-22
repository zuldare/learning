# LEARNING

This project is going to be used as a learning tool where I will create a minimum example and from there on, advance
with some learning.

## Index

1. Github hooks
2. Postgresql as database

## Postgresql as database

First, add pom.xml dependency

````xml

<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
````

Set mínimum application.yml properties

````yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/
    username: postgres
    password: root

  jpa:
    hibernate:
      ddl-auto: create
    generate-ddl: true
    show-sql: true
````

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