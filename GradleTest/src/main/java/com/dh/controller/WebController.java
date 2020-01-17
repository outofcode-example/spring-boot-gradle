package com.dh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value = "/test")
    public String test1(Model model) {
        model.addAttribute("name", "dh");
        model.addAttribute("nickname","power");
        model.addAttribute("image", "images/test.gif");
        return "test";
    }
}
