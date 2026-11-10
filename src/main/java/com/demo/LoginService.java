package com.demo;

public class LoginService {
    public boolean login(String username, String password) {
        return "admin".equals(username) && "123456".equals(password);
    }
}