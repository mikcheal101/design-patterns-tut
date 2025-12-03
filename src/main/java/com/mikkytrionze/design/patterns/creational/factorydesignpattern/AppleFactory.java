package com.mikkytrionze.design.patterns.creational.factorydesignpattern;

public class AppleFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        System.out.println("Apple created!");
        return new Apple();
    }

}
