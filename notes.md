- Inside employee-registration/WebContent/WEB-INF/lib folder --->we enter other required dependencies which are jar files.
For this project, the following dependencies are added:

* jsp-api-2.2jar
* jstl-1.2.jar
* mysql-connector-java-8.0.13.jar
* servlet-api-2.5.jar

- Inside employee-registration/WebContent ---> We contain jsp pages or css files.

- Packages are modeled after MVC pattern i.e. Model,View and Controller. View folder is created under Web-inf folder which, in this case, contains JSP pages but it can be any other front-end technology.

- Inside Controller package, we create servlets.

- Apache Tomcat server should be configured to the class path of this project.

- In order to change the default port 8080 to something else, one can go to c:// Program Files/Apache Software Foundation/Tomcat 8.0/conf/server.xml. Theses settings are provided for Windows. For Linux, please check it yourself.

- For the project, one also needs to configure Buildpath and add Apache Tomcat Server as a library. 

Video reference: 
- [1](https://www.youtube.com/watch?v=DzYyzmP4m5c):  Registration Form using JSP + Servlet + JDBC + MySQL Database Example
- [2](https://www.youtube.com/watch?v=kLgquZ2FiuQ): Install and Configure Apache Tomcat Web Server in Eclipse IDE



 