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
            }
        }
    }
}
