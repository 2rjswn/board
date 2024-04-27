package com.example.board.service;

import com.example.board.dto.BoardView;
import com.example.board.dto.CreateEditBoardRequest;
import com.example.board.entity.BoardEntity;
import com.example.board.repository.BoardRepository;
import com.example.board.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;
    private final ReviewRepository reviewRepository;

    @Transactional
    public BoardEntity createBoard(CreateEditBoardRequest request){
        BoardEntity board = BoardEntity.builder()
                .memberName(request.getMemberName())
                .title(request.getTitle())
                .content(request.getContent())
                .createAt(request.getCreateAt())
                .updateAt(request.getUpdateAt())
                .build();
        boardRepository.save(board);
        return board;
    }

    @Transactional
    public List<BoardView> getAllBoards() {
        List<BoardEntity> boards = boardRepository.findAll();
        return boards.stream().map((board) -> BoardView.builder()
                .memberName(board.getMemberName())
                .title(board.getTitle())
                .content(board.getContent())
                .build()
        ).toList();

    }

}
