package com.example.springLearning.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor

public class UserDto {
    @NotNull(message = "유저의 이름은 필수 입력 사항입니다.")
    @Size(min = 3, max = 50, message = "유저이름은 3자이상 50자 이하입니다.")
    private String username;

    @JsonProperty(access = Access.WRITE_ONLY)
    @NotNull
    @Size(min = 3, max = 100)
    private String password;

    @NotNull(message = "닉네임은 필수 입력 사항입니다.")
    @Size(min=3,max = 50)
    private String nickname;
}
