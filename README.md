# Minimalist Social Media (MicroFeed)

A minimalist social media application built to showcase
**production-grade Java backend engineering**.

The frontend is intentionally kept minimal and exists only
to consume backend APIs.

---

## Project Status

🚧 Work in progress

The repository initially contained a frontend scaffold.
The primary focus of the project is the backend system design,
security, and data modeling.

---

## Tech Stack

### Backend (Primary Focus)

- Java 17
- Spring Boot
- Spring Security (JWT-based authentication)
- JPA / Hibernate
- PostgreSQL
- Flyway (database migrations)
- JUnit 5, Mockito (testing)

### Frontend (Secondary)

- React
- Vite
- Minimal UI, no business logic

---

## Core Features

- User registration & authentication
- Create text posts
- Follow / unfollow users
- Personalized feed (posts from followed users)
- Like posts

---

## Architecture

- Layered architecture (Controller → Service → Repository)
- Business logic isolated in services
- Stateless backend using JWT
- Clear separation between frontend and backend

---

## Planned Repository Structure0

/
├── frontend/ # React client (minimal)
├── backend/ # Spring Boot application
└── README.md

---

## Engineering Focus

- Clean architecture
- Data consistency & indexing
- Secure authentication & authorization
- Testable, maintainable Java code
- Clear documentation of design decisions

---

## Future Improvements

- Feed caching using Redis
- Pagination & performance optimization
- Containerization with Docker
