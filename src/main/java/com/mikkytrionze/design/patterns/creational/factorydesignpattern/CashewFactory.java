package com.mikkytrionze.design.patterns.creational.factorydesignpattern;

public class CashewFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        System.out.println("Cashew Created!");
        return new Cashew();
    }
}
