package com.korai.study.ch05.practice;

import java.util.ArrayList;
import java.util.List;

public class AbstractMain06 {
    public static void main(String[] args) {
        List<RemoteControl> remoteControls = List.of(
                new TvRemoteControl(),
                new MonitorRemoteControl(),
                new TvRemoteControl(),
                new MonitorRemoteControl()
        );

        for (int i =0; i <remoteControls.size(); i++) {
            RemoteControl r = remoteControls.get(i);
            r.powerOn();
        }

        for (RemoteControl r : remoteControls) {
            r.powerOn();
        }
    }
}

interface Sensor {
    void send();
    void on();
    void off();

    default void send2(){

    }
}

abstract class RemoteControl implements Sensor {
    // 리모컨
    String modelName;

    void showModelName() {
        System.out.println(modelName);
    }

    abstract void powerOn();  // 추상 메서드

}

class TvRemoteControl extends RemoteControl {
    @Override  // 추상클래스와 추상클래스간 상속 가능 , 생성은 못함
    void powerOn() {
        System.out.println("TV 회로에 맞게 전원 공급");
    }

    @Override
    public void send() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
}

class MonitorRemoteControl extends RemoteControl {
    @Override
    public void send() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    void powerOn() {
        System.out.println("모니터 회로에 맞게 전원 공급");
    }
}