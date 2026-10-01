package com.korai.study.ch05.practice;

public class Practice02_01 {
    public static void main(String[] args) {
        /*
         * 구구단
         * [ 2단 ]
         * 2 x 1 = 2\t     2 x 2 = 4\n
         * 2 x 3 = 6\t     2 x 4 = 8\n
         * ...
         *
         * [ 3단 ]
         * ...
         *
         * [ 9단 ]
         */

        String gugudan = "";
        for (int i = 0; i < 8; i++) {  // 총 8번 반복(2단에서 9단까지는 8번)
            int dan = i + 2;  // 2단 부터 출력돼야함으로 i + 2;
            String danText = " [ " + dan + " 단 ]\n";  // [ n단 ] 문자열 생성
            gugudan += danText;
            for (int j = 0; j < 9; j++) {  // 총 9번 반복
                int num = j + 1;  // 1부터 곱해야함으로 j + 1
                String gugudanText = dan + " x " + num + " = " + (dan * num);  // n x m = z 문자열 생성
                String lastLetter = num % 2 == 0 || num == 9 ? "\n" : "\t";    // 마지막 글자 줄바꿈 할지 tab할지
                gugudan += gugudanText + lastLetter;
            }
        }
        System.out.println(gugudan);


        int[][][] gugudanArray = new int[8][9][3];

        for (int i = 0; i < gugudanArray.length; i++) {
            int dan = i + 2;
            for (int j = 0; j < gugudanArray[i].length; j++) {
                int num = j + 1;
                int result = dan * num;
                gugudanArray[i][j][0] = dan;
                gugudanArray[i][j][1] = num;
                gugudanArray[i][j][2] = result;
            }
        }
        String gugudanString = "";
        for (int i = 0; i < gugudanArray.length; i++) {
            for (int j = 0; j < gugudanArray[i].length; j++) {
                gugudanString += String.format(
                        "%d x %d = %d%s",
                        gugudanArray[i][j][0],
                        gugudanArray[i][j][1],
                        gugudanArray[i][j][2],
                        gugudanArray[i][j][1] % 2 == 0 || gugudanArray[i][j][1] == 9 ? "\n" : "\t");

            }
        }
        System.out.println(gugudanString);

       for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 10 - i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }

    }
}
