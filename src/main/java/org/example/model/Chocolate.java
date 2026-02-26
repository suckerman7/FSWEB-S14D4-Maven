package org.example.model;

public class Chocolate extends ProductForSale {
    private String cocoaPercentage;

    public Chocolate(String type, int price, String description, String cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    public String getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Type of chocolate: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa percentage: " + getCocoaPercentage());
    }
}
