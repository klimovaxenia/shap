package com.xeniaklimova.shap.controller;

import com.xeniaklimova.shap.service.StuffService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    private final StuffService stuffService;

    public HomeController(StuffService stuffService) {
        this.stuffService = stuffService;
    }


    @GetMapping("/")
    public String home(HttpSession session, Model model) {
        System.out.println("!!!");
        model.addAttribute("name", "Spring Boot + Jinjava");
        model.addAttribute("items", stuffService.getAll());
        return "home";
    }

    @GetMapping("/debug-session")
    @ResponseBody
    public String debug(HttpSession session) {
        return session.getClass().getName();
    }
}
