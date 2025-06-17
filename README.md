# Task Manager Application

A simple **Task Manager** web application built with **Spring Boot**, **Spring Data JPA**, **Thymeleaf**, and **MySQL**.  
It allows users to create, view, update, filter, sort, and delete tasks. Tasks can be marked as completed ("Done") and once completed, cannot be reverted to pending.

---

## Features

- Add new tasks with title, description, due date, priority, and username.
- View all tasks in a table with all details.
- Mark tasks as **Done** (completed) — completed tasks cannot be marked pending again.
- Filter tasks by completion status (Completed / Pending).
- Sort tasks by due date.
- Filter tasks by username.
- Delete tasks.
- Responsive UI with dynamic updates using AJAX (no page reload on add, update, delete).
- RESTful API endpoints for all CRUD operations.
- Cross-Origin Resource Sharing (CORS) enabled for API.

---

## Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Data JPA (Hibernate)
- MySQL Database
- Thymeleaf (Server-side HTML templating)
- JavaScript (Fetch API for AJAX)
- Maven (Build tool)

---

## Getting Started

### Prerequisites

- Java 17 or higher installed
- MySQL Server running locally or remotely
- Maven installed
- IDE (IntelliJ IDEA, Eclipse, VSCode, etc.)

### Setup MySQL Database

1. Create a database named `taskdb`:

CREATE DATABASE taskdb;

text

2. Update the database credentials in `src/main/resources/application.properties` if needed:

spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=root
spring.datasource.password=root

text

---

### Build and Run

1. Clone this repository:

git clone https://github.com/yourusername/taskmanager.git
cd taskmanager

text

2. Build the project with Maven:

mvn clean install

text

3. Run the Spring Boot application:

mvn spring-boot:run

text

4. Open your browser and navigate to:

http://localhost:8080/

text

You should see the Task Manager UI.

---

## API Endpoints

| Method | Endpoint                 | Description                          |
|--------|--------------------------|------------------------------------|
| GET    | `/api/tasks`             | Get all tasks                      |
| POST   | `/api/tasks`             | Create a new task                  |
| GET    | `/api/tasks/{id}`        | Get task by ID                    |
| PUT    | `/api/tasks/{id}`        | Update task by ID                 |
| DELETE | `/api/tasks/{id}`        | Delete task by ID                 |
| GET    | `/api/tasks/completed`   | Get tasks filtered by completion status (`?status=true/false`) |
| GET    | `/api/tasks/sorted`      | Get all tasks sorted by due date  |
| GET    | `/api/tasks/user/{username}` | Get tasks by username          |

---

## Project Structure

src/
├── main/
│ ├── java/com/example/taskmanager/
│ │ ├── controller/TaskController.java
│ │ ├── model/Task.java
│ │ ├── repository/TaskRepository.java
│ │ └── TaskmanagerApplication.java
│ └── resources/
│ ├── templates/index.html
│ └── application.properties

text

---

## Usage

- Use the form at the top to add new tasks.
- Tasks appear instantly in the table below without page reload.
- Click **Pending** button to mark a task as **Done**. Completed tasks cannot be reverted.
- Use filter buttons to view completed or pending tasks.
- Sort tasks by due date.
- Filter tasks by username.
- Delete tasks using the red **Delete** button.

---

## Notes

- The project uses `spring.jpa.hibernate.ddl-auto=update` to automatically create/update tables.
- CORS is enabled for all origins (`@CrossOrigin(origins = "*")`) for API accessibility.
- The frontend uses Thymeleaf for initial page rendering and JavaScript Fetch API for dynamic updates.

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Contact

For questions or suggestions, please open an issue or contact me at [your-email@example.com].

---

Enjoy managing your tasks efficiently! 🚀
