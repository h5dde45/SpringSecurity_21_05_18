package com.newproject.springsecurity.service;

import com.newproject.springsecurity.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
