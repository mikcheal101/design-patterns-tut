package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class MacOsTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering MacOS text field");
    }
}
