package com.example.board.global.util;
import com.example.board.domain.entity.MemberEntity;
import com.example.board.global.exception.HttpException;
import com.example.board.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MemberUtil {
    private final MemberRepository memberRepository;

    public MemberEntity getCurrentMember(){
        return memberRepository.findByEmail(SecurityContextHolder.getContext().getAuthentication().getName())
                .orElseThrow(() -> new HttpException(HttpStatus.NOT_FOUND, "해당 유저를 찾을 수 없습니다."));
    }
}