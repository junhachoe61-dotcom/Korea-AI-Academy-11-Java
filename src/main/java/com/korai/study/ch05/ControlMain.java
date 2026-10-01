package com.korai.study.ch05;


// control 제어
// 1. 조건문 - if else, switch
// 2. 반복문 - while, for
// 3. 분기문/점프문 - break, continue, return

public class ControlMain {
    public static void main(String[] args) {
        // 1. 조건문
        if (true) System.out.println("명령 실행");
        if (false) System.out.println("명령 실행2");
        boolean open = true;
        if (open) System.out.println("열림");
        else System.out.println("닫힘");

        int score = 70;

        if (score < 60) {
            System.out.println("F");
        } else if (score < 70) {
            System.out.println("D");
        } else if (score < 80) {
            System.out.println("C");
        } else if (score < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }

        System.out.println(score < 60 ? "F" : score < 70 ? "D" : score < 80 ? "C" : score < 90 ? "B" : "A");
    }
}
