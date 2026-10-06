package com.korai.study.ch09.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;


@AllArgsConstructor  // 클래스에 있는 모든 변수를 한번에 입력 받아서 객체를 생성하게 해주는 생성자 자동 생성
@Data  // 객체의 데이터를 읽고, 수정하고, 객체 정보를 문자열로 보여주는 toString등의 필수 메서드들을 안보이게 전부 자동 생성
public class Car {
    private Long id;
    private String number;
    private String model;
    private String owner;
}
