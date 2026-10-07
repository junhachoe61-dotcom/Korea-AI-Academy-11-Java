package com.korai.study.ch10.TODO.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String username;
    private String password;
    private String name;
}
