package com.ap.tpintegrado.controller;

import com.ap.tpintegrado.service.RolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class RolController {
    private final RolService rolService;

    @GetMapping("/listadoRoles")
    public String viewBooks(Model model) {
        model.addAttribute("roles", rolService.obtenerTodos());
        return "listadoRoles";
    }
}
