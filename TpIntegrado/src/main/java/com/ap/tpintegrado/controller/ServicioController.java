package com.ap.tpintegrado.controller;

import com.ap.tpintegrado.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ServicioController {
    // @Autowired
    // private ClienteService clienteService;
    private final ClienteService clienteService;

    @GetMapping("/viewClientes")
    public String viewBooks(Model model) {
        model.addAttribute("clientes", clienteService.obtenerTodos());
        return "view-clientes";
    }

    @GetMapping({"/greeting/", "/greeting/{nombre}"})
    public String greeting(@RequestParam(name="name", required=false, defaultValue=" Mundo ") String name, Model model,
                           @PathVariable(required = false) String nombre ) {
        model.addAttribute("name", name);
        if (nombre != null) {
            model.addAttribute("nombre", nombre);
        }
        return "saludo";
    }
}
