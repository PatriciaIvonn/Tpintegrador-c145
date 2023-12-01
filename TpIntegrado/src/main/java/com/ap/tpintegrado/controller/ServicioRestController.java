package com.ap.tpintegrado.controller;

import com.ap.tpintegrado.entity.Servicio;
import com.ap.tpintegrado.service.ServicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ServicioRestController {
    private final ServicioService servicioService;

    // Guardar
    @PostMapping("/servicio")
    public Servicio guardar(@Validated @RequestBody Map<String, Object> body){
        String nombre = String.valueOf(body.get("nombre"));

        Servicio servicio = Servicio.builder()
                .nombre(nombre)
                //.activo(activo)
                .build();

        return servicioService.guardar(servicio);
    }

    // Listado
    @GetMapping("/servicios")
    public List<Servicio> fetchClienteList(){
        return servicioService.obtenerTodos();
    }

    @PutMapping("/servicio/{id}")
    public Servicio actualizar(@Validated @RequestBody Map<String, Object> body, @PathVariable("id") long id){
        String nombre = String.valueOf(body.get("nombre"));

        Servicio servicio = Servicio.builder()
                .nombre(nombre)
                //.activo(activo)
                .build();

        return servicioService.actualizar(servicio, id);
    }

    // Eliminar
    @DeleteMapping("/servicio/{id}")
    public String eliminar(@PathVariable("id") long id){
        servicioService.eliminar(id);
        return "Eliminado correctamente";
    }
}
