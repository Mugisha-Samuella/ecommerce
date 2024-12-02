package com.jetbrains;

import java.sql.*;

public class ProductOperations {

    // Method to add a new product
    public void addProduct(Product product) {
        String query = "INSERT INTO products (product_name, price, stock, category_id) VALUES (?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, product.getProductName());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getStock());
            ps.setInt(4, product.getCategoryId());
            ps.executeUpdate();
            System.out.println("Product added successfully!");
        } catch (SQLException e) {
            System.err.println("Error adding product: " + e.getMessage());
        }
    }

    // Method to view a product based on product ID
    public void viewProduct(int productId) {
        String query = "SELECT * FROM products WHERE product_id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, productId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Product ID: " + rs.getInt("product_id"));
                    System.out.println("Product Name: " + rs.getString("product_name"));
                    System.out.println("Price: " + rs.getDouble("price"));
                    System.out.println("Stock: " + rs.getInt("stock"));
                } else {
                    System.out.println("No product found with ID: " + productId);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error viewing product: " + e.getMessage());
        }
    }

    // Method to update an existing product
    public void updateProduct(Product product) {
        String query = "UPDATE products SET product_name = ?, price = ?, stock = ?, category_id = ? WHERE product_id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, product.getProductName());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getStock());
            ps.setInt(4, product.getCategoryId());
            ps.setInt(5, product.getProductId());
            ps.executeUpdate();
            System.out.println("Product updated successfully!");
        } catch (SQLException e) {
            System.err.println("Error updating product: " + e.getMessage());
        }
    }

    // Method to delete a product based on product ID
    public void deleteProduct(int productId) {
        String query = "DELETE FROM products WHERE product_id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, productId);
            ps.executeUpdate();
            System.out.println("Product deleted successfully!");
        } catch (SQLException e) {
            System.err.println("Error deleting product: " + e.getMessage());
        }
    }
}
