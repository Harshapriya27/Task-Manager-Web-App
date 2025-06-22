# ✅ Task Manager Application

A simple yet functional **Task Manager** web application built using **Java**, **Spring Boot**, **Thymeleaf**, and **MySQL**.  
It allows users to efficiently manage daily tasks with options to create, filter, sort, and complete tasks in a responsive interface.



## 🚀 Features

- ✍️ Add tasks with **title, description, due date, priority**, and **username**
- 📋 View all tasks in a dynamic table
- ✅ Mark tasks as **Done** (irreversible once completed)
- 🔎 Filter by **status** (Pending / Completed)
- ⏳ Sort by **due date**
- 👤 Filter by **username**
- ❌ Delete tasks
- ⚡ AJAX-powered UI (no page reloads)
- 🌐 RESTful API for all operations
- 🔓 CORS enabled for API access



## 💻 Technologies Used

**Backend**  
- Java 17+  
- Spring Boot 3.x  
- Spring Data JPA (Hibernate)  
- RESTful API  

**Frontend**  
- Thymeleaf  
- Bootstrap  
- JavaScript (Fetch API)  

**Database**  
- MySQL  

**Build Tool**  
- Maven  



## ⚙️ Getting Started

### 🛠️ Prerequisites

- Java 17 or higher  
- MySQL installed and running  
- Maven  
- IDE like IntelliJ / VSCode  



### 🗄️ Database Setup

1. Create the database:

```

CREATE DATABASE taskdb;

```

2. Update your credentials in `src/main/resources/application.properties`:

```

spring.datasource.url=jdbc\:mysql://localhost:3306/taskdb
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update

```



### ▶️ Run the App

1. Clone the repository:

```

git clone github.com/yourusername/taskmanager.git
cd taskmanager

```

2. Build the project:

```

mvn clean install

```

3. Run the application:

```

mvn spring-boot\:run

```

4. Open browser and visit:

```

[http://localhost:8080/](http://localhost:8080/)

```



## 📡 API Endpoints

| Method | Endpoint                       | Description                          |
|--------|--------------------------------|--------------------------------------|
| GET    | /api/tasks                     | Get all tasks                        |
| POST   | /api/tasks                     | Create a new task                    |
| GET    | /api/tasks/{id}                | Get a task by ID                     |
| PUT    | /api/tasks/{id}                | Update a task by ID                  |
| DELETE | /api/tasks/{id}                | Delete a task                        |
| GET    | /api/tasks/completed           | Filter tasks by completion status    |
| GET    | /api/tasks/sorted              | Get tasks sorted by due date         |
| GET    | /api/tasks/user/{username}     | Get tasks by username                |



## 📂 Project Structure

```

src/
├── main/
│   ├── java/com/example/taskmanager/
│   │   ├── controller/TaskController.java
│   │   ├── model/Task.java
│   │   ├── repository/TaskRepository.java
│   │   └── TaskmanagerApplication.java
│   └── resources/
│       ├── templates/index.html
│       └── application.properties

```



## 🧠 Usage

- Add new tasks using the form  
- View or delete tasks in the table  
- Mark tasks as **Done** (cannot revert)  
- Filter by **status**, **due date**, or **username**  
- UI dynamically updates with no page reloads



## 📝 Notes

- `spring.jpa.hibernate.ddl-auto=update` auto-creates tables  
- CORS is globally enabled via `@CrossOrigin(origins = "*")`  
- Frontend uses Thymeleaf + Fetch API for async task updates



## 📜 License

This project is licensed under the **MIT License**. See the `LICENSE` file for details.



## 📫 Contact

For feedback, suggestions, or contributions:  
📧 Email: `hdkorishettar@gmail.com`  
🔗 GitHub Issues or Pull Requests welcome!



✅ Stay organized with your tasks — the efficient way!  
