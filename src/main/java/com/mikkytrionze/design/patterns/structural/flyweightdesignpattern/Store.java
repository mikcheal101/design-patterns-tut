package com.mikkytrionze.design.patterns.structural.flyweightdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private final List<Book> books = new ArrayList<Book>();

    public void storeBook(String name, double price, String type, String distributor, String otherData) {
        Book book = new Book(name, price, type, distributor, otherData);
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
