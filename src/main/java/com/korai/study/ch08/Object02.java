package com.korai.study.ch08;
import java.util.Objects;
public class Object02 {
    public static void main(String[] args) {
        class Student {
            private String name;
            private int age;

            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public boolean equals(Object o) {
                if (o == null || this.getClass() != o.getClass()) return false;
                Student student = (Student) o;
                return age == student.age && Objects.equals(name, student.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name,age);
            }
        }




        Student student1 = new Student("김준일", 33);
        Student student2 = new Student("김준일", 33);
        Student student3 = student1;

        boolean result1 = student1.equals(student2);
        boolean result2 = student1.equals(student3);

        System.out.println(result1); // true
        System.out.println(result2); // true

        System.out.println(student1 == student2);  // 메모리 주소값 비교 false
        System.out.println(student1 == student3);  // 메모리 주소값 비교 true

        System.out.println(student1.hashCode() == student2.hashCode()); // true
        System.out.println(student1.hashCode()); // 1379950246
    }
}
