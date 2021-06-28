package ch.iterial.recrutment.java.expressions.impl;

import ch.iterial.recrutment.java.expressions.Expression;

public class LiteralExpression implements Expression {
    private int value;

    public LiteralExpression(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
