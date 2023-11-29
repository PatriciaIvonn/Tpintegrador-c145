package com.ap.tpintegrado.controller;

import com.ap.tpintegrado.entity.Cliente;
import com.ap.tpintegrado.entity.Servicio;
import com.ap.tpintegrado.service.ClienteService;
import com.ap.tpintegrado.service.ServicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequiredArgsConstructor
public class ClienteRestController {

    private final ClienteService clienteService;

    private final ServicioService servicioService;

    // Guardar o agregar
    @PostMapping("/cliente")
    public Cliente guardar(@Validated @RequestBody Map<String, Object> body){
        // Lectura de datos
        // Razon Social
        String razonSocial = String.valueOf(body.get("razonSocial"));
        String cuit = String.valueOf(body.get("cuit"));
        String mail = String.valueOf(body.get("mail"));
        boolean activo = Boolean.valueOf((String)body.get("activo"));

        //
        Set<Servicio> servicios = new HashSet<>();
        for (Integer id: (ArrayList<Integer>) body.get("servicio_ids")) {
            Servicio servicio = servicioService.obtenerPorId(Long.valueOf(id));
            servicios.add(servicio);
        }

        Cliente cliente = Cliente.builder()
                .razonSocial(razonSocial)
                .cuit(cuit)
                .mail(mail)
                .activo(activo)
                .servicios(servicios)
                .build();

        return clienteService.guardar(cliente);
    }

    // Listado de clientes
    @GetMapping("/clientes")
    public List<Cliente> fetchClienteList(){
        return clienteService.obtenerTodos();
    }
}
