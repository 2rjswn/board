package com.example.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class BoardDetailView {
    private final String  memberName;
    private final String title;
    private final String content;
    private final ZonedDateTime createAt;
    private final ZonedDateTime updateAt;
    private final List<CreateReviewRequest> reviews;
}
