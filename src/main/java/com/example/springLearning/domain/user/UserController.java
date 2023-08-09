package com.example.springLearning.domain.user;


import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor
public class UserController {


    @GetMapping("/user")
    public String getuser(){
        UserDto sample=new UserDto();
        sample.setEmail("df");
        sample.setName("최동훈");
        sample.setPassword("최동");
        return "sample";

    }

}
