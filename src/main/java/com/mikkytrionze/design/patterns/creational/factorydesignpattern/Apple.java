package com.mikkytrionze.design.patterns.creational.factorydesignpattern;

public class Apple implements Product {
    @Override
    public void sell() {
        System.out.println("Selling an apple.");
    }

    @Override
    public String getName() {
        return "Apple";
    }
}
