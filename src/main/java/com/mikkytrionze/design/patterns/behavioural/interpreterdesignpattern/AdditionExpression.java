package com.mikkytrionze.design.patterns.behavioural.interpreterdesignpattern;

public class AdditionExpression implements Expression {

    private final Expression rightExpression;
    private final Expression leftExpression;

    public AdditionExpression(Expression rightExpression, Expression leftExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        context.logEvent("Performing addition operation");
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}
