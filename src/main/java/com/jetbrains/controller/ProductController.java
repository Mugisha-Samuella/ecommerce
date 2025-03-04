package com.jetbrains.controller;

import com.jetbrains.dao.ProductOperations;
import com.jetbrains.model.Product;

public class ProductController {

    private ProductOperations productOperations = new ProductOperations();

    public void addProduct(String name, double price, int stock, int categoryId) {
        Product product = new Product(name, price, stock, categoryId);
        productOperations.addProduct(product);
    }

    public void updateProduct(Product product) {
        productOperations.updateProduct(product);
    }

    public void deleteProduct(int productId) {
        productOperations.deleteProduct(productId);
    }

    public void viewProduct(int productId) {
        productOperations.viewProduct(productId);
    }
}
