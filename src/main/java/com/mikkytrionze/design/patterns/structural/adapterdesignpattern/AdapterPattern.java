package com.mikkytrionze.design.patterns.structural.adapterdesignpattern;

public class AdapterPattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Structural Design Patterns:");
        System.out.println("Adapter Design Pattern:");

        // Implementation of Adapter Pattern would go here
        // The old client pattern / style.
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenu(new XmlData() {
            // Implementation details
        });
        multiRestoApp.displayRecommendations(new XmlData() {
            // Implementation details
        });

        // The new fancy UI service with an adapter.
        IMultiRestoApp fancyUIServiceAdapter = new FancyUIServiceAdapter();
        fancyUIServiceAdapter.displayMenu(new XmlData() {
            // Implementation details
        });
        fancyUIServiceAdapter.displayRecommendations(new XmlData() {
            // Implementation details
        });
    }
}
