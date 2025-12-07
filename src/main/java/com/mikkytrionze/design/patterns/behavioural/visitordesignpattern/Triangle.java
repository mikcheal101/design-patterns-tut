package com.mikkytrionze.design.patterns.behavioural.visitordesignpattern;

public class Triangle implements Shape {

    private final double height;
    private final double base;

    public Triangle(double height, double base) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getBase() {
        return this.base;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
