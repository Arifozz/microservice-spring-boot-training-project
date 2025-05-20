# Microservice Spring Boot Training Project

This repository demonstrates a simple microservices architecture using Spring Boot, designed for educational and training purposes. The project is organized into multiple independent services, showcasing best practices for developing scalable and maintainable microservices in Java.

## Table of Contents


## Overview

The **Microservice Spring Boot Training Project** features a modular architecture built with Spring Boot. It demonstrates the core principles of microservices, such as loose coupling, independent deployment, and scalability. The main components are:

- **AuthMicroservices**: Handles user authentication.
- **UserMicroservice**: Manages user profiles.
- **ConfigServer**: Centralized configuration for all microservices.

## Architecture

```
+-------------------+      +-------------------------+      +-------------------+
|                   |      |                         |      |                   |
|  AuthMicroservice |<---->|   ConfigServer          |<---->| UserMicroservice  |
|                   |      |  (Spring Cloud Config)  |      |                   |
+-------------------+      +-------------------------+      +-------------------+
```

- **AuthMicroservice**: Responsible for authentication logic.
- **UserMicroservice**: Handles CRUD operations for user profiles.
- **ConfigServer**: Supplies configuration properties to all services from a central location.

## Services

### 1. AuthMicroservices

- Implements user authentication logic.
- Entry-point: `AuthApplication.java`

### 2. UserMicroservice

- Manages user profiles (create and fetch all users).
- Entry-point: `UserApplication.java`
- Uses MongoDB for data persistence.

### 3. ConfigServer

- Central configuration server using Spring Cloud Config.
- Entry-point: `ConfigServerApplication.java`

## Tech Stack

- **Java** (Spring Boot)
- **Spring Cloud Config**
- **MongoDB** (for user profile persistence)
- **Lombok** (for boilerplate code reduction)
- **Docker** (deployment)

## Getting Started

### Prerequisites

- Java 23+
- Gradle
- Docker (optional, for containerization)
- MongoDB & PostgreSQL running locally or accessible

### Running the Services

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Arifozz/microservice-spring-boot-training-project.git
   cd microservice-spring-boot-training-project
   ```

2. **Start MongoDB** (if not running):
   ```bash
   docker run -d -p 27017:27017 --name mongo mongo:latest
   ```

3. **Start ConfigServer:**
   ```bash
   cd ConfigServer
   ./gradlew bootRun
   ```

4. **Start AuthMicroservices:**
   ```bash
   cd AuthMicroservices
   ./gradlew bootRun
   ```

5. **Start UserMicroservice:**
   ```bash
   cd UserMicroservice
   ./gradlew bootRun
   ```

> _Alternatively, use Dockerfiles provided in each service for container deployment._

## API Endpoints

### UserMicroservice

- **Create User:**  
  `POST /dev/v1/user-profile/create-user`  
  Payload:  
  ```json
  {
    "authId": 1,
    "userName": "john_doe",
    "email": "john@example.com"
  }
  ```

- **Get All Users:**  
  `GET /dev/v1/user-profile/get-all`

_AuthMicroservices endpoints will be implemented for authentication logic._

## Contributing

Contributions are welcome! Please fork the repository, make your changes, and submit a pull request.

## License

This project is licensed under the MIT License.

---
_This project is intended for training and learning purposes. For feedback or questions, please open an issue._
