package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        this.sauce = "Pesto Sauce";
        this.topping = "Bell Peppers, Olives, Onions";
        this.crust = "Whole Wheat Crust";
    }

    @Override
    public void deliver() {
        System.out.println("Delivering a " + crust + " pizza with " + sauce + " and " + topping + ".");
    }

}
