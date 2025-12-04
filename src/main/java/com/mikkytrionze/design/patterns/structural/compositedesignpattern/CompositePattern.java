package com.mikkytrionze.design.patterns.structural.compositedesignpattern;

import java.util.Arrays;
import java.util.Collections;

public class CompositePattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Structural Design Patterns:");
        System.out.println("Composite Design Pattern:");

        // Implementation of Composite Pattern would go here
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
            new CompositeBox(
                new VideoGame("The Legend of Zelda, Breath of the Wild", 59.99),
                new VideoGame("Super Mario Odyssey", 49.99)
            ),
            new CompositeBox(
                new CompositeBox(
                    new Book("1984 by George Orwell", 19.99),
                    new Book("To Kill a Mockingbird by Harper Lee", 14.99),
                    new Book("The Great Gatsby by F. Scott Fitzgerald", 10.99)
                ),
                new VideoGame("Animal Crossing: New Horizons", 89.99),
                new Book("The Catcher in the Rye by J.D. Salinger", 12.99)
            )
        );
        double totalPrice = deliveryService.calculateOrderPrice();
        System.out.printf("Total order price: $%.2f%n", totalPrice);
    }

}
