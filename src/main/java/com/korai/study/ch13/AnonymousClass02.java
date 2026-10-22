package com.korai.study.ch13;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Scanner;

public class AnonymousClass02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Button homeButton = new Button("홈", new MouseEvent() {
            @Override
            public void click() {
                System.out.println("홈으로 이동");

            }
        });

        Button loginButton = new Button("로그인", new MouseEvent() {
            @Override
            public void click() {
                System.out.println("로그인으로 이동");

            }
        });

        Button logoutButton = new Button("로그아웃", new MouseEvent() {
            @Override
            public void click() {
                System.out.println("로그아웃");

            }
        });

        while (true) {
            System.out.print("버튼 클릭: ");
            int in = scanner.nextInt();
            scanner.nextLine();

            switch (in) {
                case 1:
                    homeButton.onClick();
                    break;
                case 2:
                    loginButton.onClick();
                    break;
                    case 3:
                        logoutButton.onClick();
                        break;
                    default:
            }
        }
    }
}

interface MouseEvent {
    void click();
}

@Data
@AllArgsConstructor
class Button {
    private String text;
    private MouseEvent mouseEvent;

    public void onClick() {
        mouseEvent.click();
    }
}
