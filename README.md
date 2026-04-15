Vehicle Rental Management System (OOP Project)
Overview

The Vehicle Rental Management System is a Java-based application developed using Object-Oriented Programming (OOP) concepts. It simulates a real-world rental service where users can rent different types of vehicles such as cars and bikes.

The project demonstrates key OOP principles like inheritance, polymorphism, method overriding, and constructor chaining.

Features
Rent different types of vehicles (Car & Bike)
Dynamic rent calculation based on vehicle type
Menu-driven console interface
Demonstrates runtime polymorphism
Clean and modular code structure
OOP Concepts Used
Inheritance → Vehicle as base class, Car and Bike as subclasses
Polymorphism → Using Vehicle reference for different objects
Method Overriding → Different rent calculation logic
super Keyword → Used to call parent constructor
Dynamic Method Dispatch → Method resolved at runtime
Project Structure
VehicleRentalSystem.java
│
├── class Vehicle
├── class Car extends Vehicle
├── class Bike extends Vehicle
└── class VehicleRentalSystem (Main Class)
System Requirements
Hardware: Minimum 4GB RAM
Software:
Java JDK (8 or above)
IDE (VS Code / Eclipse / IntelliJ)
How to Run
Install Java JDK
Open the project in your IDE

Compile the program:

javac VehicleRentalSystem.java

Run the program:

java VehicleRentalSystem
Sample Output
===== Vehicle Rental System =====
1. Rent Car
2. Rent Bike
Enter your choice: 1
Enter number of days: 3

--- Car Details ---
Vehicle Number: C101
Brand: Honda
Rent per Day: 1000
Total Rent for 3 days: 3500
Future Enhancements
Add database integration (MySQL)
Develop GUI using Java Swing or JavaFX
Add customer login system
Online booking feature
Payment gateway integration
📚 References
Java Programming – Herbert Schildt
Oracle Java Documentation
Online tutorials (GeeksforGeeks, W3Schools)
