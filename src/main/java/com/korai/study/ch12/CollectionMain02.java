package com.korai.study.ch12;

import lombok.AllArgsConstructor;

public class CollectionMain02 {
    public static void main(String[] args) {
        CustomLinkedList<String> list1 = new CustomLinkedList<>();
        list1.add("자바");
        list1.add("자바2");
        list1.add("자바3");
        System.out.println(list1);
        // System.out.println(list1.get(1));
    }
}

// LinkedList -> 선형리스트(단방향)
// 노드를 연결한다.
// 노드란? 연결된 다른 노드들의 주소와 저장할 값을 포함한 것
class CustomLinkedList<E> {
    @AllArgsConstructor
    private static class Node<E> {
        E item;
        Node<E> next;
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            builder.append(current.item);
            if (i != size - 1) {
                builder.append(", ");
            }
            current = current.next;
        }
        builder.append("]");
        return builder.toString();
    }

    public void add(E e) {
        Node<E> newNode = new Node<>(e, null);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;

    }
}








