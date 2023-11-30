package com.ap.tpintegrado.controller;

import com.ap.tpintegrado.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TipoProblemaController {
    private final ClienteService clienteService;

    @GetMapping("/listadoTiposProblemas")
    public String viewBooks(Model model) {
        model.addAttribute("tiposProblemas", clienteService.obtenerTodos());
        return "listadoTiposProblemas";
    }
}
