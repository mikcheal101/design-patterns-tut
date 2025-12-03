package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class WindowsTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering Windows text field");
    }
}
