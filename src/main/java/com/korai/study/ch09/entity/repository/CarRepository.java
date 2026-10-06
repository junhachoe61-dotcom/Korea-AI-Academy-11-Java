package com.korai.study.ch09.entity.repository;

import com.korai.study.ch09.entity.Car;
import java.util.List;

public class CarRepository {
    private static Long autoIncrement = 1L; // 정적 변수 autoIncrement 가 생성 초기값 1L 할당
    private final List<Car> carList;  // 인스턴스 변수로만 선언

    public CarRepository(List<Car> carList) {
          this.carList = carList;
    }

    public void insert(Car car) {
        car.setId(autoIncrement++);
        carList.add(car);
    }

    // 수정: (Long car id) -> (Long id)
    public Car delete(Long id) {
        // 수정: for문의 문법 오류 해결
        for (int i = 0; i < carList.size(); i++) {
            // Long 객체 비교는 .equals()를 사용하는 것이 안전합니다.
            if (!carList.get(i).getId().equals(id)) {
                continue;
            }
            return carList.remove(i);
        }
        return null;
    }

    public void printAll() {
        System.out.println("Car 전체 조회");
        for (Car car : carList) {
            System.out.println(car);
        }
        System.out.println();
    }
}