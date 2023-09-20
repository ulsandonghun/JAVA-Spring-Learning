package com.example.springLearning.domain.user;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody UserDto userDto) {
        log.info("회원가입");

        // User 객체 생성 및 값 설정
        User user = new User();
        user.setPassword(user.getPassword());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());

        // UserService를 사용하여 회원가입 처리
        userService.signup(user);

        return new ResponseEntity<>(userDto, HttpStatusCode.valueOf(200));

    }


}
