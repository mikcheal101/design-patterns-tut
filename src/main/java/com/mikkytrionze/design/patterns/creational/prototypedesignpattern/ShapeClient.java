package com.mikkytrionze.design.patterns.creational.prototypedesignpattern;

public class ShapeClient {

    private Shape prototypeShape;

    public ShapeClient(Shape prototypeShape) {
        this.prototypeShape = prototypeShape;
    }

    public Shape createShape() {
        return prototypeShape.clone();
    }
}
