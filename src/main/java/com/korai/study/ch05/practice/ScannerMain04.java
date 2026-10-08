package com.korai.study.ch05.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerMain04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[] { 10, 20, 50, 30, 80 };

        while (true) {
            System.out.println("현재 배열: " + Arrays.toString(nums));
            System.out.println("삭제할 값 입력: ");
            int num = scanner.nextInt();

            int foundIndex = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) {
                    foundIndex = i;
                    break;
                }
            }

            if (foundIndex == -1) {
                System.out.println("해당 값은 배열에 존재하지 않습니다.");
                continue;
            }

            int[] newNums = new int[nums.length - 1];
            for (int i = 0; i < newNums.length; i++) {
                newNums[i] = nums[i < foundIndex ? i : i + 1];
            }
            nums = newNums;
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
