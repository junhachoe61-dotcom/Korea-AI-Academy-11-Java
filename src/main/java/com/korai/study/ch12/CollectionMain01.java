package com.korai.study.ch12;

import java.util.ArrayList;

/**
 * Collection(컬렉션)
 * 여러개의 데이터를 관리하는 방법
 * 데이터의 중복을 허용하지 않아야 한다.
 *
 * 1. 배열
 * 2. 리스트 - ArrayList, LinkedList
 * 3. 세트 - HashSet
 * 4. 맵 - HashMap
 */

public class CollectionMain01 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("자바");
        strings.add("파이썬");
        StringArrayList strList = new StringArrayList();
        strList.add("자바");
        strList.add("파이썬");

        System.out.println(strings);
        System.out.println(strList);

        System.out.println(strings.get(0));
        System.out.println(strList.get(1));

        strings.set(1, "자바스크립트");
        System.out.println(strings);

        strList.set(1, "자바스크립트");
        System.out.println(strList);

        String removedValue =  strings.remove(0);
        System.out.println(removedValue);
        System.out.println(strings);

        String removedValue2 =  strList.remove(0);
        System.out.println(removedValue2);
        System.out.println(strList);
    }
}

class StringArrayList {
    private String[] list;

    public StringArrayList() {
        list = new String[0];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < list.length; i++) {
            builder.append(list[i]);
            if (list.length - 1 != i) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    public void add(String str) {
        String[] newArray = new String[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newArray[i] = list[i];
        }
        newArray[newArray.length - 1] = str;
        list = newArray;
    }

    public String get(int index) {
        return list[index];
    }

    public void set(int index, String value) {
        list[index] = value;
    }

    public String remove(int index) {
        String[] newArray = new String[list.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = list[i];
            } else {
                newArray[i] = list[i + 1];
            }
        }
        String removedValue = list[index];
        list = newArray;
        return removedValue;
    }

}











