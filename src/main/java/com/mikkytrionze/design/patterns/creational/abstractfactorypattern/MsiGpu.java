package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Assembling MSI GPU");
    }
}
