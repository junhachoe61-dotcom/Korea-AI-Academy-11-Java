package com.korai.study.ch10.TODO.view;

import com.korai.study.ch10.TODO.repository.TodoRepository;
import com.korai.study.ch10.TODO.router.RootRouter;
import com.korai.study.ch10.TODO.service.TodoService;

import java.util.Scanner;

// 여기에 implements View 를 추가합니다.
public class TodoRegisterView implements View {
    private final TodoService todoService;
    private Scanner scanner;

    public TodoRegisterView(TodoService todoService) {
        this.todoService = todoService;
        scanner = new Scanner(System.in);
    }

    @Override // 이제 정상적으로 작동합니다.
    public void show() {
        String content;
        System.out.println("[ 할 일 등록하기 ]");
        System.out.print("내용: ");
        content = scanner.nextLine();
        todoService.register(content);
        RootRouter.setCurrent("todo-list");

    }
}
