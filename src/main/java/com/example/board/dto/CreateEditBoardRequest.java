package com.example.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
@AllArgsConstructor
public class CreateEditBoardRequest {
    private final String  memberName;
    private final String title;
    private final String content;
    private final ZonedDateTime createAt;
    private final ZonedDateTime updateAt;
}
