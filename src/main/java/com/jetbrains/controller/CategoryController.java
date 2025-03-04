package com.jetbrains.controller;

import com.jetbrains.dao.CategoryOperations;
import com.jetbrains.model.Category;

public class CategoryController {

    private CategoryOperations categoryOperations = new CategoryOperations();

    // Add a new category
    public void addCategory(String categoryName) {
        Category category = new Category(categoryName);
        categoryOperations.addCategory(category);
    }

    // Update an existing category
    public void updateCategory(int categoryId, String newCategoryName) {
        Category category = new Category(newCategoryName);
        category.setCategoryId(categoryId);
        categoryOperations.updateCategory(category);
    }

    // Delete a category by ID
    public void deleteCategory(int categoryId) {
        categoryOperations.deleteCategory(categoryId);
    }

    // View a category by ID
    public void viewCategory(int categoryId) {
        categoryOperations.viewCategory(categoryId);
    }
}
