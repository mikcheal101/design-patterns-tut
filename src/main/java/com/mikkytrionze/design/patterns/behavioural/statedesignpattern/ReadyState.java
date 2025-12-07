package com.mikkytrionze.design.patterns.behavioural.statedesignpattern;

public class ReadyState extends State {

    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        return this.phone.home();
    }

    @Override
    public String onOffOn() {
        this.phone.setState(new OffState(this.phone));
        return this.phone.lock();
    }
}
