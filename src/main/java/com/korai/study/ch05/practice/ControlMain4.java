package com.korai.study.ch05.practice;

import com.korai.study.ch03.access.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ControlMain4 {
    public static void main(String[] args) throws IOException {
        // 입력
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);

        FileReader fileReader = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        String text = "";
        while ((text = bufferedReader.readLine()) != null) {  //EOF 체크
            stringBuilder.append(text);
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }
}