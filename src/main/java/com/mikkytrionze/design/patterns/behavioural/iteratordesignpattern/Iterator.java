package com.mikkytrionze.design.patterns.behavioural.iteratordesignpattern;

public interface Iterator<T> {
    boolean hasNext();
    Vertex<T> getNext();
    void reset();
}
