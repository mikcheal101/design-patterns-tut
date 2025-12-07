package com.mikkytrionze.design.patterns.behavioural.visitordesignpattern;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
