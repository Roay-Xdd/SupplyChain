package com.qtummatrix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/login")
@RestController
public class login {


    @RequestMapping("/findme")
    public String a(){
        System.out.println("也是我");
        return "就是我";
    }
}
