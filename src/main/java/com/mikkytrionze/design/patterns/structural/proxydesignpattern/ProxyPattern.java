package com.mikkytrionze.design.patterns.structural.proxydesignpattern;

public class ProxyPattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Structural Design Patterns:");
        System.out.println("Proxy Design Pattern:");

        // Implementation of Proxy Pattern would go here
        Internet internet = new RealInternet();
        internet.connectTo("example.com");
        internet.connectTo("blocked.com");
    }
}
