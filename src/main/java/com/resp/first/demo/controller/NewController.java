package com.resp.first.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {

    @GetMapping("/{name}.html")
    public String page(@PathVariable final String name, final Model model) {
        model.addAttribute("pageName", name);
        return "page";
    }

    @RequestMapping("/")
    public String index() {

        return "index";

    }

}