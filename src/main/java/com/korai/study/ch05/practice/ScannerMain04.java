package com.korai.study.ch05.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerMain04 {
    public static void main(String[] args) {
        int[] nums = new int[] { 10, 20, 50, 30, 80};
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("계속 추가하시겠습니까? y/n");
            String yesOrNo = scanner.nextLine();

            if (yesOrNo.equalsIgnoreCase("y")) {
                System.out.println("입력: ");
                int inputNum = Integer.parseInt(scanner.nextLine());

                int[] newNums = new int[nums.length - 1];
                for (int i = 0; i < nums.length; i++) {
                    newNums[i] = nums[i];
                }

                newNums[newNums.length - 1] = inputNum;
                nums = newNums;

            } else if (yesOrNo.equalsIgnoreCase("n")) {
                break;

            } else {
                System.out.println("다시 입력하세요.");
            }

            System.out.println("입력된 배열" + Arrays.toString(nums));

            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
            }

            System.out.println("총합: " + sum);
        }


    }
}



// 삭제할 값 입력: 30
// 현재 배열: [ 10, 20, 50, 30, 80 ]
// 현재 배열: [ 10, 20, 50, 80 ]
// 삭제할 값 입력: 20
//  현재 배열: [ 10, 50, 80 ]
// 삭제할 값 입력: 10
// 현재 배열: [ 50, 80 ]
// 삭제할 값 입력: 80
// 현재 배열: [ 50 ]
// 삭제할 값 입력: 50
// 현재 배열: [  ]
// 삭제할 값 입력: 90
// 해당 값은 배열에 존재하지 않습니다
