package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class AmericanVeggiePizza extends VeggiePizza {

    public AmericanVeggiePizza() {
        this.sauce = "Barbecue Sauce";
        this.topping = "Bell Peppers, Onions, Mushrooms";
        this.crust = "Thick Crust";
    }

    @Override
    public void deliver() {
        System.out.println("American Veggie Pizza: Delivering a " + crust + " pizza with " + sauce + " and " + topping + ".");
    }

}
