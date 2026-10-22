package com.korai.study.ch12;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;


public class CollectionMain07 {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        nums.add(70);
        nums.add(80);
        nums.add(80);
        nums.add(80);
        nums.add(80);
        nums.add(80);
        nums.add(80);
        System.out.println(nums.contains(80));
        System.out.println(nums.containsAll(List.of(30,50,1000)));

        List<String> names =  List.of(
                "김준일",
                "김준일",
                "김준이",
                "김준일",
                "김준이"
        );

        Set<String> nameSet = new HashSet<>();
        nameSet.addAll(names);
        System.out.println(nameSet);


        @Data
        @AllArgsConstructor

        class Student {
            String name;
            String address;
        }

        List<Student> students = List.of(
                new Student("김준일", "서울"),
                new Student("김준일", "부산"),
                new Student("김준일", "서울"),
                new Student("김준일", "경남"),
                new Student("김준일", "경남")
        );

        Set<String> addressSet = new HashSet<>();

        for (int i = 0; i <students.size(); i++) {
            addressSet.add(students.get(i).getAddress());
        }
        System.out.println(addressSet);
        System.out.println(students.stream().map(s -> s.getAddress()).collect(Collectors.toSet()));

        for (String addr : addressSet) {
            System.out.println(addr);
        }

        Iterator<String> addr = addressSet.iterator();
        while(addr.hasNext()) {
            System.out.println(addr.next());
        }
    }
}
