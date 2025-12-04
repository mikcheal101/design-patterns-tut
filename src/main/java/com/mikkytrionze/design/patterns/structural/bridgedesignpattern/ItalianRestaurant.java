package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class ItalianRestaurant extends Restaurant {

    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void orderPizza() {
        System.out.println("Ordering pizza from Italian Restaurant.");
        pizza.prepare();
    }

    @Override
    public void addSauce() {
        System.out.println("Adding authentic Italian sauce.");
    }

    @Override
    public void addTopping() {
        System.out.println("Adding traditional Italian toppings.");
    }

    @Override
    public void bakePizza() {
        pizza.bake();
    }

    @Override
    public void boxPizza() {
        pizza.box();
    }

    @Override
    public void servePizza() {
        System.out.println("Serving pizza with a side of olive oil and herbs.");
    }
}
