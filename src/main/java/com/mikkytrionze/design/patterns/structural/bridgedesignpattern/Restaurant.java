package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public abstract class Restaurant {

    protected Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract void orderPizza();
    public abstract void addSauce();
    public abstract void addTopping();
    public abstract void bakePizza();
    public abstract void boxPizza();
    public abstract void servePizza();

    public void processOrder() {
        orderPizza();
        addSauce();
        addTopping();
        bakePizza();
        boxPizza();
        servePizza();
    }
}
