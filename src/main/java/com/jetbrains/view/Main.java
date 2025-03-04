package com.jetbrains.view;

import com.jetbrains.dao.CategoryOperations;
import com.jetbrains.dao.ProductOperations;
import com.jetbrains.model.Category;
import com.jetbrains.model.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductOperations productCRUD = new ProductOperations();
        CategoryOperations categoryCRUD = new CategoryOperations();

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
                    Product product = new Product(productName, price, stock, categoryId);
                    productCRUD.addProduct(product);
                }
                case 2 -> {
                    System.out.print("Enter Product ID: ");
                    int productId = scanner.nextInt();
                    productCRUD.viewProduct(productId);
                }
                case 3 -> {
                    System.out.print("Enter Product ID to Update: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter New Product Name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter New Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter New Stock: ");
                    int stock = scanner.nextInt();
                    System.out.print("Enter New Category ID: ");
                    int categoryId = scanner.nextInt();
                    Product product = new Product(productName, price, stock, categoryId);
                    product.setProductId(productId);
                    productCRUD.updateProduct(product);
                }
                case 4 -> {
                    System.out.print("Enter Product ID to Delete: ");
                    int productId = scanner.nextInt();
                    productCRUD.deleteProduct(productId);
                }
                case 5 -> {
                    System.out.print("Enter Category Name: ");
                    String categoryName = scanner.nextLine();
                    Category category = new Category(categoryName);
                    categoryCRUD.addCategory(category);
                }
                case 6 -> {
                    System.out.print("Enter Category ID: ");
                    int categoryId = scanner.nextInt();
                    categoryCRUD.viewCategory(categoryId);
                }
                case 7 -> {
                    System.out.print("Enter Category ID to Update: ");
                    int categoryId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter New Category Name: ");
                    String categoryName = scanner.nextLine();
                    Category category = new Category(categoryName);
                    category.setCategoryId(categoryId);
                    categoryCRUD.updateCategory(category);
                }
                case 8 -> {
                    System.out.print("Enter Category ID to Delete: ");
                    int categoryId = scanner.nextInt();
                    categoryCRUD.deleteCategory(categoryId);
                }
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
