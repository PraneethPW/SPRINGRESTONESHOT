# SPRINRESTONEHOT – Student Management API

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![REST API](https://img.shields.io/badge/REST-API?style=for-the-badge&logo=rest&logoColor=white)

A **Spring Boot** application for managing student records using **MongoDB**. This REST API lets you create, update, fetch, and delete student data efficiently.

---

### Features

- Add new student records with name, age, section, and city.
- Retrieve a list of all students.
- Update a student's section.
- Delete a student by name.
- Built with Spring Boot 3.5.7 and MongoDB using Spring Data.

---

### Technologies Used

- Java 17
- Spring Boot (Web, Data MongoDB)
- MongoDB
- Maven

---

### Getting Started

#### Prerequisites

- Java 17 or newer.
- MongoDB running locally or connection string for remote instance.
- Maven.

#### Building and Running

1. **Clone the repository:**

   git clone https://github.com/yourusername/SPRINRESTONEHOT.git
cd SPRINRESTONEHOT

2. **Edit `src/main/resources/application.properties` to set up your MongoDB connection string:**

spring.data.mongodb.uri=mongodb://localhost:27017/your-db

3. **Build with Maven:**

  mvn clean install
 
4. **Run the application:**

 mvn spring-boot:run

 
---

### API Endpoints

| Method | Endpoint              | Description                   |
|--------|-----------------------|-------------------------------|
| POST   | `/users/InsertData`   | Add new student               |
| GET    | `/users/GetData`      | List all students             |
| DELETE | `/users/RemoveData`   | Delete by name (param: name)  |
| PUT    | `/users/UpdateData`   | Update student section        |

---

### Example Student JSON

{
"studentName": "Jhon",
"studentAge": 18,
"studentSection": "A",
"studentCity": "Hyderabad"
}


---

### Project Structure

- `Students.java` – Student Entity.
- `StudentsControllerClass.java` – REST API Controller.
- `StudentsServiceInterface.java`, `StudentsServiceClass.java` – Service layer, business logic.
- `StudentsRepoInterface.java` – MongoDB repository.
- `SprinrestonehotApplication.java` – Main application class.
- `pom.xml` – Maven dependencies and plugins.

---

### License

This project is for learning and demonstration purposes; see individual files for license details.



