package com.korai.study.ch05.practice;

public class ControlMain2 {
    public static void main(String[] args) {
        // switch ~ case => IF 조건문과는 완전히 다른 동작 방식이다
        //

        String 문선택 = "4번문";

        switch (문선택) {
            case "1번문":
                System.out.println("첫번재 버섯");
            case "2번문":
                System.out.println("두번째 버섯");

            case "3번문":
                System.out.println("세번째 버섯");
            case "4번문":
                System.out.println("네번째 버섯");
            default:
                System.out.println("마지막 버섯");
        }
    }
}

/*

 */




















