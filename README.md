# Restaurant Review Application

## Overview
This application is designed to manage restaurants and their reviews. It includes functionality to create, read, update, and delete restaurant and review data using Spring Boot and JPA.

## Features
- **Restaurant Management:** Create, retrieve, and delete restaurant information.
- **Review Management:** Create, retrieve, update, and delete reviews associated with restaurants.
- **JPA Integration:** Persist data in a database using JPA entities for `Restaurant` and `Review`.
- **REST API:** Provides endpoints for interacting with the application data.

## Installation
1. **Clone the repository:**
   ```bash
   git clone <repository-url>
2. Navigate to the project directory:
   ```bash
   cd RestaurantExample
3. Build the application:
   ```bash
    mvn clean install

4. Run the Application:
   ```bash
    mvn spring-boot:run

## API Endpoints

### Restaurant Endpoints
- **GET /restaurants:** 
  - Retrieve a list of all restaurants.
- **POST /restaurants:** 
  - Create a new restaurant (expects JSON payload).
- **DELETE /restaurants/{id}:** 
  - Delete a restaurant by its ID.

### Review Endpoints
- **POST /reviews:** 
  - Create or update a review (expects JSON payload).
- **GET /reviews:** 
  - Retrieve all reviews.
- **GET /reviews/{id}:** 
  - Retrieve a review by its ID.
- **DELETE /reviews/{id}:** 
  - Delete a review by its ID.
  


