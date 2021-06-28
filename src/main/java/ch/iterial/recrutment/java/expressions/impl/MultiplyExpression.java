package ch.iterial.recrutment.java.expressions.impl;

import ch.iterial.recrutment.java.expressions.Expression;

public class MultiplyExpression extends ArithmeticExpression {
    public MultiplyExpression(Expression[] parameters) {
        super(parameters);
    }

    @Override
    public int evaluate() {
        return getValuesStream().reduce(1, (a, b) -> a * b);
    }

    @Override
    public String toString() {
        return String.format(super.toString(), '*');
    }
}
