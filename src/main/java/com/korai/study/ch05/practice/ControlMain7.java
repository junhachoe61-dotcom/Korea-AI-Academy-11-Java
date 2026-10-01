package com.korai.study.ch05.practice;

public class ControlMain7 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i: " + i);

        }
    }
}
