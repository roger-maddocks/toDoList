package com.github.maddocks.roger.todolist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String readOut () {
        return "helloShane! I'm learning";
    }
}
