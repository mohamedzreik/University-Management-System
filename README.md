# University Management System

A Java application demonstrating core Object-Oriented Programming concepts including classes, interfaces, generics, enums, and design patterns.

## Features

- Student, Professor, and Course management
- Generic collections without external libraries
- Enum-based grade system with automatic GPA calculation
- Singleton pattern for system configuration
- Abstract classes and interface implementations
- Type-safe operations with custom generic classes

## Project Structure

### Core Classes
- **Person** (Abstract) - Base class for Student and Professor
- **Student** - Extends Person, implements enrollment functionality
- **Professor** - Extends Person, handles teaching qualifications
- **Course** (Final) - Immutable course with enrollment tracking

### Enums
- **StudentStatus** - ACTIVE, INACTIVE, SUSPENDED, GRADUATED
- **CourseLevel** - BEGINNER, INTERMEDIATE, ADVANCED, GRADUATE  
- **GradeType** - Complete A-F grading with GPA points

### Generic Classes
- **Container<T>** - Custom array-based collection
- **Pair<K,V>** - Generic key-value pair storage

### Utilities
- **SystemConfig** - Singleton for application settings
- **IDGenerator** - Static utility for unique ID creation

## Key Concepts Demonstrated

- **Inheritance** - Multi-level class hierarchy
- **Polymorphism** - Interface-based programming
- **Generics** - Type-safe collections and methods
- **Enums** - Rich enums with fields and behavior
- **Singleton Pattern** - Thread-safe implementation
## Learning Objectives

## This project demonstrates practical application of:

- Class design and inheritance hierarchies
- Interface implementation and polymorphism
- Generic programming for type safety
- Enum usage for constants with behavior
- Design patterns (Singleton, Manager)
- Constructor chaining and method overriding
- Custom collection implementation
- **Final Classes** - Immutable object design
- **Abstract Classes** - Shared functionality
- **Method Overloading** - Multiple constructor/method signatures
