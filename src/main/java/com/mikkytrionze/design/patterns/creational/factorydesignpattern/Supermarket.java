package com.mikkytrionze.design.patterns.creational.factorydesignpattern;

public class Supermarket {

    Product product;

    public Supermarket(ProductFactory factory) {
        product = factory.createProduct();
    }

    public Product getProduct() {
        return product;
    }

    public void sellProduct() {
        System.out.println("Selling product: " + product.getName());
    }
}
