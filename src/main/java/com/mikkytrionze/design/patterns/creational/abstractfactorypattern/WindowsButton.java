package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows button");
    }
}
