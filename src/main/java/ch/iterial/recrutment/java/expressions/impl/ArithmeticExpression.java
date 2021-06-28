package ch.iterial.recrutment.java.expressions.impl;

import ch.iterial.recrutment.java.expressions.Expression;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public abstract class ArithmeticExpression implements Expression {
    private final Expression[] parameters;

    protected ArithmeticExpression(Expression[] parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "(%c " + Arrays.stream(parameters)
                .map(Expression::toString)
                .collect(Collectors.joining(" ")) + ")";
    }

    protected IntStream getValuesStream() {
        return Arrays.stream(parameters).mapToInt(Expression::evaluate);
    }
}
