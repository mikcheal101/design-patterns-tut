package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class MacOsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public TextField createTextField() {
        return new MacOsTextField();
    }
}
