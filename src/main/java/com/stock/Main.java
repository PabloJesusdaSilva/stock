package com.stock;

import java.util.Scanner;

import com.stock.domain.Product;

public class Main {
    public static void main(String[] args) {

        Stock stock = new Stock();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Display Stock");
            System.out.println("5. exit");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();

            if(option == 1) {
                System.out.print("\nEnter the id: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter the name: ");
                String name = scanner.nextLine();

                System.out.print("Enter the quantity: ");
                int quantity = scanner.nextInt();

                System.out.print("Enter the unit price: ");
                double unitPrice = scanner.nextDouble();

                Product product = new Product(id, name, quantity, unitPrice);

                stock.addProduct(product);
            } else if (option == 2) {
                System.out.print("Enter the product id: ");
                int id = scanner.nextInt();

                stock.removeProduct(id);
                System.out.println("Product successfully removed!");
            } else if (option == 3) {
                System.out.print("Enter the product id: ");
                int id = scanner.nextInt();

                System.out.print("Enter the new quantity: ");
                int newQuantity = scanner.nextInt();

                stock.updateProductQuantity(id, newQuantity);
            } else if (option == 4) {
                stock.displayStock();
            } else if (option == 5) {
                System.out.print("Finished system...");
                break;
            } else {
                System.err.println("Invalid option!");
            }
        }

        scanner.close();
    }
}