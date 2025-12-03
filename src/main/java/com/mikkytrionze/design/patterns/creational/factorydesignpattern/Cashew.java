package com.mikkytrionze.design.patterns.creational.factorydesignpattern;

public class Cashew implements Product {
    @Override
    public void sell() {
        System.out.println("Selling a cashew.");
    }

    @Override
    public String getName() {
        return "Cashew";
    }
}
