package com.yarisingu.pgman.maincontrollers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    

   @GetMapping("/users")
    public String users()
    {
        return "user's mapped";
    }

    @GetMapping("/contactus")
    public String contactus()
    {
        return "contactus";
    }

    @GetMapping("/room")
    public String room()
    {
        return "room's avaliable";
    }

}
