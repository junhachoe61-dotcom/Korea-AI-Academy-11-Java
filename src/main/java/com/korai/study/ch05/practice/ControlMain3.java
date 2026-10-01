package com.korai.study.ch05.practice;

public class ControlMain3 {
    public static void main(String[] args) {
        System.out.println("최\n");
        System.out.println("준\n");
        System.out.println("하\n");

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        for (int i = 0; i < 5; i++) {
            String star = "";
            for (int j = 0; j < i + 1; j++){
                star += "*";
            }
            System.out.println(star);
        }

        String star = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                star += "*";
            }
            star += "\n";
        }
        System.out.println(star);


        for (int i = 0; i < 5; i++) {
             star = "";
            for (int j = 0; j < 5 - i; j++){
                star += "*";
            }
            System.out.println(star);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(5 - i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1 + i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }


}
