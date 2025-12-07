package com.mikkytrionze.design.patterns.behavioural.interpreterdesignpattern;

public class MultiplicationExpression implements Expression {

    private final Expression leftExpression;
    private final Expression rightExpression;

    public MultiplicationExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        context.logEvent("Performing multiplication operation");
        return this.leftExpression.interpret(context) * this.rightExpression.interpret(context);
    }
}
