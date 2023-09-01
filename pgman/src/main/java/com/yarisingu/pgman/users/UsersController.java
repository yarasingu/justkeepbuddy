package com.yarisingu.pgman.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
    
}
