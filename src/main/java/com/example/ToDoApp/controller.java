package com.example.ToDoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@GetMapping("/")
    public String get(){
        return "To-do Application !";
    }
}
