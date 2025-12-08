package com.mikkytrionze.design.patterns.behavioural.mementodesignpattern;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<DocumentMemento> mementos;

    public History() {
        this.mementos = new ArrayList<>();
    }

    public synchronized void addMemento(DocumentMemento memento) {
        this.mementos.add(memento);
    }

    public synchronized DocumentMemento getMemento(int index) {
        return this.mementos.get(index);
    }
}
