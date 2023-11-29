package com.ap.tpintegrado.controller;

import com.ap.tpintegrado.entity.Servicio;
import com.ap.tpintegrado.service.ServicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ServicioRestController {

    private final ServicioService servicioService;

    // Guardar o agregar
    @PostMapping("/servicio")
    public Servicio guardar(@Validated @RequestBody Map<String, Object> body){
        // Lectura de datos
        // Nombre
        String nombre = String.valueOf(body.get("nombre"));

        Servicio servicio = Servicio.builder()
                .nombre(nombre)
                .build();

        return servicioService.guardar(servicio);
    }

    // Listado de clientes
    @GetMapping("/servicios")
    public List<Servicio> fetchClienteList(){
        return servicioService.obtenerTodos();
    }
}
