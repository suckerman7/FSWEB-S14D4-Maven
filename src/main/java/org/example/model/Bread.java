package org.example.model;

public class Bread extends ProductForSale {
    private String doughSize;

    public Bread(String type, int price, String description, String doughSize) {
        super(type, price, description);
        this.doughSize = doughSize;
    }

    public String getDoughSize() {
        return doughSize;
    }

    @Override
    public void showDetails() {
        System.out.println("Type of chocolate: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Dough size: " + getDoughSize());
    }
}
