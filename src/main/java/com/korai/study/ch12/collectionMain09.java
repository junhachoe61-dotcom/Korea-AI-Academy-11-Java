package com.korai.study.ch12;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.SQLOutput;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;


public class collectionMain09 {
    public static void main(String[] args) {


        @Data
        @AllArgsConstructor

        class Student {
            private  String name;
            private  String address;
        }

        List<Map<String,Map<String,Map<String,Object>>>> data = List.of(
                Map.of("class1", Map.of(
                        "student1", Map.of(
                                "id", 1,
                                "object", new Student("김준일", "서울"),
                                "createdAt", LocalDate.of(2025, 1, 1)
                        ),
                        "student2", Map.of(
                                "id", 2,
                                "object", new Student("김준이", "서울"),
                                "createdAt", LocalDate.of(2025, 1, 2)
                        ),
                        "student3", Map.of(
                                "id", 3,
                                "object", new Student("김준삼", "서울"),
                                "createdAt", LocalDate.of(2025, 1, 3)
                        )


                )),
                Map.of("class2", Map.of(
                        "student1", Map.of(
                                "id", 1,
                                "object", new Student("김준일", "부산"),
                                "createdAt", LocalDate.of(2026, 1, 1)
                        ),
                        "student2", Map.of(
                                "id", 2,
                                "object", new Student("김준이", "부산"),
                                "createdAt", LocalDate.of(2026, 1, 2)
                        ),
                        "student3", Map.of(
                                "id", 3,
                                "object", new Student("김준삼", "부산"),
                                "createdAt", LocalDate.of(2026, 1, 3)
                        )



                ))
        );

        System.out.println(data);
        System.out.println(((Student) data.get(0).get("class1").get("student1").get("object")).getName());
        for (int i = 0; i < data.size(); i++) {
            Set<String> keySet = data.get(i).keySet();
            for (String key : keySet) {
                Map<String, Map<String, Object>> studentMap = data.get(i).get(key);
                Set<String> studentKeySet = studentMap.keySet();

                for (String studentKey : studentKeySet) {
                    Map<String, Object> student = studentMap.get(studentKey);
                    Student s = (Student) student.get("object");
                    System.out.println(s.getName());
                }
            }
        }

        for (int i = 0; i < data.size(); i++) {
            Set<Map.Entry<String, Map<String, Map<String, Object>>>> entries = data.get(i).entrySet();
            for (Map.Entry<String, Map<String, Map<String, Object>>> entry : entries) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }


        Map<String, Integer> ages = Map.of(
                "김준일", 33,
                "김준이", 34,
                "김준삼", 35
        );

        Set<Map.Entry<String, Integer>> entries = ages.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>();
        entryList.addAll(entries);
        System.out.println(entryList.get(0));
        System.out.println(entryList.get(1));
        System.out.println(entryList.get(2));
    }
}
