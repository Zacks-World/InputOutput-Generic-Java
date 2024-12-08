# Java Programming Laboratory

This repository contains solutions to various Java exercises that demonstrate essential programming concepts like file handling, object serialization, and interface implementation. Each exercise is self-contained and addresses a specific use case.

## Table of Contents
1. [Exercise 1: Simulating the `ls` Command](#exercise-1-simulating-the-ls-command)
2. [Exercise 2: Phonebook Management](#exercise-2-phonebook-management)
3. [Exercise 3: Managing Products and Clients](#exercise-3-managing-products-and-clients)
4. [How to Run](#how-to-run)
5. [Technologies Used](#technologies-used)

---

## Exercise 1: Simulating the `ls` Command

**Objective**: Develop a Java program to simulate the `ls` command. This program:
- Lists files and directories for a given path.
- Recursively explores subdirectories.
- Displays file type (`<DIR>` for directories, `<FILE>` for files) and access modes:
  - `r`: Readable.
  - `w`: Writable.
  - `h`: Hidden.

### Example Output:

![DossierFiles](https://github.com/user-attachments/assets/6621cdd0-22d5-4874-b217-2060ca447063)

---

##Exercise 2: Phonebook Management

**Objective**: Develop a Java application to manage a phonebook where:
- Each contact's name and phone number is stored in separate files.
- The phonebook is updated based on user interactions.

### Features:
1. **Search Contact**: Retrieve a phone number by name.
2. **Add Contact**: Create a new contact.
3. **Delete Contact**: Remove an existing contact.
4. **Update Contact**: Change a contact's phone number.
5. **Persistent Data**: Automatically reads and writes contact data to files during application runtime.

### Class Design:
- **`DossierContact`**:
  - Attributes:
    - `List<String> Noms`: List of contact names.
    - `List<String> Tels`: List of corresponding phone numbers.
  - Methods:
    - Add, delete, search, and update contacts.

### Menu Options:
1. Rechercher un numéro de téléphone.
2. Ajouter un nouveau contact.
3. Supprimer un contact.
4. Changer le numéro de téléphone d’un contact.
5. Quitter ce programme.


---

## Exercise 3: Managing Products and Clients

**Objective**: Use Java serialization and generics to manage collections of products and clients. Data is read from and written to files for persistence.

### **Part 1: Product Management**
- **`Produit` Class**:
  - Attributes: `nom`, `marque`, `prix`, `description`, `nombreEnStock`.
  - Implements `Serializable`.

- **Features**:
  1. Display all products.
  2. Search for a product by name.
  3. Add a new product.
  4. Delete a product by name (removes all occurrences).
  5. Save all products to a file (`produits.dat`).

### **Part 2: Client Management**
- **`Client` Class**:
  - Attributes: `nom`, `prenom`, `adresse`, `tel`, `email`.
  - Implements `Serializable`.

- **Features**:
  1. Display all clients.
  2. Search for a client by name.
  3. Add a new client.
  4. Delete a client by name (removes all occurrences).
  5. Save all clients to a file (`clients.dat`).

### **Shared Design via `IMetier` Interface**:
A generic interface `IMetier<T>` with the following methods:
- `T add(T o)`: Adds an object to the list.
- `List<T> getAll()`: Reads all objects from a file and returns them as a list.
- `T findByNom(String nom)`: Finds an object by name.
- `void delete(String nom)`: Deletes an object by name.
- `void saveAll()`: Saves all objects to a file.

---

## How to Run

### Prerequisites
1. Java Development Kit (JDK) 8 or later.
2. IDE.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/Zacks-World/java-lab.git
   cd java-lab
   
## Technologies Used
- Java: Programming language.
- Object-Oriented Programming (OOP): Core design principle.
- Serialization: For file persistence in Exercise 3.
- File I/O: To read/write .txt and .dat files.
- Generics: Used in IMetier interface.
