package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public class DecoratorPattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Structural Design Patterns:");
        System.out.println("Decorator Design Pattern:");

        // Implementation of Decorator Pattern would go here
        INotifier notifier = new FacebookDecorator(new WhatsAppDecorator(new Notifier("Helloworld")));
        notifier.send("This is a notification message!!!");
    }
}
