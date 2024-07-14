package com.example.board.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateReviewRequest {
    private final Long boardId;
    private final String memberName;
    private final String content;
}
