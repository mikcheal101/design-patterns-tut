package com.mikkytrionze.design.patterns.creational.factorydesignpattern;

public class FactoryPattern {
    public void run() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Creational Design Patterns:");
        System.out.println("Factory Design Pattern:");

        // Using the Factory Design Pattern
        ProductFactory appleFactory = new AppleFactory();
        Supermarket supermarket = new Supermarket(appleFactory);
        supermarket.sellProduct();
        System.out.println("Product obtained from supermarket: " + supermarket.getProduct().getName());

        ProductFactory mangoFactory = new MangoFactory();
        supermarket = new Supermarket(mangoFactory);
        supermarket.sellProduct();
        System.out.println("Product obtained from supermarket: " + supermarket.getProduct().getName());

        var cashewFactory = new CashewFactory();
        supermarket = new Supermarket(cashewFactory);
        supermarket.sellProduct();
        System.out.println("Product obtained from supermarket: " + supermarket.getProduct().getName());
    }
}
