package main.java.calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws BadException {
        Scanner sc = new Scanner(System.in);
        // 연산 오류 처리
        double firstNum = 0;
        double secondNum = 0;
        double r = 0;
        char oper = ' ';
        char two = ' ';
        CircleCalculator cirCal = new CircleCalculator();
        ArithmeticCalculator cal = new ArithmeticCalculator();
        while (true) {
            // 사칙연산, 원의 넗이 중 고르는 입력 받기
            System.out.print("사칙연산을 원하면 a를 원의 넓이를 원하면 b를 입력해주세요: ");
            while (true) {
                two = sc.next().charAt(0);
                // 입력받은 값이 a, b 둘 다 아니라면 다시 입력받기
                if (two != 'a' && two != 'b') {
                    System.out.print("a와 b 중 하나를 입력해주세요: ");
                } else{
                    break;
                }
            }

            if (two == 'a'){
                System.out.print("첫 번째 숫자를 입력하세요: ");
                while (true) {
                    try {
                        // Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                        firstNum = sc.nextDouble();
                        break;
                    } catch (InputMismatchException e) { // 숫자를 입력 받은 것이 double 형 타입이 아닐 때
                        System.out.print("double 형 타입을 입력하세요: ");
                        sc.nextLine(); // 입력 버퍼 비워주기
                    }
                }
                System.out.print("사칙연산 기호를 입력하세요: ");
                while (true) {
                    // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
                    oper = sc.next().charAt(0);
                    if (oper != '+' && oper != '-' && oper != '*' && oper != '/' && oper != '%') { // 입력받은 문자가 사칙연산 기호가 아닐 때
                        System.out.print("사칙연산 기호가 아닙니다. 다시 입력해주세요: " );
                    } else {
                        break;
                    }
                }

                System.out.print("두 번째 숫자를 입력하세요: ");
                while (true) {
                    try {
                        // Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                        secondNum = sc.nextDouble();
                        if (oper == '/' && secondNum == 0) { // 나눗셈 연산에서 분모가 0일 때 예외 처리
                            System.out.print("나눗셉 연산에서 분모에 0이 입력될 수 없습니다. 0이 아닌 숫자를 입력해주세요: ");
                        } else {
                            break;
                        }
                    } catch (InputMismatchException e) { // 숫자를 입력 받은 것이 double 형 타입이 아닐 때
                        System.out.print("double 형 타입을 입력하세요: ");
                        sc.nextLine(); // 입력 버퍼 비워주기
                    }

                }
                Double result = (Double) cal.operate(firstNum, secondNum, oper);
                cal.addResults(cal, result); // 변경한 리스트 클래스 필드에 넣기

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.next();
                if (remove.equals("remove")) { // remove 를 입력 시
                    cal.removeResult(); // 가장 먼저 저장된 데이터 삭제
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.next();
                if (inquiry.equals("inquiry")) { // inquiry 입력 시
                    cal.inquiryResults(); // 결과값 리스트 조회
                }

                // 연산결과들 중 입력받은 두 숫자보다 큰 결과값 조회
                System.out.println("저장된 연산결과 중 입력받은 두 숫자보다 큰 결과값입니다: ");
                cal.biggerResults(firstNum, secondNum);

            } else if (two == 'b') {
                // 원의 반지름 입력받기
                System.out.print("원의 반지름을 입력하세요: ");
                while (true) {
                    try {
                        // Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                        r = sc.nextDouble();
                        break;
                    } catch (InputMismatchException e) { // 숫자를 입력 받은 것이 double 형 타입이 아닐 때
                        System.out.print("정수를 입력하세요: ");
                        sc.nextLine(); // 입력 버퍼 비워주기
                    }
                }

                // 원의 넓이 구하기
                double result = cirCal.calculateCircleArea(r);

                // 원의 넓이 저장
                cirCal.addCircles(cirCal, result);

                // 저장된 원의 넓이 값들 바로 전체 조회
                cirCal.inquiryCircle();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit 을 입력 받으면 반복 종료 */
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}
