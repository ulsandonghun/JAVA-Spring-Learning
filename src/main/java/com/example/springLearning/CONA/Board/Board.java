package com.example.springLearning.CONA.Board;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Board {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String writer;
    private String content;

    @CreatedDate
    private Timestamp regDate;

    private int cnt;
}
