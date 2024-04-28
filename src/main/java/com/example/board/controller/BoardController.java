package com.example.board.controller;

import com.example.board.dto.BoardDetailView;
import com.example.board.dto.BoardView;
import com.example.board.dto.CreateEditBoardRequest;
import com.example.board.dto.CreateReviewRequest;
import com.example.board.service.BoardService;
import com.example.board.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;
    private final ReviewService reviewService;

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
    @PostMapping("/review")
    public void reviewBoard(@RequestBody CreateReviewRequest request) {
        reviewService.createReview(request.getBoardId(), request.getContent(), request.getMemberName());
    }

    @DeleteMapping("/review/{reviewId}")
    public void deleteReview(@PathVariable Long boardId) {
        reviewService.deleteReview(boardId);
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
