package com.korai.study.ch05.practice;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
 // 👈 List 인터페이스 임포트 추가 필요!

public class AbstractMain01 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("최준하");
        names.add("최준하2");
        names.add("최준하3");
        System.out.println(names);

        LinkedList<String> names2 = new LinkedList<>();
        names2.add("최준하");
        names2.add("최준하2");
        names2.add("최준하3");
        System.out.println(names2);

        // 2차원 리스트 활용 예시
        List<List<String>> lists = new ArrayList<>();
        double[][] doubles = new double[2][2];
        lists.add(new ArrayList<>());
        lists.add(new LinkedList<>());
        lists.add(new ArrayList<>());
        lists.get(0).add("a");
        lists.get(1).add("b");
        lists.get(2).add("c");


        System.out.println(lists);

        double d = 10;
        int i = (int) d;
        System.out.println("i의 값: " + i);
    }
}
