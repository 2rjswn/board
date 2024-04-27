package com.example.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CreateReviewRequest {
    private final Long boardId;
    private final String memberName;
    private final String content;
}
