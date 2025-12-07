package com.mikkytrionze.design.patterns.behavioural.visitordesignpattern;

import java.util.ArrayList;
import java.util.List;

public class VisitorPattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Behavioural Design Patterns:");
        System.out.println("Visitor Design pattern");

        /// Implementation goes here
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(100.0));
        shapes.add(new Square(23.12));
        shapes.add(new Triangle(15.0, 20.0));

        AreaCalculator areaCalculator = new AreaCalculator();
        shapes.forEach(shape -> shape.accept(areaCalculator));

        System.out.printf("Total area: %.2f", areaCalculator.getTotalAreas());
        System.out.println();
    }

}
