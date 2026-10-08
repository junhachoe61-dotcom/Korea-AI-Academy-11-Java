package com.korai.study.ch10.TODO.router;

import com.korai.study.ch10.TODO.repository.TodoRepository;
import com.korai.study.ch10.TODO.repository.UserRepository;
import com.korai.study.ch10.TODO.service.TodoService;
import com.korai.study.ch10.TODO.service.UserService;
import com.korai.study.ch10.TODO.view.*;

import java.util.Map;

public class RootRouter {
    private static String current = "login";  // login은 viewmap에 의해 loginview로 설정
    private static Map<String, View> viewMap;

    public static void setUp() {
        UserRepository userRepository = new UserRepository(); // 데이터 창고 역할
        UserService userService = new UserService(userRepository); // 로그인 검사 로직, 데이터 창고 연결
        LoginView loginView = new LoginView(userService); // 로그인 화면, 로그인 처리 서비스 연결

        TodoRepository todoRepository = new TodoRepository();  // 할일 저장창고 역할
        TodoService todoService = new TodoService(todoRepository, userRepository);  // 할일들의 변경 상태 저장, 할일 창고와 데이터 창고 연결
        TodoListView todoListView = new TodoListView(todoService);  // 할일들의 목록 , 할일 서비스 연결

        TodoRegisterView todoRegisterView = new TodoRegisterView(todoService);  // 할일 등록화면, 할일 서비스 연결
        TodoStatusView todoStatusView = new TodoStatusView(todoService);  // 상태 변경 화면, 할일 서비스 연결

        viewMap = Map.of(       // 수납장에 화면 정리하기
                "login", loginView,   // 객체들의 이름을 붙여 하나의 지도를 묶어준다
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
































