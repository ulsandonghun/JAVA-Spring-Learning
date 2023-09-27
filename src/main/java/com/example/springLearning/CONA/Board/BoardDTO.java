package com.example.springLearning.CONA.Board;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
    private Long id;
    private String title;
    private String writer;
    private String content;
    private int cnt;
    // getters and setters
}
