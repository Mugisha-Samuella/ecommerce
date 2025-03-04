package com.jetbrains.view;

import com.jetbrains.controller.ProductController;
import com.jetbrains.controller.CategoryController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductController productController = new ProductController();
        CategoryController categoryController = new CategoryController();

        while (true) {
            System.out.println("\nWelcome to the eCommerce System!");
            System.out.println("1. Add Product");
            System.out.println("2. View Product");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Add Category");
            System.out.println("6. View Category");
            System.out.println("7. Update Category");
            System.out.println("8. Delete Category");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number between 1 and 9.");
                scanner.nextLine(); // Clear invalid input
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Product Name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Stock: ");
                    int stock = scanner.nextInt();
                    System.out.print("Enter Category ID: ");
                    int categoryId = scanner.nextInt();
                    productController.addProduct(productName, price, stock, categoryId);
                }
                // Handle other CRUD operations...
                case 9 -> {
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
