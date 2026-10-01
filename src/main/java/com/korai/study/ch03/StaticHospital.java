package com.korai.study.ch03;

public class StaticHospital {
    public static void main(String[] args) {
        환자 p1 = 병원.접수("김준일");
        환자 p2 = 병원.접수("김준이");
        환자 p3 = 병원.접수("김준삼");
        병원.진료(p1);
        병원.진료(p2);
        System.out.println("대기 인원: " + 병원.대기인원);
        System.out.println(p1.이름 + " " + p1.진료완료);
        System.out.println(p3.이름 + " " + p3.진료완료);
    }
}

class 환자 {
    int 대기번호;
    String 이름;
    boolean 진료완료;

    환자(int 대기번호, String 이름) {
        System.out.println(대기번호 + "번 " + 이름 + " 접수");
        this.대기번호 = 대기번호;
        this.이름 = 이름;
    }
}

class 병원 {
    static int 번호 = 1;
    static int 대기인원 = 0;

    static {
        System.out.println("병원 클래스 로딩");
    }

    static 환자 접수(String 이름) {
        대기인원++;
        return new 환자(번호++, 이름);
    }

    static void 진료(환자 p) {
        p.진료완료 = true;
        대기인원--;
    }
}
