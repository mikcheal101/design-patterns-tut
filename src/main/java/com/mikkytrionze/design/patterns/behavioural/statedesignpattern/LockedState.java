package com.mikkytrionze.design.patterns.behavioural.statedesignpattern;

public class LockedState extends State {

    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        this.phone.setState(new ReadyState(this.phone));
        return this.phone.unlock();
    }

    @Override
    public String onOffOn() {
        this.phone.setState(new OffState(this.phone));
        return this.phone.lock();
    }
}
