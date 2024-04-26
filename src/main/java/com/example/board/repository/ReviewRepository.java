package com.example.board.repository;

import com.example.board.entity.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<ReviewEntity, Long> {
    public List<ReviewEntity> findAllByRestaurantId(Long BoardId);
}
