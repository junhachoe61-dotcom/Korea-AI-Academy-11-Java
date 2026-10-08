package com.korai.study.ch05.practice;

import java.util.Arrays;

public class UserMain {
    static User[] getUsers() {
        return new User[] {
                new User(1,  "김민준", 23, "M", "서울", "minjun.kim@example.com",   1200, 2021, true),
                new User(2,  "이서연", 31, "F", "부산", "seoyeon.lee@example.com",  5400, 2019, true),
                new User(3,  "박도윤", 19, "M", "대구", "doyun.park@example.com",      0, 2025, true),
                new User(4,  "최지우", 27, "F", "서울", "jiwoo.choi@example.com",   8700, 2020, true),
                new User(5,  "정하준", 45, "M", "인천", "hajun.jung@example.com",    300, 2022, false),
                new User(6,  "강서윤", 22, "F", "광주", "seoyun.kang@example.com",  2500, 2023, true),
                new User(7,  "조은우", 38, "M", "서울", "eunwoo.jo@example.com",    9800, 2019, true),
                new User(8,  "윤지아", 20, "F", "대전", "jia.yoon@example.com",       50, 2026, true),
                new User(9,  "장시우", 52, "M", "부산", "siwoo.jang@example.com",   4100, 2020, false),
                new User(10, "임하은", 29, "F", "서울", "haeun.lim@example.com",    3300, 2021, true),
                new User(11, "한주원", 17, "M", "인천", "juwon.han@example.com",     700, 2026, true),
                new User(12, "오수아", 34, "F", "대구", "sua.oh@example.com",       6200, 2019, true),
                new User(13, "서지호", 41, "M", "광주", "jiho.seo@example.com",        0, 2024, false),
                new User(14, "신예은", 25, "F", "서울", "yeeun.shin@example.com",   1800, 2022, true),
                new User(15, "권유준", 63, "M", "대전", "yujun.kwon@example.com",   7500, 2019, true),
                new User(16, "황채원", 21, "F", "부산", "chaewon.hwang@example.com", 950, 2025, true),
                new User(17, "안건우", 30, "M", "서울", "gunwoo.ahn@example.com",   4800, 2020, false),
                new User(18, "송지유", 26, "F", "인천", "jiyu.song@example.com",    2200, 2023, true),
                new User(19, "전현우", 48, "M", "대구", "hyunwoo.jeon@example.com", 5600, 2021, true),
                new User(20, "홍다은", 18, "F", "서울", "daeun.hong@example.com",    100, 2026, true),
                new User(21, "유준서", 35, "M", "부산", "junseo.yoo@example.com",   3900, 2022, true),
                new User(22, "고민서", 24, "F", "광주", "minseo.ko@example.com",       0, 2024, false),
                new User(23, "문도현", 57, "M", "서울", "dohyun.moon@example.com",  9100, 2019, true),
                new User(24, "양서현", 33, "F", "대전", "seohyun.yang@example.com", 4400, 2020, true),
                new User(25, "손지훈", 28, "M", "인천", "jihoon.son@example.com",   1500, 2024, true),
                new User(26, "배수빈", 40, "F", "서울", "subin.bae@example.com",    6800, 2021, false),
                new User(27, "백승현", 20, "M", "대구", "seunghyun.baek@example.com", 400, 2025, true),
                new User(28, "허나윤", 36, "F", "부산", "nayun.heo@example.com",    7200, 2020, true),
                new User(29, "남태윤", 65, "M", "광주", "taeyun.nam@example.com",   2900, 2022, true),
                new User(30, "노은서", 22, "F", "서울", "eunseo.noh@example.com",   3600, 2023, true),
        };
    }

    public static void main(String[] args) {

        for (int i = 0; i < getUsers().length; i++) {
            System.out.println(getUsers()[i]);
        }

        System.out.println("------------------------------------");

        User[] users = getUsers();
        User[] maleUsers = new User[0];
        for (int i = 0; i < users.length; i++) {
            if (users[i].gender.equals("M")) {
                User[] newMaleUsers = new User[maleUsers.length + 1];
                for (int j = 0; j < maleUsers.length; j++) {
                    newMaleUsers[j] = maleUsers[j];
                }
                newMaleUsers[newMaleUsers.length - 1] = users[i];
                maleUsers = newMaleUsers;
            }
        }
        for (int i = 0; i < maleUsers.length; i++) {
            System.out.println(maleUsers[i]);
        }
    }
}