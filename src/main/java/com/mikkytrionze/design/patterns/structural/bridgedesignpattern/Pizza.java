package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public abstract class Pizza {

    protected String sauce;
    protected String topping;
    protected String crust;

    public abstract void deliver();
}
