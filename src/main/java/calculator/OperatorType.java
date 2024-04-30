package main.java.calculator;


import java.util.function.BiFunction;

public enum OperatorType {
    ADD("+", (a,b) -> (a + b)),
    SUB("-", (a,b) -> (a - b)),
    MUL("*", (a,b) -> (a * b)),
    DIV("/", (a,b) -> (a / b)),
    MOD("%", (a,b) -> (a % b));

    private final String symbol;
    private final BiFunction<Double, Double, Double> operator;

    OperatorType(String symbol, BiFunction<Double, Double, Double> operator) {
        this.symbol = symbol;
        this.operator = operator;
    }

    // 제네릭 문번 활용
    public <T> T operate(T a, T b) {
        return (T) this.operator.apply((double)a, (double)b);
    }
}
