package org.example.model;

public class Coke extends ProductForSale {
    private String sugarPercentage;

    public Coke(String type, int price, String description, String sugarPercentage) {
        super(type, price, description);
        this.sugarPercentage = sugarPercentage;
    }

    public String getSugarPercentage() {
        return sugarPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Type of chocolate: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Sugar percentage: " + getSugarPercentage());
    }
}
