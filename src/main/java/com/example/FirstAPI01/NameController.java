package com.example.FirstAPI01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    private String name;

    @GetMapping("/name")
    public String getName(){
        this.name = "Alessandro Serra";
        return name;
    }

    @PostMapping("/name")
    public String postName(){
        StringBuilder str = new StringBuilder("Alessandro Serra");
        StringBuilder reverseName = str.reverse();
        return reverseName.toString();
    }
}
