package com.korai.study.ch12;

public class Lambda02 {
    public static void main(String[] args) {

        Calculator01 calculator = () -> {     // 람다 사용
            System.out.println("명령하나");
            System.out.println("명령둘");
        };

        Calculator01 calculator1_1 = () -> System.out.println("명령하나");


        Calculator02 calculator02 = () -> {
            System.out.println("명령하나");
            System.out.println("명령둘");
                return 0;
        };

        Calculator02 calculator2_1 = () -> 10;



        Calculator03 calculator03 = (int num) -> {
            return 0;
        };

        // 자료형 생략 가능
        Calculator03 calculator3_1 = (num) -> {
            return 0;
        };

        // 매개변수가 하나면 괄호 생략 가능
        Calculator03 calculator3_2 = num -> {
                return 0;
            };

        Calculator03 calculator3_3 = num -> num * 10 ;

        Calculator03 calculator3_4 = a -> a * 10 ;

        Calculator04 calculator04 = (int num1, int num2) -> {
            return num1 + num2;
        };

        Calculator04 calculator4_1 = (num1, num2) -> {
            return num1 + num2;
        };

        Calculator04 calculator4_2 = (data1, data2) -> data1 + data2;

    }
}

@FunctionalInterface
interface Calculator01 {
    void calc();
}

@FunctionalInterface
interface Calculator02 {
    int calc();
}

@FunctionalInterface
interface Calculator03 {
    double calc(int num);
}

@FunctionalInterface
interface Calculator04 {
    int calc(int num1, int num2);
}