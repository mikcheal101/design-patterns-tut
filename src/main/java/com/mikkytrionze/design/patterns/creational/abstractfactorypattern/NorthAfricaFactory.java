package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class NorthAfricaFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification setSpecifications() {
        return new Toyota();
    }
}
