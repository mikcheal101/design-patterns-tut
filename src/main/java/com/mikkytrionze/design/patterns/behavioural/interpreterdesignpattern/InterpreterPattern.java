package com.mikkytrionze.design.patterns.behavioural.interpreterdesignpattern;

public class InterpreterPattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Behavioural Design Patterns:");
        System.out.println("Interpreter Design Pattern");

        /// Implementation goes here. 
        
        // Input expression
        String expression = "30 + 10 * 2";
        
        // Create context and interpreter.
        var context = new Context();
        var interpreter = new Interpreter(context);

        // Interpret expression
        int result = interpreter.interpret(expression);
        context.getLogHistory().forEach(System.out::println);
        System.out.printf("Result: %d", result);

    }
}
