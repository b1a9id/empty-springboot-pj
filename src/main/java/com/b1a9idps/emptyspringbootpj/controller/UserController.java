package com.b1a9idps.emptyspringbootpj.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.emptyspringbootpj.response.UserResponse;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<UserResponse> list() {
        return List.of(new UserResponse(1, "Ryosuke"));
    }
}
