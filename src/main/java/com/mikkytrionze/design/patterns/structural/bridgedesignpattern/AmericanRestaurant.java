package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class AmericanRestaurant extends Restaurant {

    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void orderPizza() {
        System.out.println("Ordering pizza from American Restaurant.");
        pizza.prepare();
    }

    @Override
    public void addSauce() {
        System.out.println("Adding sauce: " + pizza.sauce);
    }

    @Override
    public void addTopping() {
        System.out.println("Adding topping: " + pizza.topping);
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
        System.out.println("Serving pizza from American Restaurant.");
    }

}
