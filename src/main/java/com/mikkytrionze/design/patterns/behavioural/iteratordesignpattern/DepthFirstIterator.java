package com.mikkytrionze.design.patterns.behavioural.iteratordesignpattern;

import java.util.Deque;
import java.util.LinkedList;

public class DepthFirstIterator<T> implements Iterator<T> {

    private final Vertex<T> startVertex;
    private Deque<Vertex<T>> stack = new LinkedList<>();

    public DepthFirstIterator(Vertex<T> startVertex) {
        this.startVertex = startVertex;
        this.stack.push(startVertex);
    }

    @Override
    public boolean hasNext() {
        return !this.stack.isEmpty();
    }

    @Override
    public Vertex<T> getNext() {
        if (!this.hasNext()) {
            return null;
        }

        Vertex<T> current = this.stack.pop();
        if (!current.isVisited()) {
            current.setVisited(true);
            current.getNeighbours().forEach(this.stack::push);
            return current;
        }
        return this.getNext();
    }

    @Override
    public void reset() {
        this.stack.clear();
        this.stack.push(this.startVertex);
    }
}
