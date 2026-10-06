# Hibernate CRUD Projects

This repository contains two Java Hibernate projects demonstrating CRUD operations using **Hibernate ORM** and **MySQL**.

## Projects

### 1. Hibernate Student CRUD Project

A console-based Student Management System developed using Java, Hibernate ORM, and MySQL.

**Student Operations:**
- Add Student
- Retrieve Student by ID
- Retrieve All Students
- Update Student
- Delete Student

**Student Fields:**
- Roll Number
- Name
- Address
- Course
- Marks
- Username
- Password

---

### 2. Hibernate Employee CRUD Project

A console-based Employee Management System developed using Java, Hibernate ORM, and MySQL.

**Employee Operations:**
- Insert Employee
- Retrieve Employee by ID
- Retrieve All Employees
- Update Employee
- Delete Employee

**Employee Fields:**
- Employee ID
- Name
- Salary
- Department
- Age
- Mobile Number
- Address

The Employee project also includes basic validation for age and mobile number.

## Technologies Used

- Java
- Hibernate ORM
- MySQL
- JDBC
- Maven
- Eclipse IDE

## Hibernate Concepts Used

- Hibernate Configuration
- SessionFactory
- Session
- Entity Mapping
- `@Entity`
- `@Id`
- `@GeneratedValue`
- CRUD Operations
- `persist()`
- `find()`
- `merge()`
- `remove()`
- HQL / Native SQL
- Transactions
- MySQL Database Connectivity

## Project Structure

```text
Hibernate_CRUD_Projects
│
├── Hibernate_Student_CRUD_Project
│   ├── src
│   └── pom.xml
│
├── Hibernate_Employee_CRUD_Project
│   ├── src
│   └── pom.xml
│
├── .gitignore
└── README.md
```

## How to Run

1. Clone or download this repository.
2. Import the required project into Eclipse.
3. Create the required MySQL database.
4. Configure the database username and password in the Hibernate configuration file.
5. Make sure MySQL Server is running.
6. Update Maven dependencies.
7. Run the main Java class.
8. Select the required CRUD operation from the console menu.

## Database Configuration

Update your Hibernate configuration with your MySQL details:

```xml
<property name="hibernate.connection.url">
    jdbc:mysql://localhost:3306/your_database
</property>

<property name="hibernate.connection.username">
    root
</property>

<property name="hibernate.connection.password">
    YOUR_PASSWORD
</property>
```

**Note:** Do not upload your real MySQL password to GitHub.

## Learning Objectives

These projects demonstrate practical understanding of:

- Java Object-Oriented Programming
- ORM concepts
- Hibernate
- Database connectivity
- CRUD operations
- Entity mapping
- Session management
- Transactions
- MySQL
- Maven project management

## Author

**Abhishek Rathod**

Computer Science & Engineering Graduate  
Java Developer | Hibernate | Spring Boot | MySQL

## License

This project is created for learning and educational purposes.
