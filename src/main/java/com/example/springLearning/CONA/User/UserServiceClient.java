package com.example.springLearning.CONA.User;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Slf4j
public class UserServiceClient implements CommandLineRunner {

    private final UserService userService;

    @Autowired
    public UserServiceClient(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserServiceClient.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // 사용자 등록 예시
        log.info("JPA get USER 기능 처리");
        System.out.println("JPA get USER 기능 처리");
        User user = new User();
        user.setPassword("pw 201912344");
        user.setName("최동훈");
        user.setRole("스마트ICT융합공학과 재학생");

        User registeredUser = userService.registerUser(user);
        System.out.println("Registered User: " + registeredUser.getName());

        // 사용자 검색 예시
        Long userIdToSearch = user.getId(); // 검색할 사용자의 ID
        User foundUser = userService.getUserById(userIdToSearch);
        log.info("사용자 이름 검색");

        if (foundUser != null) {
            System.out.println("검색된 사용자이름: " + foundUser.getName() );
            System.out.println("검색된 사용자비번: " + foundUser.getPassword() );
            System.out.println("검색된 사용자 역할: " + foundUser.getRole() );
        } else {
            System.out.println("User not found.");
        }
    }
}
