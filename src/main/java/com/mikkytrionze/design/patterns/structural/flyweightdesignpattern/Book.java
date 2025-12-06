package com.mikkytrionze.design.patterns.structural.flyweightdesignpattern;

public class Book {
    private final String name;
    private final double price;
    private final BookType bookType;

    public Book(String name, double price, BookType bookType) {
        this.name = name;
        this.price = price;
        this.bookType = bookType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public BookType getBookType() {
        return bookType;
    }

    @Override
    public String toString() {
        return "Book{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
    }

}
