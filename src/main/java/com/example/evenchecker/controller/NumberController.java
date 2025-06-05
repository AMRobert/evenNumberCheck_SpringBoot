package com.example.evenchecker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NumberController {

    @GetMapping("/")
    public String show() {
        return "input";
    }

    @PostMapping("/check")
    public String checkNumber(@RequestParam("number") int number, Model model) {
        boolean isEven = number % 2 == 0;
        model.addAttribute("number", number);
        model.addAttribute("result", isEven ? "Even Number" : "Odd Number");
        return "result";
    }
}
