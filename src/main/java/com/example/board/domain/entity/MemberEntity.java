package com.example.board.domain.entity;

import com.example.board.domain.entity.enums.Role;
import com.example.board.global.util.StringListConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Builder
@Table(name = "member")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MemberEntity {
    @Id
    @GeneratedValue
    private UUID id;
    @Column
    private String name;
    @Column
    private String email;
    @Convert(converter = StringListConverter.class)
    private List<Role> roles;
    @Column
    private String password;
    @OneToMany(mappedBy = "user")
    @Builder.Default
    private Set<BoardEntity> posts = new HashSet<>();
}
