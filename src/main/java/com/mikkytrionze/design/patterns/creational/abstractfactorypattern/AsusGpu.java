
package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class AsusGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Assembling ASUS GPU");
    }
}
