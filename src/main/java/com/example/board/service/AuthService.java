package com.example.board.service;

import com.example.board.dto.request.UserJoinRequest;
import com.example.board.dto.request.UserLoginRequest;
import com.example.board.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.board.dto.response.UserLoginResponse;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final MemberRepository memberRepository;
    public void joinMember(UserJoinRequest userJoinRequest){
    }

    public void loginMember(UserLoginRequest userLoginRequest){
    }
}
