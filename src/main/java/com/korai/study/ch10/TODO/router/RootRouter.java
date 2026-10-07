package com.korai.study.ch10.TODO.router;

import com.korai.study.ch10.TODO.repository.TodoRepository;
import com.korai.study.ch10.TODO.repository.UserRepository;
import com.korai.study.ch10.TODO.service.TodoService;
import com.korai.study.ch10.TODO.service.UserService;
import com.korai.study.ch10.TODO.view.*;

import java.util.Map;

public class RootRouter {
    private static String current = "login";
    private static Map<String, View> viewMap;

    public static void setUp() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        LoginView loginView = new LoginView(userService);

        TodoRepository todoRepository = new TodoRepository();
        TodoService todoService = new TodoService(todoRepository, userRepository);
        TodoListView todoListView = new TodoListView(todoService);

        TodoRegisterView todoRegisterView = new TodoRegisterView(todoService);
        TodoStatusView todoStatusView = new TodoStatusView(todoService);

        viewMap = Map.of(
                "login", loginView,
                "todo-list", todoListView,
                "todo-register", todoRegisterView,
                "todo-status", todoStatusView
        );
    }

    public static String getCurrent() {
        return current;
    }

    public static void setCurrent(String path) {
        current = path;
    }

    public static View getCurrentView() {
        return viewMap.get(current);
    }
}
































