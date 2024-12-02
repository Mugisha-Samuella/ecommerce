package com.jetbrains;

public class Category {
    private int categoryId;
    private String categoryName;

    // Default Constructor
    public Category() {}

    // Parameterized Constructor
    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    // Getters and Setters
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
