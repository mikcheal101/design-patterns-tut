package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public abstract class CarFactory {

    void assembleCar() {
        var car = createCar();
        var specs = setSpecifications();
        System.out.println("Assembling " + specs.getMake() + " " + specs.getModel() + " with engine: " + specs.getEngineType());
        car.drive();
    }

    public abstract Car createCar();
    public abstract CarSpecification setSpecifications();
}
