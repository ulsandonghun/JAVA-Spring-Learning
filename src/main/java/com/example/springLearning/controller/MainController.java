package com.example.springLearning.controller;

import com.example.springLearning.donghun;
import io.swagger.v3.oas.annotations.Operation;
import java.util.Collection;
import java.util.Iterator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
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
        String username= SecurityContextHolder.getContext().getAuthentication()
                .getName();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        Iterator<? extends GrantedAuthority> iterator = authorities.iterator();
        GrantedAuthority auth = iterator.next();
        String role = auth.getAuthority();


        return "현재 접속자명 : "+username + "접속자 역할 : "+role;
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
