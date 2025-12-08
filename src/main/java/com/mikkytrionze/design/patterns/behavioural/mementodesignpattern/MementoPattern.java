package com.mikkytrionze.design.patterns.behavioural.mementodesignpattern;

public class MementoPattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Behavioural Design Patterns:");
        System.out.println("Memento Design pattern");

        /// Implementation goes here 
        var document = new Document("Initial content\n");
        var history = new History();

        // write some content
        document.write("Additional content\n");
        history.addMemento(document.createMemento());

        // write some more content
        document.write("More content\n");
        history.addMemento(document.createMemento());

        // write some more content
        document.write("Text to remove\n");
        history.addMemento(document.createMemento());

        // print documents content
        System.out.println("before restoration:");
        System.out.println(document.getContent());
        System.out.println("+++++++++++++++++++++++++");

        // restore to previous state
        document.restoreFromMemento(history.getMemento(1));

        // print documents content
        System.out.println("After restoration:");
        System.out.println(document.getContent());

    }

}
