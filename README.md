Invoice Management System (In Progress)
====
This is a basic invoice management system developed using Spring Boot backend and Thymeleaf for the frontend. The application allows users to manage invoices a, providing functionality for creating, updating, and deleting records.

# Work is still in progress, dont expect (fully) functional program.

# to-do

* Complete frontend
* Security
* Database connection
* Etc.

# Prerequisites

Before running the application, ensure that you have the following prerequisites installed:

Java Development Kit (JDK) 8 or higher  
Maven build tool  
PostgreSQL database

# Installation

1. Clone the repository:  
git clone https://github.com/your-username/your-repo.git
 
2. Navigate to the project directory:  
cd your-repo

3. Build the application using Maven:  
mvn clean install

4. Configure the database connection by updating the application.properties file with your PostgreSQL database credentials:  
spring.datasource.url=jdbc:postgresql://localhost:5432/your-database  
spring.datasource.username=your-username  
spring.datasource.password=your-password  

5. Run the application:  
mvn spring-boot:run

6. Access the application in your browser at http://localhost:8080.

# Usage