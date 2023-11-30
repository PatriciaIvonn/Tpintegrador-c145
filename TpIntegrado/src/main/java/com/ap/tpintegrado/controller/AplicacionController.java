package com.ap.tpintegrado.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class AplicacionController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue=" Mundo ") String name, Model model) {
        model.addAttribute("name", name);
        return "saludo";
    }
}
