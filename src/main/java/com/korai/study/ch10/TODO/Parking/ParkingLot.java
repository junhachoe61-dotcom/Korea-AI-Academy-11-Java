package com.korai.study.ch10.TODO.Parking;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class ParkingLot {
    static final int CAPACITY = 10;
    static int nextNo = 1;

    ArrayList<Car> cars = new ArrayList<>();
    int totalSales;
    int exitCount;

    int remaining() {
        return CAPACITY - cars.size();
    }

    Car findByNumber(String carNumber) {
        for (Car car : cars) {
            if (car.carNumber.equals(carNumber)) {
                return car;
            }
        }
        return null;
    }

    void enter(String carNumber, boolean compact, LocalTime entryTime) {
        if (remaining() == 0) {
            System.out.println("만차입니다. 입차할 수 없습니다.");
            return;
        }
        if (findByNumber(carNumber) != null) {
            System.out.println("이미 주차 중인 차량입니다.");
            return;
        }
        Car car = new Car(nextNo++, carNumber, compact, entryTime);
        cars.add(car);
        System.out.println("[" + car.no + "번] " + carNumber + " 입차 완료 (남은 자리 " + remaining() + "칸)");
    }

    void exit(String carNumber, LocalTime exitTime) {
        Car car = findByNumber(carNumber);
        if (car == null) {
            System.out.println("등록되지 않은 차량입니다.");
            return;
        }
        if (exitTime.isBefore(car.entryTime)) {
            System.out.println("출차 시각이 입차 시각(" + car.entryTime + ")보다 빠릅니다.");
            return;
        }
        long minutes = Duration.between(car.entryTime, exitTime).toMinutes();
        int fee = FeeCalculator.calculate(minutes, car.compact);
        cars.remove(car);
        totalSales += fee;
        exitCount++;
        System.out.printf("%s | 주차 %d분 | 요금 %,d원%n", carNumber, minutes, fee);
    }

    void search(String keyword) {
        boolean found = false;
        for (Car car : cars) {
            if (car.carNumber.contains(keyword)) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색 결과 없음");
        }
    }

    void printAll() {
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("주차 " + cars.size() + "대 / 남은 자리 " + remaining() + "칸");
    }

    void printSales() {
        System.out.printf("출차 %d대 / 오늘 매출 %,d원%n", exitCount, totalSales);
    }
}