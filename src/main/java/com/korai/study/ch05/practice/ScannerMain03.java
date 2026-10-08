package com.korai.study.ch05.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerMain03 {
    public static void main(String[] args) {
        int[] num = new int [0];
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("계속 추가하시겠습니까? y/n");
            String yesOrNo = scanner.nextLine();

            if (yesOrNo.equalsIgnoreCase("y")) {
                System.out.println("입력: ");
                int inputNum = Integer.parseInt(scanner.nextLine());

                int[] newNum = new int[num.length + 1];
                for (int i = 0; i < num.length; i++) {
                    newNum[i] = num[i];
                }

                newNum[newNum.length - 1] = inputNum;
                num = newNum;

            } else if (yesOrNo.equalsIgnoreCase("n")) {
                break;

            } else {
                System.out.println("다시 입력하세요.");
            }

            System.out.println("입력된 배열" + Arrays.toString(num));

            int sum = 0;
            for (int i = 0; i < num.length; i++) {
                sum = sum + num[i];
            }

            System.out.println("총합: " + sum);
        }
    }
}



// 계속 추가하시겠습니까? y/n y
// 입력 : 10
// 계속 추가하시겠습니까? y/n y
// 입력: 20
// 계속 추가하시겠습니까? y/n y
// 입력: 30
// 계속 추가하시겠습니까? y/n y
// 입력: 40
// 계속 추가하시겠습니까? y/n n
// 입력: 100