package com.mikkytrionze.design.patterns.structural.flyweightdesignpattern;

public class FlyweightPattern {

    private static final int BOOK_TYPES = 2;
    private static final int BOOK_TO_INSERT = 10;

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Structural Design Patterns:");
        System.out.println("Flyweight Design Pattern");

        // Implementation of Flyweight Design Pattern would go here.
        Store store = new Store();
        for (int i=0; i<BOOK_TO_INSERT / BOOK_TYPES; i++) {
            store.storeBook("Book " + i, (29.99 + i), "Type A", "Distributor A", "Other Data A");
            store.storeBook("Book " + i, (39.00 + (i + 3)), "Type B", "Distributor B", "Other Data B");
        }
        store.displayBooks();
    }

}
