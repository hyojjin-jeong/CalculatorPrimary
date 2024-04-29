package main.java.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public abstract class Calculator {
    // 사칙연산 필드 생성
    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private static List<Integer> answers = new ArrayList<>(); // 사칙연산 결과를 저장하는 리스트 타입 필드
    private static List<Double> circles = new ArrayList<>(); // 원의 넓이 결과를 저장하는 리스트 타입 필드

    public List<Integer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Integer> answers) {
        this.answers = answers;
    }

    public List<Double> getCircles() {
        return circles;
    }

    public void setCircles(List<Double> circles) {
        this.circles =  circles;
    }

    // 생성자 생성
    public Calculator(AddOperator addOperator, SubtractOperator subtractOperator, MultiplyOperator multiplyOperator, DivideOperator divideOperator){
        // 사칙연산 클래스 초기화
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;

        // 결과값 리스트 초기화
        this.answers.clear();
        this.circles.clear();
    }
}
