package com.mikkytrionze.design.patterns;

import com.mikkytrionze.design.patterns.creational.abstractfactorypattern.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Creational Design Patterns:");

        var abstractFactoryPattern = new AbstractFactoryPattern();
        abstractFactoryPattern.run();
        
    }
}