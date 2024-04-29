package main.java.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public abstract class Calculator {
    // 사칙연산 추상화 클래스 필드 생성
    protected final AbstractOperator abstractOperator;

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
    public Calculator(){ // 원의 넓이 계산 시 사용할 생성자
        abstractOperator = null;
    }
    public Calculator(AbstractOperator abstractOperator){ // 사칙연산 계산 시 사용할 생성자
        // 사칙연산 추상화 클래스 초기화
        this.abstractOperator = abstractOperator;
    }
}
