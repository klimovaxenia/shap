package com.xeniaklimova.shap.controller;

import com.xeniaklimova.shap.service.StuffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final StuffService stuffService;

    public HomeController(StuffService stuffService) {
        this.stuffService = stuffService;
    }


    @GetMapping("/")
    public String home(Model model) {
        System.out.println("!!!");
        model.addAttribute("name", "Spring Boot + Jinjava");
        model.addAttribute("items", stuffService.getAll());
        return "home";
    }
}
