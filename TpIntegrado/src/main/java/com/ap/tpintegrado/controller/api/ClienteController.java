package com.ap.tpintegrado.controller.api;

import com.ap.tpintegrado.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ClienteController {
    private final ClienteService clienteService;

    @GetMapping("/listadoClientes")
    public String viewBooks(Model model) {
        model.addAttribute("clientes", clienteService.obtenerTodos());
        return "listadoClientes";
    }
}
