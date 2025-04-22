#Java OOP Exercise – Vehicle Inheritance Project

This project is a Java-based object-oriented programming (OOP) exercise demonstrating the use of **inheritance**, **method overriding**, and **polymorphism**. It includes the creation of a base class `Vehicule` and two subclasses `Voiture` and `Moto`, showcasing how Java handles class hierarchies, constructors, method overrides, and type checking using `instanceof`.

## 📚 Exercise Summary

### 1. Class Structure

- **Vehicule** (Base class)
  - Attribute: `modele` (String)
  - Method: `afficherDetails()`

- **Voiture** (Subclass of Vehicule)
  - Additional attribute: `nombrePortes` (int)
  - Overrides `afficherDetails()` to display `modele` and `nombrePortes`

- **Moto** (Subclass of Vehicule)
  - Additional attribute: `cylindree` (int)
  - Overrides `afficherDetails()` to display `modele` and `cylindree`

All classes include **getters and setters**.

---

### 2. Use of `super`

- Constructors of `Voiture` and `Moto` use `super()` to call the parent constructor of `Vehicule`.
- Overridden methods in `Voiture` and `Moto` use `super.afficherDetails()` to extend the base implementation.

---

### 3. Main Class Functionality

- Creates an `ArrayList<Vehicule>` and populates it with:
  - 2 instances of `Voiture`
  - 2 instances of `Moto`
  - 2 instances of `Vehicule`
- Iterates through the list and calls `afficherDetails()` on each element.
- Includes a method that:
  - Accepts a `List<Vehicule>`
  - Counts how many are instances of `Voiture` and `Moto` using `instanceof`
- Demonstrates the behavior of calling subclass-specific methods (e.g., `getNombrePortes()`) on a base class reference.

---

## 🛠 Technologies Used

- Java
- Object-Oriented Programming (Inheritance, Polymorphism)
- IntelliJ / Eclipse / Terminal (any Java IDE)

---

## 📂 Project Structure

