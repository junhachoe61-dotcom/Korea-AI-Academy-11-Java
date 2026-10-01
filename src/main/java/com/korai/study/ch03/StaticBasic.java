package com.korai.study.ch03;

import java.time.LocalDate;

public class StaticBasic {
    public static void main(String[] args) {
        학생관리시스템 system = new 학생관리시스템();
        학생 s1 = system.학생추가("김준일");
        학생 s2 = system.학생추가("김준이");
        학생 s3 = system.학생추가("김준삼");

    }
}

class 학생 {
    int 학번;
    String 이름;

    학생(int 학번, String 이름) {
        // 힙 메모리를 빌려서 객체를 생성 및 할당
        System.out.println("생성자 호출");
        this.이름 = 이름;
        this.학번 = 학번;
    }
}

class 학생관리시스템 {
    static int 년도 = LocalDate.now().getYear();
    static int 번호 = 1;

    static {
        System.out.println("학생관리시스템 클래스 로딩");
    }

    학생 학생추가(String 이름) {
        return (new 학생(년도 * 10000 + 번호++, 이름));
    }
}