package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class MsiMonitor  implements Monitor {
    @Override
    public void couple() {
        System.out.println("MSI Monitor coupled.");
    }
}
