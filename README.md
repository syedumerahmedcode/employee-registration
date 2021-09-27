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

- Inside employee-registration/WebContent/WEB-INF/lib folder --->we enter other required dependencies which are jar files.
For this project, the following dependencies are added:

** jsp-api-2.2jar
** jstl-1.2.jar
** mysql-connector-java-8.0.13.jar
** servlet-api-2.5.jar

- Inside employee-registration/WebContent ---> It contains jsp pages or css files.

- Packages are modeled after MVC pattern i.e. Model,View and Controller. View folder is created under Web-inf folder which, in this case, contains JSP pages but it can be any other front-end technology.

- Inside Controller package, we create servlets.

- Apache Tomcat server should be configured to the class path of this project.

- In order to change the default port 8080 to something else, one can go to c:// Program Files/Apache Software Foundation/Tomcat 8.0/conf/server.xml. Theses settings are provided for Windows. For Linux, please check it yourself.

- For the project, one also needs to configure Buildpath and add Apache Tomcat Server as a library.

- The context path end point in form action (in jsp) is what is entered in the @WebServlet annotation in the servlet class as this bindings acts as the bridge between these two.

- The input field name in html fields is what we are getting as part of the HttpServletRequest in the doPost() method with the Servlet class.    
 



## Technologies Used

- Java 11
- [JavaEE](https://www.oracle.com/java/technologies/java-ee-glance.html): Java Platform, Enterprise Edition (Java EE) is the standard in community-driven enterprise software. Java EE is developed using the Java Community Process, with contributions from industry experts, commercial and open source organizations, Java User Groups, and countless individuals. Each release integrates new features that align with industry needs, improves application portability, and increases developer productivity.
- [Tomcat](https://tomcat.apache.org/): The Apache Tomcat® software is an open source implementation of the Jakarta Servlet, Jakarta Server Pages, Jakarta Expression Language, Jakarta WebSocket, Jakarta Annotations and Jakarta Authentication specifications. These specifications are part of the Jakarta EE platform.

## Prerequisities

This application requires the Tomcat server  and MySql database to be running on the target machine. 

## Commands

Inside Eclipse IDE, right click on Project ---> Runs As ---> Run on Server.
This make the application available on: 

```
http://localhost:8080/employee-registration
```

Add _/register_ to access the register WebServlet.

```
http://localhost:8080/employee-registration/register
```

Once all the information is entered, click on 'Submit'. This creates an entry in the database.




## References

- [1](https://www.youtube.com/watch?v=DzYyzmP4m5c):  Registration Form using JSP + Servlet + JDBC + MySQL Database Example(Youtube)
- [2](https://www.youtube.com/watch?v=kLgquZ2FiuQ): Install and Configure Apache Tomcat Web Server in Eclipse IDE
- [3](https://www.journaldev.com/16813/dao-design-pattern): DAO design pattern



## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=%5BGitHub%5D%20Hello%20from%20Github). Additionally, you can reach me via [Linkedin](https://www.linkedin.com/in/syed-umer-ahmed-a346a746/) or at [Xing](https://www.xing.com/profile/SyedUmer_Ahmed/cv)





















