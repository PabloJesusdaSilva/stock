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
        for (Product p: products) {
            if(p.getId() == product.getId()) {
                System.err.print("Existing product!");
            }

            this.products.add(product);
        }
    }
}
