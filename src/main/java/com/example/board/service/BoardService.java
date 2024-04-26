package com.example.board.service;

import com.example.board.dto.CreateEditBoardRequest;
import com.example.board.entity.BoardEntity;
import com.example.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

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
}
