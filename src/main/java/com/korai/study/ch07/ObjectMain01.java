package com.korai.study.ch07;

public class ObjectMain01 {
    public static void main(String[] args) {
        final int num = 10;
        System.out.println(num);
        Student s1 = new Student(20260001, "최준하");
        Student s2 = new Student();

        School school = new School("코리아아이티");
    }
}

class School {
    String name;


    School(String name) {
        this.name = name;
    }



}


class Student {
    final int code;       // 필수
    final String name;    // 필수
    String address; // 선택

    // NoArgumentsConstructor (인자들이 없는 생성자)
    Student() {
        code = 0;
        name = null;
    }

    // RequiredArgumentsConstructor (필수 인자들만 받는 생성자)
    Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    // AllArgumentsConstructor (모든 인자들을 다 받는 생성자)
    Student(int code, String name, String address) {
        this.code = code;
        this.name = name;
        this.address = address;
    }
}

class Teacher {
    String name;
    int age;
    String address;

    public Teacher(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}