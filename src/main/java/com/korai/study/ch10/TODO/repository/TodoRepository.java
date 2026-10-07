package com.korai.study.ch10.TODO.repository;
import com.korai.study.ch10.TODO.entity.TodoStatus;
import com.korai.study.ch10.TODO.entity.Todo;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class TodoRepository {
    private int autoIncrement = 1;
    @Getter
    private List<Todo> todos;

    public TodoRepository() {
        todos = new ArrayList<>();
    }

    public void insert(Todo todo) {
        todo.setId(autoIncrement++);
        todos.add(todo);
    }

    public List<Todo> findAllByUserId(int userId) {
        List<Todo> filteringTodos = new ArrayList<>();
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getUser().getId() == userId) {
                filteringTodos.add(todos.get(i));
            }
        }
        if (filteringTodos.size() == 0) {
            return null;
        }
        return filteringTodos;
    }

    public void updateStatus(int todoId, TodoStatus todoStatus) {
        for (int i = 0; i < todos.size(); i ++) {
            if (todos.get(i).getId() == todoId) {
                todos.get(i).setStatus(todoStatus);
                break;
            }
        }
    }


}




















