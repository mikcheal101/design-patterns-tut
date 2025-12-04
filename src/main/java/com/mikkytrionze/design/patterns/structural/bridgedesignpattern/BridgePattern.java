package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class BridgePattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Structural Design Patterns:");
        System.out.println("Bridge Design Pattern:");

        // Implementation of Bridge Pattern would go here
        Pizza americanPepperoniPizza = new AmericanPepperoniPizza();
        americanPepperoniPizza.deliver();

        Pizza americanVeggiePizza = new AmericanVeggiePizza();
        americanVeggiePizza.deliver();

        Pizza italianPepperoniPizza = new ItalianPepperoniPizza();
        italianPepperoniPizza.deliver();

        Pizza italianVeggiePizza = new ItalianVeggiePizza();
        italianVeggiePizza.deliver();
    }
}
