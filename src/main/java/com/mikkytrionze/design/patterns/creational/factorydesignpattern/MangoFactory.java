package com.mikkytrionze.design.patterns.creational.factorydesignpattern;

public class MangoFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        System.out.println("Mango created!");
        return new Mango();
    }

}
