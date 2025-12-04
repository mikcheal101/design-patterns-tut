package com.mikkytrionze.design.patterns.structural.compositedesignpattern;

public class DeliveryService {

    private Box box;

    public DeliveryService() {}

    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }

    public double calculateOrderPrice() {
        if (box == null) {
            return 0;
        }
        return box.calculatePrice();
    }
}
