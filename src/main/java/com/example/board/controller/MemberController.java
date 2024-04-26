package com.example.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    @PostMapping("/add")
    public String addMember() {
        return "addMember";
    }
    @GetMapping("/info")
    public String allMember() {
        return "allMember";
    }
    @GetMapping("/info/{memberId}")
    public String member() {
        return "member";
    }
    @PostMapping("/edit/{memberId}")
    public String editMemberId() {
        return "editMemberId";
    }
    @PostMapping("/editpassword/{memberId}")
    public String editPasswordMember() {
        return "editPasswordMember";
    }
}
