package com.example.springLearning.domain.user;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
@Data
public class UserSignUpDto {

    private Long id;
    private String password;



}
