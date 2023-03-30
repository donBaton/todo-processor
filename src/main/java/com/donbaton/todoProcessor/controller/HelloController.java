package com.donbaton.todoProcessor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/get")
    public String index() {
        return "Hello world!";
    }

    @PostMapping("/addTodo")
    public String addTodo() {
        return "result";
    }
}
