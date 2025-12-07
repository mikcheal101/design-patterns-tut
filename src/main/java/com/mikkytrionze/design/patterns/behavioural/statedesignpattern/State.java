package com.mikkytrionze.design.patterns.behavioural.statedesignpattern;

public abstract class State {
    
    protected final Phone phone;

    protected State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onHome();
    public abstract String onOffOn();
}
