package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class MacOsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering MacOS button");
    }
}
