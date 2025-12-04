package com.mikkytrionze.design.patterns.structural.adapterdesignpattern;

public class MultiRestoApp implements IMultiRestoApp {
    @Override
    public void displayMenu(XmlData xmlData) {
        System.out.println("Displaying menu from XML data");
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        System.out.println("Displaying recommendations from XML data");
    }
}
