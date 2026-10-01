# SWYNEX-Object-Oriented-Java-Project
Console-based Library Management System demonstrating Encapsulation, Inheritance, Abstraction and Polymorphism in Java.

## Project Overview

This project is a simple console-based Library Management System developed as part of the **SWYNEX Internship – Task 2: Object-Oriented Java Project**.

The application demonstrates the core concepts of Object-Oriented Programming in Java, including:

- Encapsulation
- Inheritance
- Abstraction
- Polymorphism

It also uses Java classes, objects, methods and ArrayList to manage books and library members.

## Features

- Add a new book
- Add a student member
- Add a staff member
- View available books
- View registered members
- Console-based menu system
- Demonstrates core OOP concepts

## Technologies Used

- Java
- Object-Oriented Programming
- ArrayList
- Scanner

## OOP Concepts Demonstrated

### 1. Encapsulation

Encapsulation is implemented by keeping the data members private inside the classes.

For example, the Book and Details classes use private fields and controlled methods to access the data.

### 2. Inheritance

Inheritance is demonstrated using the `Student` and `Staff` classes.

### 3. Abstraction

The `Details` class is declared as an abstract class.

It defines the common structure for library members and contains the abstract `displayDetails()` method.

The child classes provide their own implementation of this method.

### 4. Polymorphism

Polymorphism is demonstrated by storing both `Student` and `Staff` objects in an `ArrayList<Details>`.

The same `displayDetails()` method produces different output depending on whether the object is a `Student` or `Staff`.

Both classes extend the `Details` class and reuse its common properties.

### Learning Outcome

Through this project, I practiced designing a Java application using Object-Oriented Programming principles and understood how encapsulation, inheritance, abstraction, and polymorphism can be applied together in a practical application.
