package com.mikkytrionze.design.patterns.behavioural.iteratordesignpattern;

import java.util.Arrays;

public class IteratorPattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Behavioural Design Patterns:");
        System.out.println("Iterator Design pattern");

        /// Implementation goes here 
        var v0 = new Vertex<Integer>(0);
        var v1 = new Vertex<Integer>(1);
        var v2 = new Vertex<Integer>(2);
        var v3 = new Vertex<Integer>(3);
        var v4 = new Vertex<Integer>(4);
        var v5 = new Vertex<Integer>(5);
        var v6 = new Vertex<Integer>(6);

        v0.setNeighbours(Arrays.asList(v1, v5, v6));
        v1.setNeighbours(Arrays.asList(v3, v4, v5));
        v4.setNeighbours(Arrays.asList(v2, v6));
        v6.setNeighbours(Arrays.asList(v0));
        
        var dfs = new DepthFirstIterator<Integer>(v0);
        while (dfs.hasNext()) {
            System.out.println(dfs.getNext());
        }
    }
}
