package com.mikkytrionze.design.patterns.creational.factorydesignpattern;

public class Mango implements Product {
    @Override
    public void sell() {
        System.out.println("Selling a mango.");
    }

    @Override
    public String getName() {
        return "Mango";
    }

}
