package com.korai.study.ch05.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ControlMain6 {

    public static void main(String[] args) {
        String[] names = new String[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름 입력 프로그램");

        while (true) {
            System.out.print("이름을 추가하시겠습니까?(y/n): ");
            String yesOrNo = scanner.nextLine();

            if (yesOrNo.equalsIgnoreCase("y")) {
                System.out.print("이름: ");
                String name = scanner.nextLine();

                String[] newNames = new String[names.length + 1];
                for (int i = 0; i < names.length; i++) {
                    newNames[i] = names[i];
                }

                // [수정 완료] 줄바꿈 및 기호 정리
                newNames[newNames.length - 1] = name;
                names = newNames;

            } else if (yesOrNo.equalsIgnoreCase("n")) {
                break; // [수정 완료] 'n'을 입력하면 반복문을 탈출하여 아래 출력이 실행되도록 함
            } else {
                System.out.println("다시 입력하세요.");
            }
        }

        System.out.println(Arrays.toString(names));
    }
}