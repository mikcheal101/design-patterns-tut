package com.mikkytrionze.design.patterns.behavioural.commanddesignpattern;

public abstract class Room {

    private Light light;

    protected Room() {
        this.light = new Light();
    }

    public void switchLights() {
        this.light.setSwitchedOn(!this.light.isSwitchedOn());
    }
}
