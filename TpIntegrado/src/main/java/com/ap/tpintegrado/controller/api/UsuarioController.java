package com.ap.tpintegrado.controller.api;

import com.ap.tpintegrado.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @GetMapping("/listadoUsuarios")
    public String viewBooks(Model model) {
        model.addAttribute("usuarios", usuarioService.obtenerTodos());
        return "listadoUsuarios";
    }
}
