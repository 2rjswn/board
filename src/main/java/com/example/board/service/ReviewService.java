package com.example.board.service;

import com.example.board.dto.CreateReviewRequest;
import com.example.board.entity.ReviewEntity;
import com.example.board.repository.BoardRepository;
import com.example.board.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.ZonedDateTime;

@RequiredArgsConstructor
@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final BoardRepository boardRepository;

    @Transactional
    public void createReview(Long boardId, String content, String memberName) {
        boardRepository.findById(boardId).orElseThrow(() -> new RuntimeException("없다"));
        ReviewEntity review = ReviewEntity.builder()
                .boardId(boardId)
                .content(memberName)
                .content(content)
                .createAt(ZonedDateTime.now())
                .build();
        reviewRepository.save(review);
    }
    @Transactional
    public void deleteReview(Long boardId) {
        ReviewEntity review = reviewRepository.findById(boardId).orElseThrow(() -> new RuntimeException("없다"));
        reviewRepository.delete(review);
    }

}
