package com.korai.study.ch10.TODO.service;

import com.korai.study.ch10.TODO.config.SecurityConfig;
import com.korai.study.ch10.TODO.entity.User;
import com.korai.study.ch10.TODO.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public String login(String username, String password) {
        User foundUser = userRepository.findByUsername(username);
        if (foundUser == null) {
            return null;
        }
        if (!Objects.equals(foundUser.getPassword(), password)) {
            return null;
        }
        return SecurityConfig.generateSessionToken(foundUser);
    }
}