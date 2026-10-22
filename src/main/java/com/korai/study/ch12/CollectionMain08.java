package com.korai.study.ch12;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class CollectionMain08 {
    public static void main(String[] args) {
        Map<String, String> productMap = new LinkedHashMap<>();
        productMap.put("productName", "상품1");
        productMap.put("price", "20000");
        productMap.put("createAt", "2026-10-19");
        System.out.println(productMap);
        System.out.println(productMap.get("price"));

        Map<String, Object> student = new LinkedHashMap<>();
        student.put("name", "김준일");
        student.put("age", 33);
        student.put("gender", true);
        System.out.println(student);
    }
}
