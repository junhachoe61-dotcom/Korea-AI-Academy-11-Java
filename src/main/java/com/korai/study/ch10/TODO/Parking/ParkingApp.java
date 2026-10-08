package com.korai.study.ch10.TODO.Parking;

import java.time.LocalTime;
import java.util.Scanner;

public class ParkingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingLot lot = new ParkingLot();
        boolean running = true;

        System.out.println("===== 코리아 주차장 =====");
        while (running) {
            System.out.println("1.입차 2.출차 3.주차현황 4.차량검색 5.오늘매출 0.종료");
            System.out.print("선택 > ");
            String menu = sc.nextLine().trim();

            switch (menu) {
                case "1": {
                    String carNumber = inputCarNumber(sc);
                    if (carNumber == null) break;
                    System.out.print("차종(1.일반 2.경차) > ");
                    boolean compact = sc.nextLine().trim().equals("2");
                    System.out.print("입차 시각(HH:mm) > ");
                    LocalTime entryTime = LocalTime.parse(sc.nextLine().trim());
                    lot.enter(carNumber, compact, entryTime);
                    break;
                }
                case "2": {
                    String carNumber = inputCarNumber(sc);
                    if (carNumber == null) break;
                    if (lot.findByNumber(carNumber) == null) {
                        System.out.println("등록되지 않은 차량입니다.");
                        break;
                    }
                    System.out.print("출차 시각(HH:mm) > ");
                    LocalTime exitTime = LocalTime.parse(sc.nextLine().trim());
                    lot.exit(carNumber, exitTime);
                    break;
                }
                case "3":
                    lot.printAll();
                    break;
                case "4":
                    System.out.print("검색어 > ");
                    lot.search(sc.nextLine().trim());
                    break;
                case "5":
                    lot.printSales();
                    break;
                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴입니다.");
            }
            System.out.println();
        }
    }

    static String inputCarNumber(Scanner sc) {
        System.out.print("차량번호 > ");
        String carNumber = sc.nextLine().trim();
        if (carNumber.isEmpty()) {
            System.out.println("차량번호를 입력해 주세요.");
            return null;
        }
        return carNumber;
    }
}