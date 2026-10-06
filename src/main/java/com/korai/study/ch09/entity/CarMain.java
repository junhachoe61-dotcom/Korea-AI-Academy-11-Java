package com.korai.study.ch09.entity;

import com.korai.study.ch09.entity.service.InitService;

public class CarMain {
    public static void main(String[] args) {
        new InitService(); // 1. 동작이 시작하자마자 Initservice 객체 생성

        InitService.getCarRepository().printAll();  // 7. 준비된 CarRepository를 불러와서 printAll();
        Car car = new Car(null, "189누 3446", "K8", "김준일");  // 8. 동작흐름 @AllArgsConstructor 덕분에 한번에 작성 가능
        Car car2 = new Car(null, "123가 4567", "아반떼", "이서연");
        Car car3 = new Car(null, "234나 5678", "쏘나타", "박민준");
        Car car4 = new Car(null, "45다 1234", "그랜저", "최지우");
        Car car5 = new Car(null, "312로 7890", "투싼", "정하늘");
        Car car6 = new Car(null, "67마 2468", "쏘렌토", "강도윤");
        Car car7 = new Car(null, "158보 1357", "K5", "윤서아");
        Car car8 = new Car(null, "221소 9753", "카니발", "임재현");
        Car car9 = new Car(null, "89우 8642", "G80", "한예린");
        Car car10 = new Car(null, "376주 3141", "팰리세이드", "오승우");
        InitService.getCarRepository().insert(car);
        InitService.getCarRepository().insert(car2);
        InitService.getCarRepository().insert(car3);
        InitService.getCarRepository().insert(car4);
        InitService.getCarRepository().insert(car5);
        InitService.getCarRepository().insert(car6);
        InitService.getCarRepository().insert(car7);
        InitService.getCarRepository().insert(car8);
        InitService.getCarRepository().insert(car9);
        InitService.getCarRepository().insert(car10);
        InitService.getCarRepository().printAll();
        InitService.getCarRepository().delete(5l);
        InitService.getCarRepository().printAll();

    }
}
