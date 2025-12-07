package com.mikkytrionze.design.patterns.behavioural.interpreterdesignpattern;

public class NumberExpression implements Expression {

    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        context.logEvent(Integer.toString(this.number));
        return this.number;
    }
}
