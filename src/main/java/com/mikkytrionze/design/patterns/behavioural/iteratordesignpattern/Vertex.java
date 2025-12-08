package com.mikkytrionze.design.patterns.behavioural.iteratordesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {

    private boolean visited;
    private final T value;
    private List<Vertex<T>> neighbours;

    public Vertex(T value) {
        this.value = value;
        this.visited = false;
        this.neighbours = new ArrayList<>();
    }

    public void setNeighbours(List<Vertex<T>> neighbours) {
        this.neighbours = neighbours;
    }

    public boolean isVisited() {
        return this.visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex<T>> getNeighbours() {
        return this.neighbours;
    }

    @Override
    public String toString() {
        return this.value + "";
    }
}
