package com.example.accounts.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {


    @GetMapping("/sayHello")
    public String hellowWorld(){

        return "Hey world";


    }

}
