# eCommerce System

## Overview

This project is a simple eCommerce system implemented in Java, allowing users to manage products and categories. It provides functionalities to add, view, update, and delete products and categories, utilizing a PostgreSQL database for data storage.

## Features

- **Product Management**: Add, view, update, and delete products.
- **Category Management**: Add, view, update, and delete categories.
- **Database Connectivity**: Connects to a PostgreSQL database to store product and category information.

## Technologies Used

- Java
- PostgreSQL
- JDBC (Java Database Connectivity)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- PostgreSQL database
- PostgreSQL JDBC Driver

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Mugisha-Samuella/ecommerce.git
   cd ecommerce-system
   ```

2. **Set up the database**:
   - Create a PostgreSQL database named `ecommerce`.
   - Create the necessary tables (`products` and `categories`) according to the schema used in the code.

3. **Configure Database Connection**:
   - Update the `DatabaseConnection.java` file with your PostgreSQL credentials.

4. **Compile and Run**:
   ```bash
   javac -d bin src/com/jetbrains/*.java
   java -cp bin com.jetbrains.Main
   ```

## Usage

- Follow the on-screen prompts to manage products and categories within the system.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

## Acknowledgements

- PostgreSQL for the database management system.
- Java for the programming language.😂
