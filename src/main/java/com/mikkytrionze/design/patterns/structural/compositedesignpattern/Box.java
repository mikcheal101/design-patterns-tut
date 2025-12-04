package com.mikkytrionze.design.patterns.structural.compositedesignpattern;

import java.util.List;

public class Box {

    private List<Box> boxes;
    private List<Product> products;

    public Box(List<Box> boxes, List<Product> products) {
        this.boxes = boxes;
        this.products = products;
    }

    public List<Box> getBoxes() {
        for (Box box : boxes) {
            box.getProducts();
        }
        return boxes;
    }

    public List<Product> getProducts() {
        System.out.println("Products in the box:");
        for (Product product : products) {
            System.out.println("- " + product.getTitle() + ": $" + product.getPrice());
        }
        System.out.println();
        return products;
    }

    public double calculatePrice() {
        double sum = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        for (Box box : boxes) {
            sum += box.calculatePrice();
        }
        return sum;
    }
}
