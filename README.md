# Layered Architecture with Java

This repository implements a **Layered Architecture** in Java, integrating **JUnit**, **SonarQube**, and **ArchUnit** for testing and code quality assurance.

## 📌 Project Structure
The project follows the **Layered Architecture** approach, dividing the application into distinct layers:

- **Controller Layer**: Handles HTTP requests and responses.
- **Service Layer**: Contains business logic and application rules.
- **Repository Layer**: Manages data access and database interactions.
- **Model Layer**: Defines data structures and entities.

## 🛠️ Technologies Used
- **Java** (JDK 17 or later)
- **Spring Boot** (for dependency management and REST API development)
- **JUnit** (for unit testing)
- **SonarQube** (for static code analysis)
- **ArchUnit** (for architecture rule enforcement)

## ⚡ Features
- Implements **Layered Architecture** to ensure separation of concerns.
- **Unit testing** with JUnit to validate business logic.
- **Code quality analysis** with SonarQube.
- **Architecture validation** using ArchUnit.

## 🚀 Getting Started
### Prerequisites
Ensure you have the following installed:
- JDK 17 or later
- Maven (for dependency management)
- SonarQube (optional, for code analysis)

### Installation & Running the Project
```sh
# Clone the repository
git clone https://github.com/isnaayu/layeredArchitecture.git
cd layeredArchitecture

# Build and run the project
mvn clean install
mvn spring-boot:run
```

### Running Tests
```sh
mvn test
```

### Running SonarQube Analysis
Ensure you have SonarQube running locally, then execute:
```sh
mvn sonar:sonar
```

### Running Architecture Tests with ArchUnit
```sh
mvn test -Dtest=ArchUnitTest
```

## 📜 License
This project is licensed under the MIT License.

## 🤝 Contributing
Feel free to fork this repository and submit a pull request! 🙌

