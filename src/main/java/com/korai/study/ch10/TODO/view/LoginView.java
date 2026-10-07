package com.korai.study.ch10.TODO.view;

import com.korai.study.ch10.TODO.config.SecurityConfig;
import com.korai.study.ch10.TODO.router.RootRouter;
import com.korai.study.ch10.TODO.service.UserService;

import java.util.Scanner;

public class LoginView implements View {

    private UserService userService;
    private Scanner scanner;

    public LoginView(UserService userService) {
        this.userService = userService;
        scanner = new Scanner(System.in);
    }


    public void show() {
        String username;
        String password;

        System.out.println("[ TODO LIST 로그인 ]");
        System.out.print("username: ");
        username = scanner.nextLine();
        System.out.print("password: ");
        password = scanner.nextLine();

        String token = userService.login(username, password);
        if (token == null) {
            System.out.println("로그인 정보를 다시 확인하세요.");
            System.out.print("계속 진행하시려면 엔터를 눌러주세요...");
            scanner.nextLine();
            return;
        }

        SecurityConfig.setLoginSession(token);
        System.out.println(String.format("로그인 성공. %s님 환영합니다.", username));
        RootRouter.setCurrent("todo-list");
    }

}