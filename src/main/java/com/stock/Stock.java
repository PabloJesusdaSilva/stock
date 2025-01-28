package com.stock;

import java.util.ArrayList;
import java.util.List;

import com.stock.domain.Product;

public class Stock {
    
    List<Product> products;

    public Stock() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        for (Product item: products) {
            if(item.getId() == product.getId()) {
                System.err.print("Existing product!");
            }

            products.add(product);
        }
    }

    public void removeProduct(int id) {
        for (Product item: products) {
            if(item.getId() == id) {
                products.remove(item);
            } else {
                System.err.println("Product not exists");
            }
        }
    }

    public void updateProductQuantity(int id, int newQuantity) {
        for (Product item: products) {
            if(item.getId() == id) {
                if(newQuantity < 0) {
                    System.err.println("Enter a valid number (> 0)");
                }

                item.setQuantity(newQuantity);
                System.out.println("Quantity successfully updated!");
            }
        }
    }

    public void displayStock() {
        if (products.isEmpty()) {
            System.err.println("The stock is empty!");
        } else {
            System.out.println("Currenty stock: ");

            for (Product item: products) {
                System.out.println(item);
            }
        }
    }
}
