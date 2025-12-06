package com.mikkytrionze.design.patterns.structural.flyweightdesignpattern;

/***
 * Flyweight Pattern is a structural design pattern that allows programs to support vast quantities of objects by keeping their memory consumption low.
 * The Flyweight Pattern achieves this by sharing parts of the object state that are common between multiple objects instead of keeping all data in each object.
 * This design pattern is particularly useful when dealing with a large number of similar objects that have some shared state.
 * In this example, we will implement a simple Flyweight Pattern to manage a collection of books in a store.
 * The Book class represents individual books, while the BookType class represents the shared state of book types.
 * The BookFactory class is responsible for creating and managing the shared BookType instances.
 * The Store class uses the BookFactory to store and display books efficiently.
 * By using the Flyweight Pattern, we can significantly reduce memory usage when dealing with a large number of books with shared types.
 * This implementation demonstrates how the Flyweight Pattern can be applied in a real-world scenario to optimize resource usage.
 * 
 * @auhor Hirekaan Micheal Hemen
 */
public class FlyweightPattern {

    private static final int BOOK_TYPES = 2;
    private static final int BOOK_TO_INSERT = 10_000_000;

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
