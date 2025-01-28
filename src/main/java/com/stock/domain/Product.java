package com.stock.domain;

import lombok.Data;

@Data
public class Product {
    
    private int id;
    private String name;
    private int quantity;
    private double unitPrice;

    public Product (int id, String name, int quantity, double unitPrice) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotalAmount() {
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + name + " | Quantidade: " + quantity + 
               " | Preço Unitário: " + unitPrice + 
               " | Valor Total: " + getTotalAmount();
    }
}
