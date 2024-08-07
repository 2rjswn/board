package com.example.board.domain.repository;

import com.example.board.domain.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface MemberRepository extends JpaRepository<MemberEntity, UUID> {
    boolean existsByEmail(String email);
    Optional<MemberEntity> findByEmail(String email);
}
