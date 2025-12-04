package com.mikkytrionze.design.patterns.structural.compositedesignpattern;

public class Book extends Product {

    public Book(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        double tax = 5.0 + (0.05 * price); // simulate some complex calculation
        double calculatedPrice = price + tax;
        System.out.printf("Calculated Price for book '%s': %.2f%n", title, calculatedPrice);
        return calculatedPrice;
    }
}
