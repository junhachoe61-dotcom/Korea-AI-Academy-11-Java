package com.korai.study.ch05.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerMain03_1 {
    public static void main(String[] args) {
        int[] num = new int[0];  // 정수 배열 0을 만든다
        Scanner scanner = new Scanner(System.in);  // 사용자가 키보드 타이핑을 위한 scanner 생성

        while(true) {  // 사용자가 break를 만날 때까지 반복
            System.out.println("계속 추가하시겠습니까? y/n");
            String yesOrNo = scanner.nextLine();  // 입력받은 값 y또는n을 변수 yesOrNo에 저장

            if (yesOrNo.equalsIgnoreCase("y")) {   // equalsIgnoreCase -> 대소문자 관계 없이,, y를 입력하면
                System.out.println("입력");     // "입력" 출력
                int inputNum = Integer.parseInt(scanner.nextLine());  // Integer.parseInt... 문자열로 입력받은 값을 자바가 연산 가능한 정수타입으로 변환

                int[] newNum = new int[num.length + 1]; // 기존 배열보다 한칸 추가된 새로운 배열 newNum을 생성
                for (int i = 0; i < num.length; i++ ) {  // 기존 배열에 있던 슷자들을 새로운 배열로 이동
                    newNum[i] = num[i];
                }

                newNum[newNum.length - 1] = inputNum;  // 방금 새로 입력받은 숫자를 새 배열의 맨 마지막 칸에 넣음
                num = newNum;

            } else if (yesOrNo.equalsIgnoreCase("n")) {
                break;

            } else {
                System.out.println("다시 입력하세요.");
            }

            System.out.println("입력된 배열: " + Arrays.toString(num));  // Arrays.toString -> [ 숫자1, 숫자2, 숫자3 ] String 문자열로 반환

            int sum = 0;    // 총합 출력 sum
            for (int i = 0; i < num.length; i++ ) {   // 반복문 사용
                sum = sum + num[i];
            }

            System.out.println("총합: " + sum);
        }
    }
}
