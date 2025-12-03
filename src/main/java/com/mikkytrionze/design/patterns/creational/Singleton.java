package com.mikkytrionze.design.patterns.creational;

public class Singleton {

    private static volatile Singleton instance;
    
    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                if (localInstance == null) {
                    localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }

}
