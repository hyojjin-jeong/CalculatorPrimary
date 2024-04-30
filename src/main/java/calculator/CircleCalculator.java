package main.java.calculator;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator extends Calculator {

    public double calculateCircleArea(double r) {
        double result = r * r * 3.14;
        return result;
    }

    // 원의 넗이 리스트 조회 메소드
    public void inquiryCircle() {
        List<Double> cir = getCircles();
        cir.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
