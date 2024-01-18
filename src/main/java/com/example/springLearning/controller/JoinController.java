package com.example.springLearning.controller;

import com.example.springLearning.dto.JoinDTO;
import com.example.springLearning.service.JoinService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.constraints.Size.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequiredArgsConstructor
@Slf4j
public class JoinController {
    private final JoinService joinService;

    @PostMapping("/join")
    @Operation
    public String joinProcess(JoinDTO joinDTO) {
        joinService.joinProcess(joinDTO);
        log.info("컨트롤러 실행");
        return "ok";
    }
}
