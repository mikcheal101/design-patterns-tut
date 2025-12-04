package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public class DecoratorPattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Structural Design Patterns:");
        System.out.println("Decorator Design Pattern:");

        // Implementation of Decorator Pattern would go here
        var notifier = new Notifier("john_doe");
        notifier.send("Hello, this is a basic notification.");

        var facebookNotifier = new FacebookNotifier("john_doe");
        facebookNotifier.send("Hello, this is a Facebook notification.");

        var whatsappNotifier = new WhatsAppNotifier("john_doe");
        whatsappNotifier.send("Hello, this is a WhatsApp notification.");
    }
}
