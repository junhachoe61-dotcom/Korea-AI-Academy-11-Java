package com.korai.study.ch10.TODO;

import com.korai.study.ch10.TODO.repository.TodoRepository;
import com.korai.study.ch10.TODO.repository.UserRepository;
import com.korai.study.ch10.TODO.router.RootRouter;
import com.korai.study.ch10.TODO.service.TodoService;
import com.korai.study.ch10.TODO.service.UserService;
import com.korai.study.ch10.TODO.view.LoginView;
import com.korai.study.ch10.TODO.view.TodoListView;
import com.korai.study.ch10.TODO.view.View;

import java.util.Map;

public class TodoApplication {
    public static void main(String[] args) {
        RootRouter.setUp();

        while(true) {
            RootRouter.getCurrentView().show();
        }
    }
}