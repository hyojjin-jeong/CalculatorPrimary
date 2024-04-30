package main.java.calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {

    public int operate(int a, int b, char oper) {
        // enum 클래스 활용
        // 그 외에 AddOperator, SubtractOperator, DivideOperator,MultiplyOperator,ModOperator 사용 하지 않고, 이 메소드에서 연산자를 구분하여 enum 클래스 매핑을 통해 계산
        OperatorType cal = null;
        if (oper == '+') {
            cal = OperatorType.ADD;
        } else if (oper == '-') {
            cal = OperatorType.SUB;
        } else if (oper == '*') {
            cal = OperatorType.MUL;
        } else if (oper == '/') {
            cal = OperatorType.DIV;
        } else if (oper == '%') {
            cal = OperatorType.MOD;
        }
        int result = 0;
        result = cal.operate(a, b);
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
