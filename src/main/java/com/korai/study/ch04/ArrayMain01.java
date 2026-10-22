package com.korai.study.ch04;

public class ArrayMain01 {
    public static void main(String[] args) {
        // 배열 -> 나열하고자하는 개수만큼 자료형의 크기대로 배정한것
        byte[] a1 = new byte[4];
        short[] a2 = new short[4];
        int[] a4 = new int[4];

        a1 = new byte[5];
        a1 = null;
        int num = 10;
        num = 0;

        class Student {
            String name;
            double[] scores;
        }

        Student s = new Student();
        s.name = "김준삼";
        s.scores = new double[3];
        s.scores[0] = 70.0;

        Student[] students = new Student[4];
        students[0] = new Student();
        students[0].name = "김준일";
        students[1] = new Student();
        students[1].name = "김준이";

        Student[] students2 = students;
        students2[0] = s;
        students2[0].scores[1] = 80.5;
    }
}










