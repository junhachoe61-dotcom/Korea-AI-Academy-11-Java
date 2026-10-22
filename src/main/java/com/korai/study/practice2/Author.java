package com.korai.study.practice2;

import lombok.*;

@Data // get, set, eq, hc, toStr
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private String name;
    private String birthday;

// @NoArgsConstructor
// @AllArgsConstructor
// public Author(String name, String birthday) {
//    private this.name = name;
//    private this.birthday = birthday;
//    }


    @Data
    @RequiredArgsConstructor   // 무조건 final 존재
    @AllArgsConstructor
    class Publisher {
        private final String name;
        private String address;
        private String address2;
    }
}

class AuthorMain {
    public static void main(String[] args) {
        Author a = new Author();
        Author.Publisher p = a.new Publisher("한빛미디어", "부산", "부산진구");


        class Animal {

        }

        class Dog extends Animal {

        }

        Dog d = new Dog();
        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Animal);
        System.out.println(d.getClass() == Dog.class);
    }
}