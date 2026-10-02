package com.korai.study.ch05.practice;

import java.util.ArrayList;
import java.util.List;

public class AbstractMain03 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        Tiger2 tiger = new Tiger2();
        Animal2 animal = new Animal2();
        Animal2 animal1 = dog;  // 업케스팅
        Animal2 animal2 = tiger;  // 업케스팅

        animal1.move();
        animal2.move();
        List<Animal2> animals = new ArrayList<>();
        animals.add(new Dog2());
        animals.add(new Tiger2());
    }
}

class Animal2 {
    String name;

    void move() {
        System.out.println("움직인다");
    }
}



class Dog2 extends Animal2 {

    @Override // 어노테이션
    void move() {
        System.out.println("많이 움직인다");
    }

    void bark() {
        System.out.println("짖다");
    }
}

class Tiger2 extends Animal2 {
    String name;

    void move() {
        System.out.println("움직인다");
    }

    void hunt() {
        System.out.println("사냥하다");
    }
}
