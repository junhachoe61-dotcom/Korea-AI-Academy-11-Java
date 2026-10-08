package com.korai.study.ch10.TODO.Parking;

public class FeeCalculator {
    static final int FREE_MINUTES = 10;
    static final int BASE_MINUTES = 30;
    static final int BASE_FEE = 2000;
    static final int UNIT_MINUTES = 10;
    static final int UNIT_FEE = 500;
    static final int DAILY_MAX = 20000;

    static int calculate(long minutes, boolean compact) {
        // 1. 회차
        if (minutes <= FREE_MINUTES) {
            return 0;
        }
        // 2. 기본요금
        int fee = BASE_FEE;
        // 3. 추가요금 (10분 단위 올림)
        if (minutes > BASE_MINUTES) {
            long extra = minutes - BASE_MINUTES;
            long units = (extra + UNIT_MINUTES - 1) / UNIT_MINUTES;
            fee += units * UNIT_FEE;
        }
        // 4. 일 최대
        if (fee > DAILY_MAX) {
            fee = DAILY_MAX;
        }
        // 5. 경차 할인
        if (compact) {
            fee /= 2;
        }
        return fee;
    }
}