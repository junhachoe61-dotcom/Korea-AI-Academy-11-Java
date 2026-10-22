package com.korai.study.practice2;

import java.util.ArrayList;
import java.util.List;

public class pr1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        A1.run();
    }
}

class A1 {
    static void run() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.addAll(List.of(85, 92, 78, 96, 88));

        int sum = 0;
        int max = nums.get(0);

        for (int n : nums) {
            sum += n;
            if (n > max){
                max = n;
            }
        }

        System.out.println("전체점수: " + nums);

        System.out.println("최고 점수: " + max);
    }
}
