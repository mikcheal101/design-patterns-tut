package com.mikkytrionze.design.patterns.structural.compositedesignpattern;

public class VideoGame extends Product {

    public VideoGame(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        double tax = 15.0 + (0.1 * price); // simulate some complex calculation
        double calculatedPrice = price + tax;
        System.out.printf("Calculated Price for video game '%s': %.2f%n", title, calculatedPrice);
        return calculatedPrice;
    }
}
