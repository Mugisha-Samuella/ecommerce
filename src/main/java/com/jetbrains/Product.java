package com.jetbrains;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private int stock;
    private int categoryId;

    // Constructor with four arguments
    public Product(String productName, double price, int stock, int categoryId) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.categoryId = categoryId;
    }

    // Optional: No-argument constructor (if needed elsewhere)
    public Product() {}

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
