package com.example.board.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.ZonedDateTime;
@Getter
@Builder
@Table(name = "member")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MemberEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String password;
    @Column
    private ZonedDateTime createAt;
    @Column
    private ZonedDateTime updateAt;
}
