package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class Toyota implements CarSpecification {

    String model;
    String engineType;
    String make;

    public Toyota() {
        this.model = "Toyota Camry";
        this.engineType = "V8";
        this.make = "Toyota";
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getEngineType() {
        return this.engineType;
    }

    @Override
    public String getMake() {
        return this.make;
    }

}
