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
        Box box = new Box(
            Arrays.asList(
                new Box(
                    Collections.emptyList(),
                    Arrays.asList(
                        new Product("Trouser Zipper", 15.0),
                        new Product("Shirt Buttons", 25.0)
                    )
                ),
                new Box(
                    Collections.emptyList(),
                    Arrays.asList(
                        new Product("Water Jar", 30.0),
                        new Product("Cooking Pot", 40.0)
                    )
                )
            ),
            Arrays.asList(
                new Product("Jeans Sweater", 10.0),
                new Product("Apron", 20.0)
            )
        );


        box.getProducts();
        box.getBoxes();
        System.out.println("-----------------------");
        System.out.println("Total Price: $" + box.calculatePrice());
    }

}
