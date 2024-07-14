package com.example.board.controller;

import com.example.board.dto.request.UserJoinRequest;
import com.example.board.dto.request.UserLoginRequest;
import com.example.board.dto.response.UserLoginResponse;
import com.example.board.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final AuthService authService;
    @PostMapping("/join")
    public ResponseEntity<Void> joinMember(@RequestBody @Valid UserJoinRequest userJoinRequest){
        authService.joinMember(userJoinRequest);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<UserLoginResponse> loginMember(@RequestBody @Valid UserLoginRequest userLoginRequest){
        return ResponseEntity.ok(authService.loginMember(userLoginRequest));
    }
}
