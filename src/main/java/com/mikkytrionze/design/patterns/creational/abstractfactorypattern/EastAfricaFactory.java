package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class EastAfricaFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new Jeep();
    }

    @Override
    public CarSpecification setSpecifications() {
        return new Lexus();
    }
}
