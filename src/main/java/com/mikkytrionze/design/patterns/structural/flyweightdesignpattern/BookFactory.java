package com.mikkytrionze.design.patterns.structural.flyweightdesignpattern;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private static final Map<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String distributor, String otherData) {
        if (!bookTypes.containsKey(type)) {
            BookType bookType = new BookType(type, distributor, otherData);
            bookTypes.put(type, bookType);
        }
        return bookTypes.get(type);
    }

}
