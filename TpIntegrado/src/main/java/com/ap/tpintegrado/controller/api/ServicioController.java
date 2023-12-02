package com.ap.tpintegrado.controller.api;

import com.ap.tpintegrado.service.ServicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ServicioController {
    private final ServicioService servicioService;

    @GetMapping("/listadoServicios")
    public String viewBooks(Model model) {
        model.addAttribute("servicios", servicioService.obtenerTodos());
        return "listadoServicios";
    }
}
