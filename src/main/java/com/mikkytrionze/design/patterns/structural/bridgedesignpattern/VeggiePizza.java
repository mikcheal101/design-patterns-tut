package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        this.sauce = "Pesto Sauce";
        this.topping = "Bell Peppers, Olives, Onions";
        this.crust = "Whole Wheat Crust";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza with " + sauce + ", " + topping + " on " + crust);
    }

    @Override
    public void bake() {
        System.out.println("Baking Veggie Pizza at 425 degrees for 15 minutes.");
    }

    @Override
    public void box() {
        System.out.println("Boxing Veggie Pizza in eco-friendly packaging.");
    }
}
