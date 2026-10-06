package com.korai.study.ch09.entity.service;

import com.korai.study.ch09.entity.repository.CarRepository;

import java.util.ArrayList;

public class InitService implements Runnable {
    public static CarRepository CarRepository;

    public InitService() {
        run();  // 2. Initservice 생성자가 실행되면서 내부에 있는 run메서드를 자동으로 호출
    }

    @Override
    public void run() {
        System.out.println("프로그램 초기 설정 시작..."); // 3. 프로그램 초기 설정 시작 출력
        CarRepository = new CarRepository(new ArrayList<>()); // 4. new ArrayList로 텅 빈리스트를 하나 만든다.
        // 5. 빈 리스트를 CarRepository에 전달하여 객체를 생성, static 변수인 CarRepository에 저장
        System.out.println("프로그램 초기 설정 완료"); // 6. 콘솔에 프로그램 초기 설정 완료가 출력
    }

    public static CarRepository getCarRepository() {
        return CarRepository;
    }
}
