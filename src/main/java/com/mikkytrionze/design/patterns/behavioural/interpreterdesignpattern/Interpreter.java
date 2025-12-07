package com.mikkytrionze.design.patterns.behavioural.interpreterdesignpattern;

public class Interpreter {

    private final Context context;

    public Interpreter(Context context) {
        this.context = context;
    }

    public int interpret(String expression) {
        // Parse expression and create expression tree
        Expression builtExpression = this.buildExpressionTree(expression);

        // Interpret expression tree
        return builtExpression.interpret(context);
    }

    private Expression buildExpressionTree(String expression) {
        // Simulate parsing and building of expression tree.
        return new AdditionExpression(
            new NumberExpression(30), 
            new MultiplicationExpression(
                new NumberExpression(10), 
                new NumberExpression(2)
            )
        );
    }
}
