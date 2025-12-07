package com.mikkytrionze.design.patterns.behavioural.visitordesignpattern;

public class AreaCalculator implements ShapeVisitor {

    private double totalValue = 0;

    @Override
    public void visit(Circle circle) {
        this.totalValue += Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public void visit(Square square) {
        this.totalValue += Math.pow(square.getSide(), 2);
    }

    @Override
    public void visit(Triangle triangle) {
        this.totalValue += (triangle.getBase() * triangle.getHeight()) / 2;
    }

    public double getTotalAreas() {
        return this.totalValue;
    }
}
