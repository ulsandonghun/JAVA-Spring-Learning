package com.example.springLearning.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class AdminController {
    @GetMapping("/admin")
    @Operation
    public String adminP() {

        return "admin Controller";
    }
}
