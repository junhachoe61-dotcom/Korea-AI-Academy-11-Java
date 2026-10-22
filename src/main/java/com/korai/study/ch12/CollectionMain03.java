package com.korai.study.ch12;

import lombok.AllArgsConstructor;
import lombok.Data;

public class CollectionMain03 {


    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 100;
        nums[1] = 200;
        nums[2] = 300;
        nums[3] = 400;
        nums[4] = 500;

        print(nums);
        print(nums);

        String[] names = {"김준일", "김준이", "김준삼", "김준사"};
        print(names);

        @Data
        @AllArgsConstructor
        class Car extends Object {
            private String model;
        }

        Car[] cars = new Car[5];
        cars[0] = new Car("아반떼");
        cars[1] = new Car("쏘나타");
        cars[2] = new Car("그랜저");
        cars[3] = new Car("G80");
        cars[4] = new Car("G90");

        print(cars);
    }


    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    static void print(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
