package com.korai.study.ch12;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain06 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        A_2.run();
    }
}

class A1 {
    static void  run() {
        ArrayList<String> strList = new ArrayList<>();

        // 값 추가
        strList.add("데이터1");
        // 값 여러개 한번에 추가
        strList.addAll(List.of("데이터2", "데이터3", "데이터4"));
        strList.addFirst("데이터5");
        strList.addLast("데이터6");
        strList.add(2, "데이터7");

        System.out.println(strList);
    }
}

class A2 {
    static void  run() {
        ArrayList<String> strList = new ArrayList<>();

        strList.addAll(List.of("데이터1", "데이터2", "데이터3", "데이터4"));
        boolean isRemoved = strList.remove("데이터2");
        String removedObject = strList.remove(2);
        strList.addAll(List.of("데이터5", "데이터6", "데이터7", "데이터8"));
        strList.removeAll(List.of("데이터6", "데이터7"));
        System.out.println(strList);

    }
}

//class A3 {
//    static void run() {
//        List<String> strList = List.of("데이터1", "데이터2", "데이터3");
//        strList.get(2);
//        System.out.println(data);
//    }
//}

class A4 {
    static void run() {
        List<String> strList = List.of("데이터1", "데이터2", "데이터3");
        boolean isContained = strList.contains("데이터5");
        System.out.println(isContained);
        boolean isContained2 = strList.get(1).contains("2");
        System.out.println(isContained2);

    }
}

class A_1 {
    static void run() {
        List<Integer> scoreList = List.of(85, 92, 78, 96, 88);
        int sum = 0;
        double avg = 0.0;
        int maxScore = 0;

        for (int i = 0; i < scoreList.size(); i++) {
            sum += scoreList.get(i);
            if (scoreList.get(i) > maxScore) {
                maxScore = scoreList.get(i);
            }
        }
        avg = (double )sum / scoreList.size();

        System.out.println("전체점수: " + scoreList);
        System.out.println("평균: " + avg);
        System.out.println("최고 점수: " + maxScore);
    }
}

class A_2 {
    static void run() {
        List<String> list = List.of("Java", "Python", "Java", "C++", "Python", "Go");
        List<String> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (newList.contains(list.get(i))) {
                continue;
            }
            newList.add(list.get(i));
        }
        System.out.println(list);
        System.out.println(newList);
    }
}
