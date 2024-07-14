package com.example.board.domain.service;

import com.example.board.domain.dto.request.UserJoinRequest;
import com.example.board.domain.dto.request.UserLoginRequest;
import com.example.board.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final MemberRepository memberRepository;
    public void joinMember(UserJoinRequest userJoinRequest){
    }

    public void loginMember(UserLoginRequest userLoginRequest){
    }
}
