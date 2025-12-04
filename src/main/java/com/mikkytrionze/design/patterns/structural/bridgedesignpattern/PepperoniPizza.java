package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        this.sauce = "Tomato Sauce";
        this.topping = "Pepperoni";
        this.crust = "Thin Crust";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza with " + sauce + ", " + topping + " on " + crust);
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni Pizza at 450 degrees for 12 minutes.");
    }

    @Override
    public void box() {
        System.out.println("Boxing Pepperoni Pizza in standard packaging.");
    }
}
