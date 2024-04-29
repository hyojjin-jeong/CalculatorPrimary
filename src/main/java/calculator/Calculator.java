package main.java.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private static List<Integer> answers = new ArrayList<>(); // 연산 결과를 저장하는 리스트 타입 필드

    public List<Integer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Integer> answers) {
        this.answers = answers;
    }

    public int calculate(int firstNum, int secondNum, char operate) throws BadException{ // 예외 알려주기
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */
        int result = 0;
        if (operate == '+') {
            result = firstNum + secondNum;
        } else if (operate == '-') {
            result = firstNum - secondNum;
        } else if (operate == '*') {
            result = firstNum * secondNum;
        } else if (operate == '/') {
            if (secondNum == 0) { // 나눗셈 연산에서 분모가 0이라면, 예외를 던지기
                throw new BadException();
            }
            result = firstNum / secondNum;
        } else { // 지정하지 않은 연산기호가 들어오면, 예외 던지기
            throw new BadException();
        }

        return result;
    }

    public void removeResult() {
        this.answers.remove(0); // 0번째 원소 삭제
    }

    public void inquiryResults() {
        answers.forEach(n -> System.out.print(n + " ")); // answers 리스트 각 원소 출력
        System.out.println();
    }
}
