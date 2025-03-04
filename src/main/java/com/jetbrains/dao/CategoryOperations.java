package com.jetbrains.dao;

import com.jetbrains.model.Category;
import com.jetbrains.model.DatabaseConnection;
import java.sql.*;

public class CategoryOperations {

    // Add a new category
    public void addCategory(Category category) {
        String query = "INSERT INTO categories (category_name) VALUES (?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, category.getCategoryName());
            ps.executeUpdate();
            System.out.println("Category added successfully!");
        } catch (SQLException e) {
            System.err.println("Error adding category: " + e.getMessage());
        }
    }

    // Update an existing category
    public void updateCategory(Category category) {
        String query = "UPDATE categories SET category_name = ? WHERE category_id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, category.getCategoryName());
            ps.setInt(2, category.getCategoryId());
            ps.executeUpdate();
            System.out.println("Category updated successfully!");
        } catch (SQLException e) {
            System.err.println("Error updating category: " + e.getMessage());
        }
    }

    // Delete a category by ID
    public void deleteCategory(int categoryId) {
        String query = "DELETE FROM categories WHERE category_id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, categoryId);
            ps.executeUpdate();
            System.out.println("Category deleted successfully!");
        } catch (SQLException e) {
            System.err.println("Error deleting category: " + e.getMessage());
        }
    }

    // View a category by ID
    public void viewCategory(int categoryId) {
        String query = "SELECT * FROM categories WHERE category_id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Category ID: " + rs.getInt("category_id"));
                System.out.println("Category Name: " + rs.getString("category_name"));
            } else {
                System.out.println("Category not found.");
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving category: " + e.getMessage());
        }
    }
}
