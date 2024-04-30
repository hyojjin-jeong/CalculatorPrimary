package main.java.calculator;

import java.net.Inet4Address;
import java.util.function.BiFunction;

public enum OperatorType {
    ADD("+", (a,b) -> (a + b)),
    SUB("-", (a,b) -> (a - b)),
    MUL("*", (a,b) -> (a * b)),
    DIV("/", (a,b) -> (a / b)),
    MOD("%", (a,b) -> (a % b));

    private final String symbol;
    private final BiFunction<Integer, Integer, Integer> operator;

    OperatorType(String symbol, BiFunction<Integer, Integer, Integer> operator) {
        this.symbol = symbol;
        this.operator = operator;
    }

    public Integer operate(int a, int b) {
        return this.operator.apply(a, b);
    }
}
