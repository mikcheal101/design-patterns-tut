package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class Lexus implements CarSpecification {

    private String model;
    private String engineType;
    private String make;

    public Lexus() {
        this.model = "LS 570";
        this.engineType = "V8 Engine";
        this.make = "Saloon Motors";
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
