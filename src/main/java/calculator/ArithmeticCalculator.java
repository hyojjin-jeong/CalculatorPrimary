package main.java.calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(AbstractOperator abstractOperator) {
        super(abstractOperator);
    }
    public int operate(int a, int b) {
        int result = 0;
        result = abstractOperator.operate(a, b);
        return result;
    }

    public void removeResult() {
        this.getAnswers().remove(0); // 0번째 원소 삭제
    }

    public void inquiryResults() {
        List<Integer> ans = getAnswers();
        ans.forEach(n -> System.out.print(n + " ")); // answers 리스트 각 원소 출력
        System.out.println();
    }
}
