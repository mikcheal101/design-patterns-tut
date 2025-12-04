package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class ItalianPepperoniPizza extends PepperoniPizza {

    public ItalianPepperoniPizza() {
        this.sauce = "Marinara Sauce";
        this.topping = "Spicy Italian Pepperoni";
        this.crust = "Thin Crust";
    }

    @Override
    public void deliver() {
        System.out.println("Italian Pepperoni Pizza: Delivering an Italian style " + crust + " pizza with " + sauce + " and " + topping + ".");
    }
}
