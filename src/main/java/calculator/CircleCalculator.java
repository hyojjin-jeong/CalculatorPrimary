package main.java.calculator;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator extends Calculator {
    public CircleCalculator(AddOperator addOperator, SubtractOperator subtractOperator, MultiplyOperator multiplyOperator, DivideOperator divideOperator) {
        super(addOperator, subtractOperator, multiplyOperator, divideOperator);
    }

    public double calculateCircleArea(int r) {
        double result = (double)r * (double)r * 3.14;
        return result;
    }

    // 원의 넗이 리스트 조회 메소드
    public void inquiryCircle() {
        List<Double> cir = getCircles();
        cir.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
