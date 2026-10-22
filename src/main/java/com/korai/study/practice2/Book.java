package com.korai.study.practice2;

public class Book {
    String title;
    int price;
    static String author;
    final String name2 = "초기화1";
    static final String author2 = "초기화2";
    Book(String title) {
        this(title, 10000, "저자없음");
    }

    Book(String title, String author) {
        this(title, 10000, "저자없음");
    }

    Book(String title, int price) {
        this(title, 10000, "저자없음");
    }

    Book(String title, int price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }
}



// public class Book {
    // 필드 - 1.인스턴스 필드, 2. static 필드
    // String name;
    // static String author;
    // 메서드 - 1. 생성자(constructor), 2. 인트선트 메서드, 3. static 메서드
    // Book() {
    // String getName() {return name;}
    // void print() {}
    // static String getAuthor() {return author;}
    // static void staticPrint() {}
    // }
    // 내부 클래스 - 1. 인스턴스 클래스, 2. static 클래스
// }