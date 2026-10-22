package com.korai.study.ch13;


// 람다
// 추상 메서드를 하나만 가지고 있는 인터페이스를 익명개체로 생성할 때
// 편리하게 생성할 수 있도록 만들어진 문법

import java.util.Scanner;

public class Lambda01 {
    public static void main(String[] args) {
        keyboardEvent k1 = new keyboardEvent() {
            @Override
            public void keyUp() {
                System.out.println("키를 때다");
            }

            @Override
            public void keyDown() {
                System.out.println("키를 누르다");
            }
        };

        k1.keyDown();
        k1.keyUp();

        Speaker speaker = () -> System.out.println("A 사운드를 재생");  // 람다를 사용하기 위해 인터페이스안에 추상메서드가 딱 하나만 존재

        speaker.play();
    }
}

interface keyboardEvent {
    void keyUp();
    void keyDown();
}

interface Speaker {
    void play();
}