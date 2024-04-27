package com.example.board.controller;

import com.example.board.dto.BoardView;
import com.example.board.dto.CreateEditBoardRequest;
import com.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    public List<BoardView> getAllBoards() {
        return boardService.getAllBoards();
    }
    @PostMapping("/write")
    public void writeBoard(CreateEditBoardRequest request) {
        boardService.createBoard(request);
    }
    @GetMapping("/get/{boardId}")
    public String getBoard() {
        return "getBoard";
    }
    @PostMapping("/review/{boardId}")
    public String reviewBoard() {
        return "reviewBoard";
    }
    @PostMapping("/edit/{boardId}")
    public String editBoard() {
        return "editBoard";
    }
    @DeleteMapping("/delete/{boardId}")
    public String deleteBoard() {
        return "deleteBoard";
    }

}
