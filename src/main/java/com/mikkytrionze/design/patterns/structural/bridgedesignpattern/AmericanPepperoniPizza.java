package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class AmericanPepperoniPizza extends PepperoniPizza {

    public AmericanPepperoniPizza() {
        this.sauce = "Barbecue Sauce";
        this.topping = "Spicy Pepperoni";
        this.crust = "Thick Crust";
    }

    @Override
    public void deliver() {
        System.out.println("American Pepperoni Pizza: Delivering an American style " + crust + " pizza with " + sauce + " and " + topping + ".");
    }

}
