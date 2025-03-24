# Layered Architecture with Java

This repository implements a **Layered Architecture** in Java, integrating **JUnit**, **SonarCloud**, **GitHub Actions**, and **ArchUnit** for testing, code quality assurance, and CI/CD.

## 📌 Project Structure
The project follows the **Layered Architecture** approach, dividing the application into distinct layers:

- **Controller Layer**: Handles HTTP requests and responses.
- **Service Layer**: Contains business logic and application rules.
- **Repository Layer**: Manages data access and database interactions.
- **Model Layer**: Defines data structures and entities.

## 🛠️ Technologies Used
- **Java** (JDK 21)
- **Spring Boot** (for dependency management and REST API development)
- **JUnit** (for unit testing)
- **SonarCloud** (for static code analysis)
- **ArchUnit** (for architecture rule enforcement)
- **GitHub Actions** (for CI/CD automation)
- **Docker** (for containerization)

## ⚡ Features
- Implements **Layered Architecture** to ensure separation of concerns.
- **Unit testing** with JUnit to validate business logic.
- **Code quality analysis** with SonarCloud.
- **Architecture validation** using ArchUnit.
- **CI/CD pipeline** using GitHub Actions for automated testing and deployment.
- **Docker integration** for containerized deployment.

## 🚀 Getting Started
### Prerequisites
Ensure you have the following installed:
- JDK 21
- Maven (for dependency management)
- Docker (for containerization)
- SonarCloud account (for code analysis)

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

### Running SonarCloud Analysis
Ensure your repository is linked to **SonarCloud**, then execute:
```sh
mvn sonar:sonar
```

### Running Architecture Tests with ArchUnit
```sh
mvn test -Dtest=ArchUnitTest
```

## 📔 Continuous Integration & Deployment (CI/CD)
This project uses **GitHub Actions** to automate build, test, and deployment processes.

### CI/CD Workflow Overview
The GitHub Actions workflow is defined in [`.github/workflows/main.yml`](./.github/workflows/main.yml). It includes:
1. **Build & Test**: Runs `mvn clean verify` to compile and test the project.
2. **Code Quality Check**: Uses **SonarCloud** to analyze code quality.
3. **Docker Build & Push**: Builds a Docker image and pushes it to Docker Hub (or another container registry).

### GitHub Actions Status
![GitHub Actions Build Status](https://github.com/isnaayu/layeredArchitecture/actions/workflows/main.yml/badge.svg)

## 🐜 License
This project is licensed under the MIT License.

## 🤝 Contributing
Feel free to fork this repository and submit a pull request! 🙌

