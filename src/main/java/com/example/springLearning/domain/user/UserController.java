package com.example.springLearning.domain.user;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@Slf4j
@RestController("/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody UserSignUpDto userSignUpDto) {
        log.info("회원가입");

        // User 객체 생성 및 값 설정
        User user = new User();
        user.setId(userSignUpDto.getId());
        user.setPassword(userSignUpDto.getPassword());

        // UserService를 사용하여 회원가입 처리
        userService.signup(user);

        return ResponseEntity.ok("회원가입이 완료되었습니다.");
    }


}
