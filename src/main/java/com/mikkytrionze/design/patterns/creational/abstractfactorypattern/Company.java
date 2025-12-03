package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public abstract class Company {

    public Gpu assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();
}
