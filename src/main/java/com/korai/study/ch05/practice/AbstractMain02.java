package com.korai.study.ch05.practice;

public class AbstractMain02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Animal animal = new Animal();
        Animal animal1 = dog;  // 업케스팅
        Animal animal2 = tiger;  // 업케스팅


    }
}

class Animal {
    String name;

    void move() {
        System.out.println("움직인다");
    }
}



class Dog extends Animal {
    String name;

    void move() {
        System.out.println("움직인다");
    }

    void bark() {
        System.out.println("짖다");
    }
}

class Tiger extends Animal {
    String name;

    void move() {
        System.out.println("움직인다");
    }

    void hunt() {
        System.out.println("사냥하다");
    }
}
