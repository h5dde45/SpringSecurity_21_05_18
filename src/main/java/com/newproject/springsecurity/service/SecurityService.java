package com.newproject.springsecurity.service;


public interface SecurityService {

    //поиск залогиненых пользователей
    String findLoggedInUsername();

    void autologin(String username, String password);
}