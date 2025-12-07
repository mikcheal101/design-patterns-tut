package com.mikkytrionze.design.patterns.behavioural.visitordesignpattern;

public class Square implements Shape {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
