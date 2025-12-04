package com.mikkytrionze.design.patterns.creational.prototypedesignpattern;

public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected int year;
    protected String color;

    public Vehicle() {
    }

    public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.year = vehicle.year;
        this.color = vehicle.color;
    }

    @Override
    public String toString() {
        return ": {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract Vehicle clone();
}
