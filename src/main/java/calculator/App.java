package main.java.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 연산 오류 처리
        int firstNum = 0;
        int secondNum = 0;
        char operate = ' ';
        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            firstNum = sc.nextInt();
        } catch (InputMismatchException e) { // 숫자를 입력 받은 것이 int형 타입이 아닐 때
            System.out.print("정수를 입력하세요: ");
            sc.nextLine(); // 입력 버퍼 비워주기
            firstNum = sc.nextInt();
        }
        System.out.print("사칙연산 기호를 입력하세요: ");
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
        operate = sc.next().charAt(0);
        if (operate != '+' && operate != '-' && operate != '*' && operate != '/') { // 입력받은 문자가 사칙연산 기호가 아닐 때
            System.out.print("사칙연산 기호가 아닙니다. 다시 입력해주세요: " );
            operate = sc.next().charAt(0);
        }

        try {
            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            secondNum = sc.nextInt();
            if (operate == '/' && secondNum == 0) { // 나눗셈 연산에서 분모가 0일 때 예외 처리
                System.out.print("나눗셉 연산에서 분모에 0이 입력될 수 없습니다. 0이 아닌 숫자를 입력해주세요: ");
                secondNum = sc.nextInt();
            }
        } catch (InputMismatchException e) { // 숫자를 입력 받은 것이 int형 타입이 아닐 때
            System.out.print("정수를 입력하세요: ");
            sc.nextLine(); // 입력 버퍼 비워주기
            secondNum = sc.nextInt();
        }

        int result = 0;
        /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
        if (operate == '+') {
            result = firstNum + secondNum;
        } else if (operate == '-') {
            result = firstNum - secondNum;
        } else if (operate == '*') {
            result = firstNum * secondNum;
        } else if (operate == '/') {
            result = firstNum / secondNum;
        }
        System.out.println("결과: " + result);
    }
}
