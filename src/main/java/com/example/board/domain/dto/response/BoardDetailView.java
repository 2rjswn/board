package com.example.board.domain.dto.response;

import com.example.board.domain.dto.request.CreateReviewRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class BoardDetailView {
    private final Long id;
    private final String memberName;
    private final String title;
    private final String content;
    private final ZonedDateTime createAt;
    private final ZonedDateTime updateAt;
    private final List<CreateReviewRequest> reviews;
}
