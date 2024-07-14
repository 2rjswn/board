package com.example.board.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
@Builder
@AllArgsConstructor
public class BoardView {
    private final Long id;
    private final String memberName;
    private final String title;
    private final String content;
}
