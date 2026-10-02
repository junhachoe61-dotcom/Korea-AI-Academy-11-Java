package com.korai.study.ch05.practice;

public class AbstractMain05 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call();
        FeaturePhone featurePhone = new FeaturePhone();
        featurePhone.print1();
        featurePhone.print2();
        System.out.println(featurePhone.phoneNumber);
    }
}

class Phone {
    String phoneNumber;

    Phone() {
        System.out.println("Phone 생성자 호출");
    }

    void call() {
        System.out.println("전화를 건다");
    }
}

class SmartPhone extends Phone {
    SmartPhone(){
        System.out.println("smartphone 생성자 호출");
    }


    @Override
    void call() {
        System.out.println("전화 어플에 들어가서 전화를 건다.");
        super.call();

    }
}

class FeaturePhone extends Phone {
    String phoneNumber;

    FeaturePhone() {
        System.out.println("FeaturePhone 생성자 호출");
        phoneNumber = "010-1234-5678";
        super.phoneNumber = "010-1111-1111";
    }

    void print1() {
        System.out.println(phoneNumber);
    }

    void print2() {
        System.out.println(super.phoneNumber);
    }
}
