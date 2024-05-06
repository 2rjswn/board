package com.example.board.controller;

import com.example.board.dto.BoardDetailView;
import com.example.board.dto.BoardView;
import com.example.board.dto.CreateEditBoardRequest;
import com.example.board.dto.CreateReviewRequest;
import com.example.board.entity.BoardEntity;
import com.example.board.entity.ReviewEntity;
import com.example.board.service.BoardService;
import com.example.board.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;
    private final ReviewService reviewService;

    @GetMapping
    public ResponseEntity<List<BoardView>> getAllBoards() {
        return ResponseEntity.status(HttpStatus.OK).body(boardService.getAllBoards());
    }
    @PostMapping("/write")
    public ResponseEntity<BoardEntity> createBoard(@RequestBody CreateEditBoardRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(boardService.createBoard(request));
    }
    @GetMapping("/get/{boardId}")
    public ResponseEntity<BoardDetailView> getBoard(@PathVariable Long boardId) {
        return ResponseEntity.status(HttpStatus.CREATED).body(boardService.getBoard(boardId));
    }
    @PostMapping("/review")
    public ResponseEntity<Void> createReview(@RequestBody CreateReviewRequest request) {
        reviewService.createReview(request.getBoardId(), request.getContent(), request.getMemberName());
        return ResponseEntity.status(HttpStatus.CREATED).build();
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
