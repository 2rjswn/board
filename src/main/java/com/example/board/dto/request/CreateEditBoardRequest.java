package com.example.board.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
@Builder
@AllArgsConstructor
public class CreateEditBoardRequest {
    private final String memberName;
    private final String title;
    private final String content;
    private final ZonedDateTime createAt;
    private final ZonedDateTime updateAt;
}
