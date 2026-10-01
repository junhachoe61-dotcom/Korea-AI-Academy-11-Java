package com.korai.study.ch01;

public class ClassMain {
    public static void main(String[] args) {
        // [ 변수와 자료형 ]
        int num = 10;
        final String name = "최준하"; // 상수

        class Student {
            String name;
            int age;
        }

        Student jun = new Student();
        jun.name = "최준하";
        jun.age = 25;


        class Student2 {
            String name;
            Object age;
        }

        Student2 jun2 = new Student2();
        jun2.name = "junha";
        jun2.age = jun;

        Student2 jun22 = new Student2();
        jun2.name = "choijunha";
        jun2.age = "25";


        class Student3<A> {
            String name;
            A age;
        }

        Student3<String> jun3 = new Student3<String>();
        Student3<Integer> jun33 = new Student3<>();

        jun3.age = "25";
        jun33.age = 25;

        int num2 = num;
        Student3<?> jun333 = jun3; // 제네릭의 와일드카드




    }
}
