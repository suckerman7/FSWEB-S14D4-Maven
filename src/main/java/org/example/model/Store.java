package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = {
                new Chocolate("Dark", 10, "Bitter chocolate", "50%"),
                new Coke("Light Coke", 25, "Light Sugar-Free Coke", "0%"),
                new Bread("Round Bread", 30, "Round bread with great puff", "10")
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("----------------");
        }
    }
}