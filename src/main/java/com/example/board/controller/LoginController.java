package com.example.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {
    @PostMapping("/register")
    public String register() {
        return "register";
    }
    @PostMapping("/login")
    public String login() {
        return "login";
    }
    @PostMapping("/logout")
    public String logout() {
        return "logout";
    }
}
