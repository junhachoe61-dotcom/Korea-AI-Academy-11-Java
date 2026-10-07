package com.korai.study.ch10;

public class Singleton {
    public static void main(String[] args) {
        StudentService studentService = StudentService.getInstance() ; // private StudentService 때문에 생성 불가
        StudentService studentService2 = StudentService.getInstance() ;
        studentService.기능1();
        studentService.기능2();
    }
}


class StudentService {
    private static StudentService instance;

    private static void call() {}

    public static StudentService getInstance() {
        if (instance == null) {
            instance = new StudentService();
        }
        return instance;

    }
        public void 기능1() {

        }

        public void 기능2() {

        }

}
