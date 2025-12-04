package com.mikkytrionze.design.patterns.creational.prototypedesignpattern;

public class Bus extends Vehicle {
    private int seatingCapacity;
    private int numberOfDoors;

    public Bus() {
    }

    public Bus(Bus bus) {
        super(bus);
        this.seatingCapacity = bus.seatingCapacity;
        this.numberOfDoors = bus.numberOfDoors;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }

}
