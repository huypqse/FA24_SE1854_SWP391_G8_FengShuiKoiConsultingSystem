# FengShui Koi Consulting System

FengShui Koi Consulting System is a consulting system that evaluates the suitability of Koi fish and ponds based on Feng Shui principles. This project uses **Java Spring Boot** for the backend and **React** for the frontend. The database is managed with **SQL Server**.

## System Requirements

### Required Software
- **Java 17 or later** ([Download](https://adoptium.net/))
- **Apache Maven 3.8.x** ([Download](https://maven.apache.org/download.cgi))
- **Node.js v16.x or later** ([Download](https://nodejs.org/))
- **NPM** (included with Node.js)
- **SQL Server 2019 or later** ([Download](https://www.microsoft.com/en-us/sql-server/sql-server-downloads))

## Installation Guide

### Backend

#### Install and Run Backend
**Localhost: `http://localhost:9090`**

1. Install dependencies and build the project:
   ```sh
   mvn clean install
   ```
2. Run the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```

### Frontend

#### Install and Run Frontend
**Localhost: `http://localhost:3000`**

1. Install dependencies:
   ```sh
   npm install
   ```
2. Start the React application:
   ```sh
   npm start
   ```

### Database

- Import the `FengShuiKoi.sql` file into **SQL Server**.
- Ensure the database connection is properly configured in the backend.

## Contact

- **Created by:** Phan Quang Huy
- **GitHub:** [FengShui Koi Consulting System](https://github.com/huypqse/FA24_SE1854_SWP391_G8_FengShuiKoiConsultingSystem)
- **Email:** huypqse@gmail.com

