package ch.iterial.recrutment.java.expressions.impl;

import ch.iterial.recrutment.java.expressions.Expression;

public class AddExpression extends ArithmeticExpression {
    public AddExpression(Expression[] parameters) {
        super(parameters);
    }

    @Override
    public int evaluate() {
        return getValuesStream().sum();
    }

    @Override
    public String toString() {
        return String.format(super.toString(), '+');
    }
}
