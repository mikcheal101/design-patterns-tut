package com.mikkytrionze.design.patterns.behavioural.statedesignpattern;

public class OffState extends State {

    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        this.phone.setState(new LockedState(this.phone));
        return this.phone.turnOn();
    }

    @Override
    public String onOffOn() {
        this.phone.setState(new LockedState(this.phone));
        return this.phone.turnOn();
    }
}
