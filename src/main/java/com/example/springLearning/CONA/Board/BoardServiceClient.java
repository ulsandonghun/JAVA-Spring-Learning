package com.example.springLearning.CONA.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;

@SpringBootApplication
public class BoardServiceClient implements CommandLineRunner {

    private final BoardService boardService;

    @Autowired
    public BoardServiceClient(BoardService boardService) {
        this.boardService = boardService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BoardServiceClient.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setTitle("건대 제목");
        boardDTO.setWriter("최동훈 201912344");
        boardDTO.setContent("스마트ICT융합공학과");

        boardService.createBoard(boardDTO);

        List<Board> boardList = boardService.getAllBoards();
        for (Board board : boardList) {

            System.out.println("--->" + board.getTitle());
            System.out.println("--->" + board.getWriter());
            System.out.println("--->" + board.getContent());
            System.out.println("--->" + board.getCnt());
            System.out.println("--->" + board.getRegDate());
        }
    }
}
