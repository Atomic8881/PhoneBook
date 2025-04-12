package com.backend.control;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/get")
    public String get(){
        return "Hello world";
    }
    @GetMapping("/post/{name}")
    public String post(@PathVariable String name) {
        return "Hello " + name;
    }
}
