package com.mikkytrionze.design.patterns.creational.prototypedesignpattern;

public class Car extends Vehicle {
    protected int topSpeed;

    public Car() {
    }

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
