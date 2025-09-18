# 🛒 E-Commerce Backend with Spring Boot & MongoDB 🚀

![Spring Boot](https://spring.io/images/projects/spring-boot-624x351.png)
![MongoDB](https://webassets.mongodb.com/_com_assets/cms/mongodb-logo-rgb-j6w271g1xn.jpg)

---

## 📜 Overview

This project is a **backend application** for an e-commerce platform built using **Spring Boot** and **MongoDB**.

It supports CRUD operations on Products, Categories, Users, and Orders, and exposes RESTful APIs.

---

## 🔑 Features

- Full **MongoDB** integration with Spring Data  
- CRUD APIs for Products, Categories, Users, and Orders  
- Input validation with `@Valid` and `@NotBlank`  
- RESTful endpoints using `@RestController`  
- Unit testing with **JUnit 5** and **Mockito**  
- Clean layered architecture: Controllers, Services, Repositories  

---

# E-Commerce Backend with Spring Boot & MongoDB

## 📦 Project Setup
This project is a simple **E-Commerce Backend** built using **Spring Boot** and **MongoDB**. It provides REST APIs to manage products, categories, users, and orders.

---

## ⚙️ Maven Dependencies (pom.xml)
- Spring Boot Starter Web  
- Spring Boot Starter Data MongoDB  
- Lombok  
- JUnit & Mockito for testing  

---

## 🧱 Project Structure
- **Models**  
  - `Product`  
  - `Category`  
  - `User`  
  - `Order`  
  Each annotated with Lombok and MongoDB annotations for easy data mapping.  

- **Repositories**  
  - Extend `MongoRepository` interfaces to perform CRUD and custom queries.  

- **Services**  
  - Business logic layer accessing repositories.  

- **Controllers**  
  - REST APIs exposing endpoints.  

---

## 🌐 API Endpoints

| HTTP Method | URI                         | Description                  |
|-------------|-----------------------------|------------------------------|
| GET         | `/api/products`             | Get all products             |
| GET         | `/api/products/category/{id}` | Get products by category     |
| POST        | `/api/products`             | Create a new product         |

---

## Run the Spring Boot app:

mvn spring-boot:run


Open API endpoints via:

http://localhost:8080/api/products

## 🧪 Testing

Unit tests use Mockito to mock repositories and verify service behavior.

Run tests with:

mvn test

## 🚀 Future Enhancements

Add pagination and sorting

Exception handling with @ControllerAdvice

API security with Spring Security

Use DTOs & ModelMapper

Integration tests for real-world scenarios

## 📸 Sample API Response
[
  {
    "id": "1",
    "name": "Product1",
    "description": "Desc1",
    "price": 100,
    "categoryId": "cat1"
  }
]

## 👨‍💻 Author

Sangeetha Ravichandran


