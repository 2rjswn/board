package com.example.board.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post")
public class BoardEntity {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "member_id", updatable = false)
    private MemberEntity member;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private ZonedDateTime createAt;
    @Column
    private ZonedDateTime updateAt;

    public void ChangeTitleAndContent(String title, String content) {
        this.title = title;
        this.content = content;
        this.updateAt = ZonedDateTime.now();

    }
}
