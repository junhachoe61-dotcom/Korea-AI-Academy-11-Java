package com.korai.study.ch10.TODO.Parking;

import java.time.LocalTime;

public class Car {
    int no;
    String carNumber;
    boolean compact;
    LocalTime entryTime;

    Car(int no, String carNumber, boolean compact, LocalTime entryTime) {
        this.no = no;
        this.carNumber = carNumber;
        this.compact = compact;
        this.entryTime = entryTime;
    }

    @Override
    public String toString() {
        return "[" + no + "번] " + carNumber + " | " + (compact ? "경차" : "일반")
                + " | " + entryTime + " 입차";
    }
}