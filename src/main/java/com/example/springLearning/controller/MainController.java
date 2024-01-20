package com.example.springLearning.controller;

import com.example.springLearning.donghun;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainController {
    @GetMapping("/")
    @Operation
    public String main() {

        return "main Controller";
    }


    @GetMapping("/test")
    @Operation
    public donghun test() {

        donghun choi = donghun.builder()
                .nameon("최동훈")
                .build();

        return choi;
    }


}
