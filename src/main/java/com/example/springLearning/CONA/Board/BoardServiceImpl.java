package com.example.springLearning.CONA.Board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    @Override
    public List<Board> getAllBoards() {
        return boardRepository.findAll();
    }

    @Override
    public Board createBoard(BoardDTO boardDTO) {
        log.info("새로운 Board 생성");
        Board board = new Board();
        board.setTitle(boardDTO.getTitle());
        board.setWriter(boardDTO.getWriter());
        board.setContent(boardDTO.getContent());
        board.setCnt(boardDTO.getCnt());
        return boardRepository.save(board);
    }

    @Override
    public Board updateBoard(BoardDTO boardDTO) {
        Optional<Board> optionalBoard = boardRepository.findById(boardDTO.getId());
        if (optionalBoard.isPresent()) {
            Board board = optionalBoard.get();
            board.setTitle(boardDTO.getTitle());
            board.setWriter(boardDTO.getWriter());
            board.setContent(boardDTO.getContent());
            board.setCnt(boardDTO.getCnt());
            return boardRepository.save(board);
        }
        return null; // 또는 예외 처리 추가
    }

    @Override
    public void deleteBoard(BoardDTO boardDTO) {
        boardRepository.deleteById(boardDTO.getId());
    }

    @Override
    public Board getBoardById(BoardDTO boardDTO) {
        return boardRepository.findById(boardDTO.getId()).orElse(null);
    }
}
