package com.example.springLearning.CONA.Board;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BoardService {
    List<Board> getAllBoards();
    Board createBoard(BoardDTO boardDTO);
    Board updateBoard( BoardDTO boardDTO);
    void deleteBoard(BoardDTO boardDTO);
    Board getBoardById(BoardDTO boardDTO);

}
