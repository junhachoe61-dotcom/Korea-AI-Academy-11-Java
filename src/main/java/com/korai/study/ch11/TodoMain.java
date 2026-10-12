package com.korai.study.ch11;

import jdk.jfr.DataAmount;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

public class TodoMain {
    public static  int pathIndex = 0;
    public static boolean running = true;

    public static void main(String[] args) {
        List<View> viewList = new ArrayList<>();
        viewList.add(HomeView.getHomeView());
        viewList.add(RegisterView.getInstance());
        viewList.add(ListView.getInstance());

        Scanner scanner = new Scanner(System.in);

        while(running) {
            viewList.get(pathIndex).show();
        }
    }
}

// Object(최상위) 클래스
@Data
@NoArgsConstructor
@AllArgsConstructor

// 정보를 관리할 수 있도록 도와줄 Entity 클래스
class Todo {
    private  int id;
    private String content;
}

// 기능을 추상화 할 때 -> interface
// 인터페이스로 기능을 추상화 했으면 구현 객체는 무조건 존재할 것이다.
interface View {
    void show();
}

// 클래스는 생성(메모리에 인스턴스를 실존하게 하는 것) 가능해야한다.

class HomeView implements View {

    // 싱글톤 2번 해당 클래스 자료형의 인스턴스를 담아둘 static 변수를 선언한다.
    // private으로 외부 접근 제한
    private static HomeView instance;


    // 싱글톤 1번 생성자를 private으로 정의한다.
    // private 접근제한자는 해당 클래스 내부에서만 접근할 수 있다.
    // 생성자를 숨겼다는 것은 외부에서 생성을 제한하기 위함이다.
    private HomeView() {

    }

    // 싱글톤 3번 static 변수 homeView가 null일 때 인스턴스를 생성
    // static getter를 통해서만 instance를 접근할 수 있게 유도
    public static HomeView getHomeView() {
        while (instance == null) {
            instance = new HomeView();
        }
        return instance;
    }

    @Override
    public void show() {
        Scanner scanner = new Scanner(System.in);
        String menu;
        System.out.println("[ HOME ]");
        System.out.println("R. TODO 등록하기");
        System.out.println("L. TODO 목록조회");
        System.out.println("Q. 프로그램 종료");
        System.out.println(">>> ");
        menu = scanner.nextLine().trim();  // abc
        menu = String.valueOf(menu.charAt(0));
        System.out.println(menu.matches("[a-zA-z]"));
        boolean isAlphabet = menu.matches("[a-zA-z]");
        if (!isAlphabet) {
            System.out.println("영문자만 입력 가능합니다.");
            return;

        }
        menu = menu.toUpperCase();
        if ("Q".equals(menu)) {
            TodoMain.running = false;
        } else if ("R".equals(menu)) {
            TodoMain.pathIndex =1;

        } else if ("L".equals(menu)) {
            TodoMain.pathIndex =2;
        } else {
            System.out.println("다시 입력하세요");
        }
    }
}

class RegisterView implements View {

    private static RegisterView instance;

    private RegisterView() {

    }

    public static RegisterView getInstance() {
        while (instance == null) {
            instance = new RegisterView();
        }
        return instance;
    }

    @Override
    public void show() {
        Scanner scanner = new Scanner(System.in);
        String content;
        System.out.println("[ REGISTER ]");
        System.out.println("내용을 입력하세요.");

        System.out.print(">>> ");
        content = scanner.nextLine().trim();
        Todo newTodo = new Todo(0, content);
        newTodo.setContent(content);
        TodoRepository.getInstance().insert(newTodo);
        System.out.println("TODO 추가 완료.");
        TodoMain.pathIndex = 0;
    }
}

class ListView implements View {

    private static ListView instance;

    private ListView() {

    }

    public static ListView getInstance() {
        while (instance == null) {
            instance = new ListView();
        }
        return instance;
    }

    @Override
    public void show() {
        System.out.println("[ LIST ]");
        List<Todo> todos = TodoRepository.getInstance().findAll();
        if (todos.size() == 0) {
            System.out.println("등록된 TODO가 없습니다.");
            TodoMain.pathIndex = 0;
            return;
        }
        for (Todo todo : todos) {
            System.out.println(todo);
        }
        TodoMain.pathIndex = 0;
    }
}

interface  Repository<T> {
    void insert(T t);
    void update(T t);
    T delete(int id);
    T findById(int id);
    List<T> findAll();
}

class TodoRepository implements Repository<Todo> {
    private static TodoRepository instance;  // -------------------  singleton 생성
    private int lastId;
    private List<Todo> todos;

    private TodoRepository() {
        lastId = 1;
        todos = new ArrayList<>();
    }

    public static TodoRepository getInstance() {
        if (instance == null) {
            instance = new TodoRepository();
        }
        return instance;
    }                                     // -------------- singleton 생성

    @Override
    public void insert(Todo todo) {
        todo.setId(lastId++);
        todos.add(todo);
    }

    @Override
    public void update(Todo todo) {
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId() == todo.getId()) {
                todos.set(i, todo);
                break;
            }
        }
    }

    @Override
    public Todo delete(int id) {
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId() == id) {
                return todos.remove(i);
            }
        }
        return null;
    }

    @Override
    public Todo findById(int id) {

        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId() == id) {
                return todos.get(i);
            }
        }
        return null;
    }


    @Override
    public List<Todo> findAll() {
        // List<Todo> copyTodos = new ArrayList<>();
        // copyTodos.addAll(todos);
        // return copyTodos;
        return List.copyOf(todos);
    }
}
