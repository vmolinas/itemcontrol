package app.itemcontrol.ItemControl.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(){
        return "Login from publi endpoint";
    }

    @PostMapping("/register")
    public String register(){
        return "Register from public endpoint";
    }
}