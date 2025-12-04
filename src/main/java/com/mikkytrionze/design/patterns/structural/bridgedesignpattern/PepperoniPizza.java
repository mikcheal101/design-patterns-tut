package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        this.sauce = "Tomato Sauce";
        this.topping = "Pepperoni";
        this.crust = "Thin Crust";
    }

    @Override
    public void deliver() {
        System.out.println("Delivering a " + crust + " pizza with " + sauce + " and " + topping + ".");
    }

}
