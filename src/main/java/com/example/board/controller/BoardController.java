package com.example.board.controller;

import com.example.board.dto.BoardDetailView;
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
    public void writeBoard(@RequestBody CreateEditBoardRequest request) {
        boardService.createBoard(request);
    }
    @GetMapping("/get/{boardId}")
    public BoardDetailView getBoard(@PathVariable Long boardId) {
        return boardService.getBoard(boardId);
    }
    @PostMapping("/writeReview/{boardId}")
    public String reviewBoard() {
        return "reviewBoard";
    }
    @PostMapping("/edit/{boardId}")
    public void editBoard(@PathVariable Long boardId, @RequestBody CreateEditBoardRequest request) {
        boardService.editBoard(request  ,boardId);
    }
    @DeleteMapping("/delete/{boardId}")
    public void deleteBoard(@PathVariable Long boardId) {
        boardService.deleteBoard(boardId);
    }

}
