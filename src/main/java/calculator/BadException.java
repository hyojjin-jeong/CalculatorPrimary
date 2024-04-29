package main.java.calculator;

public class BadException extends Exception {
    public BadException() {
        System.out.println("!입력받은 값이 올바르지 않아 연산이 되지 않았습니다!");
    }
}
