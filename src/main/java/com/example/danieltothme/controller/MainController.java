package com.example.danieltothme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/walletx")
    public String project() {
        return "projectpages/walletx";
    }
}
