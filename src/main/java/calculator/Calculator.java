package main.java.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    public static List<Integer> answers = new ArrayList<>(); // 연산 결과를 저장하는 리스트 타입 필드

    public void liprint() { // 결과값 리스트 출력 함수
        this.answers.forEach(n -> System.out.print(n + " ")); // 저장된 모든 연산 결과 조회
        System.out.println();
    }

    public Calculator calculate(int firstNum, int secondNum, char operate) throws BadException{ // 예외 알려주기
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

        this.answers.add(result); // 결과값 리스트에 저장

        return this;
    }
}
