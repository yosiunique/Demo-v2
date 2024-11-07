package com.example.Card_Order_testing.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Card_Order_testing.Entity.Account;
import com.example.Card_Order_testing.Service.AppService;

@Controller
public class App {
    
    private final AppService appService;
    public App(AppService appService){
        this.appService=appService;
    }

    @GetMapping("/")
    public String home(){
        return "login";

    }

    @PostMapping("/post")
public String save(@ModelAttribute("login") Account account){

    appService.save(account);

    return "done";
}

}
