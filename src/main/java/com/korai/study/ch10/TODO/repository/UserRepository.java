package com.korai.study.ch10.TODO.repository;

import com.korai.study.ch10.TODO.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepository {
    private List<User> users;

    public UserRepository() {
        User user1 = new User(1, "test1", "1q2w3e4r!", "김준일");
        User user2 = new User(2, "test2", "1q2w3e4r!", "김준이");
        User user3 = new User(3, "test3", "1q2w3e4r!", "김준삼");
        User user4 = new User(4, "test4", "1q2w3e4r!", "김준사");
        users = List.of(user1, user2, user3, user4);
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (Objects.equals(user.getUsername(), username)) {
                return user;
            }
        }
        return null;
    }

    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }


}