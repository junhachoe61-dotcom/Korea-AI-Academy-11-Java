package com.korai.study.ch02;

public class FunctionMain {

    public static void main(String[] args) {


        // 반복적인 작업을 다시 사용할 수 있도록 정의(도구를 만드는 것)
        // 1. 재사용성
        // 2. 정리

        String date = "2026-09-23";
        String name = "최준하";
        String content = "자바 수업 진행하기";
        System.out.println("업무일지[ " + date + "]");
        System.out.println("이름: " + name);
        System.out.println("내용: " + content);
        System.out.println();

         date = "2026-09-24";
         name = "최준하";
         content = "git 수업 진행하기";
        System.out.println("업무일지[ " + date + "]");
        System.out.println("이름: " + name);
        System.out.println("내용: " + content);
        System.out.println();

        class 업무일지기능 {
            String date;
            String name;
            String content;

            void 업무일지출력() {
                System.out.println("업무일지[ " + date + "]");
                System.out.println("이름: " + name);
                System.out.println("내용: " + content);
                System.out.println();
            }
        }

        업무일지기능 f1 = new 업무일지기능();
        f1.date = "2026-09-25";
        f1.name = "최준하";
        f1.content = "함수 수업하기";
        f1.업무일지출력();  // 함수호출

        업무일지기능 f2 = new 업무일지기능();
        f2.date = "2026-09-26";
        f2.name = "최준하";
        f2.content = "자료형 수업하기";
        f2.업무일지출력();  // 함수호출


        class 업무일지기능2 {
            void 업무일지출력(String date, String name, String content) {
                System.out.println("업무일지[ " + date + "]");
                System.out.println("이름: " + name);
                System.out.println("내용: " + content);
                System.out.println();
            }
            // "2026-09-23" -> 2026년 09월 07일
            String 날짜표기변환(String date) {
                String[] splitDate = date.split("-");
                String year = splitDate[0];
                String month = splitDate[1];
                String day = splitDate[2];
                return year + "년" + month + "월" + day + "일";

            }
        }

        업무일지기능2 f3 = new 업무일지기능2();
        f3.업무일지출력("2026-09-27", "최준하", "변수 수업하기");
        f3.업무일지출력("2026-09-28", "최준하", "상수 수업하기");
        f3.업무일지출력(f3.날짜표기변환("2026-09-28"), "최준하", "상수수업하기" );
    }

}
