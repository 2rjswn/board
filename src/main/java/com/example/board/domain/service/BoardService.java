package com.example.board.domain.service;

import com.example.board.domain.dto.response.BoardDetailView;
import com.example.board.domain.dto.response.BoardView;
import com.example.board.domain.dto.request.CreateEditBoardRequest;
import com.example.board.domain.entity.BoardEntity;
import com.example.board.domain.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Transactional
    public void editBoard(CreateEditBoardRequest request, Long boardId) {
        BoardEntity board = boardRepository.findById(boardId).orElseThrow(() -> new RuntimeException("없다"));
        board.ChangeTitleAndContent(request.getTitle(), request.getContent());
        boardRepository.save(board);
    }

    @Transactional
    public void deleteBoard(Long boardId) {
        BoardEntity board = boardRepository.findById(boardId).orElseThrow(() -> new RuntimeException("없다"));
        boardRepository.delete(board);
    }

    @Transactional
    public List<BoardView> getAllBoards() {
        List<BoardEntity> boards = boardRepository.findAll();
        return boards.stream().map((board) -> BoardView.builder()
                .id(board.getId())
                .memberName(board.getMemberName())
                .title(board.getTitle())
                .content(board.getContent())
                .build()
        ).toList();
    }

    @Transactional
    public BoardDetailView getBoard(Long boardId) {
        BoardEntity board = boardRepository.findById(boardId).orElseThrow(() -> new RuntimeException("없다"));
        return BoardDetailView.builder()
                .id(board.getId())
                .memberName(board.getMemberName())
                .title(board.getTitle())
                .content(board.getContent())
                .createAt(board.getCreateAt())
                .updateAt(board.getUpdateAt())
                .build();
    }

}
