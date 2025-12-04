package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class ItalianVeggiePizza extends VeggiePizza {

    public ItalianVeggiePizza() {
        this.sauce = "Marinara Sauce";
        this.topping = "Bell Peppers, Olives, Onions";
        this.crust = "Stuffed Crust";
    }

    @Override
    public void deliver() {
        System.out.println("Italian Veggie Pizza: Delivering a " + crust + " pizza with " + sauce + " and " + topping + ".");
    }

}
