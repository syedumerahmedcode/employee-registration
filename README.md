# employee-registration

## Table of content
- [Introduction](#introduction)
- [Out Of Scope](#out-of-scope)
- [Explanation DAO Pattern](#explanation-dao-pattern)
- [Explanation Database](#explanation-database)
- [Explanation System Design](#explanation-system-design)
- [Explanation Other important Points](#explanation-other-important-points)
- [Technologies Used](#technologies-used)
- [Prerequisities](#prerequisities)
- [Commands](#commands)
- [References](#references)
- [Contact Information](#contact-information)


## Introduction

This project contains an application for employee registration which uses JavaEE and uses DAO pattern to register  information of the employee in the database. The main focus of the project is understand and use DAO pattern with JavaEE eco system.      

## Out Of Scope

Since the idea of this project is to understand the DAO pattern, not much focus is given to front-end and just simple JSP pages is used. Similarly, no tests are written.  


## Explanation DAO Pattern

DAO stands for Data Access Object. It is a structural pattern that allows us to isolate the business layer from the persistence layer using an abstract interface. 

The advantage is that service layer is decoupled from the persistence layer and it has no idea how the low level data operations are performed i.e. it hides all the complexities involved in performing CRUD operations in the underlying storage mechanism. Due to this, both business and persistence layer can modified independent of each other.

For Single responsibility principle (SRP), DAO is a must have, it separates the model and logic in a persistence layer that can be easily portable.

If a project is using Test Unit then DAO helps to test it correctly (mockup, database testing and so on). 
 


 
## Explanation Database

For database, MySql is used however, one can choose any other database. Since the focus is on understanding the dao pattern, one only table is created inside the database which keeps the records of the employees. The fields are: _id_, _first name_, _last name_, _username_, _password_, _address_ and _contact_. The primary key is _id_.

```sql
CREATE TABLE `employees`.`employee` (
`id` int(3) NOT NULL,
`first_name` varchar(20) DEFAULT NULL,
`last_name` varchar(20) DEFAULT NULL,
`username` varchar(250) DEFAULT NULL,
`password` varchar(20) DEFAULT NULL,
`address` varchar(45) DEFAULT NULL,
`contact` varchar(45) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
 
 

## Explanation System Design


To be defined.
 
## Explanation Other Important Points


To be defined.
 
 



## Technologies Used

- Java 11
- JavaEE---> To be defined.
- Tomcat---> To be defined.


## Commands

To be defined.

## Prerequisities

To be defined.

## References

- [1](https://www.youtube.com/watch?v=DzYyzmP4m5c):  Registration Form using JSP + Servlet + JDBC + MySQL Database Example
- [2](https://www.youtube.com/watch?v=kLgquZ2FiuQ): Install and Configure Apache Tomcat Web Server in Eclipse IDE
- [3](https://www.journaldev.com/16813/dao-design-pattern): DAO design pattern



## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=%5BGitHub%5D%20Hello%20from%20Github). Additionally, you can reach me via [Linkedin](https://www.linkedin.com/in/syed-umer-ahmed-a346a746/) or at [Xing](https://www.xing.com/profile/SyedUmer_Ahmed/cv)





















