package main.java.calculator;

import java.util.List;

public class ArithmeticCalculator<T> extends Calculator {
    // 제네릭 문법 활용
    public T operate(T a, T b, char oper) {
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
        T result = cal.operate(a, b);
        return result;
    }

    public void removeResult() {
        this.getAnswers().remove(0); // 0번째 원소 삭제
    }

    public void inquiryResults() {
        List<Double> ans = getAnswers();
        ans.forEach(n -> System.out.print(n + " ")); // answers 리스트 각 원소 출력
        System.out.println();
    }

    // 입력받은 두 숫자보다 연산결과가 큰 값들을 리스트에 담아 조회하는 메소드
    public void biggerResults(T a, T b) {
        List<Double> result = getAnswers().stream()
                .filter(ans -> (ans > (double) a && ans > (double) b))
                .toList();
        result.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
