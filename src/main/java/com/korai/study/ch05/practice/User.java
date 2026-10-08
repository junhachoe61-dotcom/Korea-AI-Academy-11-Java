package com.korai.study.ch05.practice;





public class User {


    int id;
    String name;
    int age;
    String gender;   // "M" 또는 "F"
    String city;
    String email;
    int point;
    int joinYear;
    boolean active;  // 휴면 계정이면 false

    User(int id, String name, int age, String gender, String city,
         String email, int point, int joinYear, boolean active) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.email = email;
        this.point = point;
        this.joinYear = joinYear;
        this.active = active;
    }

    @Override
    public String toString() {
        return String.format("[%2d] %s(%d, %s) %s | %s | %,dP | %d년 가입 | %s",
                id, name, age, gender, city, email, point, joinYear,
                active ? "활성" : "휴면");
    }
}