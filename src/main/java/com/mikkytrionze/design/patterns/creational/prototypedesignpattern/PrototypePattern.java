package com.mikkytrionze.design.patterns.creational.prototypedesignpattern;

public class PrototypePattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Creational Design Patterns:");
        System.out.println("Prototype Design Pattern:");

        Vehicle toyota = new Car() {
            {
                brand = "Toyota";
                model = "Corolla";
                year = 2020;
                color = "Red";
                topSpeed = 180;
            }
        };
        Vehicle mercedes = toyota.clone();

        Vehicle danfo = new Bus();
        Vehicle moluwe = danfo.clone();

        System.out.println("Original Car: " + toyota);
        System.out.println("Cloned Car: " + mercedes);

        System.out.println("Original Bus: " + danfo);
        System.out.println("Cloned Bus: " + moluwe);

        Shape circlePrototype = new Circle(5);
        ShapeClient shapeClient = new ShapeClient(circlePrototype);
        Shape clonedCircle = shapeClient.createShape();
        clonedCircle.draw();
        
    }
}
