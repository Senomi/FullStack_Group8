# University Student Information System (SIS)

## 📌 Project Overview

The **University Student Information System (SIS)** is a web-based application developed to digitalize and simplify academic and administrative activities within a university.

The system provides separate interfaces for Administrators, Lecturers, and Students, allowing them to manage academic information, course registrations, examination results, academic performance, and other university-related activities.

This project is developed as a group project using **Spring Boot, React.js, and MySQL**.

## 🎯 Main Objectives

- Digitalize university academic management processes.
- Provide role-based access for Administrators, Lecturers, and Students.
- Simplify student course registration and examination management.
- Automate examination result processing and publication.
- Provide academic performance analytics and reports.
- Improve communication between students and university staff.

## 👥 User Roles

### 1. Administrator
- Manage student and lecturer accounts.
- Manage academic years, semesters, courses, and subjects.
- Assign lecturers to subjects.
- Manage student registrations.
- Approve examination results before publication.
- Manage repeat examination applications and medical submissions.
- Manage academic records and generate reports.

### 2. Lecturer
- View assigned subjects and registered students.
- Upload examination marks using Excel files.
- Review calculated grades.
- Submit examination results for administrative approval.
- View subject-level result statistics.
- Submit student disciplinary reports.

### 3. Student
- Register for available subjects.
- View published examination results.
- View examination eligibility and timetables.
- Apply for repeat examinations and medical submissions.
- Track help desk requests.
- View academic performance and analytics.
- Generate academic transcripts.

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Java | Backend programming |
| Spring Boot | Backend framework |
| Spring Web | REST API development |
| Spring Data JPA | Database operations |
| Spring Security | Authentication and authorization |
| MySQL | Database management |
| React.js | Frontend development |
| Tailwind CSS | Frontend styling |
| Apache POI | Excel file processing |
| Maven | Dependency management |

## 📂 Project Structure

```text
sis-backend/
│
├── src/
│   ├── main/
│   │   ├── java/com/sis/
│   │   │   ├── auth/
│   │   │   ├── users/
│   │   │   ├── academics/
│   │   │   ├── results/
│   │   │   ├── analytics/
│   │   │   └── SisBackendApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
└── README.md
```

## 📊 Examination Results Management

The examination results management module handles the complete result-processing workflow.

**Main functionalities:**

1. Lecturers upload examination marks through Excel files.
2. The system validates uploaded marks and student registration numbers.
3. The system automatically calculates grades according to approved grading criteria.
4. Lecturers preview and submit results.
5. Administrators review, approve, or reject submitted results.
6. Administrators schedule examination result publication.
7. Students can view their grades after official publication.
8. Result corrections are recorded to maintain an audit history.

## ⚙️ Installation and Setup

### Prerequisites

- JDK 17 or above
- Maven
- MySQL Server
- Node.js and npm (for the frontend)
- Visual Studio Code or IntelliJ IDEA
- Postman (for API testing)

### 1. Clone the Repository

```bash
git clone <repository-url>
```

### 2. Navigate to the Backend

```bash
cd sis-backend
```

### 3. Configure the Database

Create a MySQL database:

```sql
CREATE DATABASE sis_db;
```

Update the database configuration in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sis_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

Replace the database username and password with your local MySQL credentials.

### 4. Run the Backend

For Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

For Linux/macOS:

```bash
./mvnw spring-boot:run
```

The backend will run at:

```text
http://localhost:8080
```

## 🔗 API Testing

Postman will be used to test and verify the REST API endpoints developed for the system.

## 👨‍💻 Development Team

This project is developed collaboratively by four members.

| Member | Main Responsibility |
|---|---|
| Member 01 | User Management, Authentication and Student Support |
| Member 02 | Academic, Registration and Examination Management |
| Member 03 | Examination Results and Publication Management |
| Member 04 | Academic Analytics, Rankings and Transcript Generation |

## 📌 Project Status

**Status:** In Development

The project is being developed incrementally, with each team member responsible for implementing and integrating their assigned functional modules.

---

*University Student Information System – Full-Stack Development Project*
