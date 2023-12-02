package com.ap.tpintegrado.controller.rest;

import com.ap.tpintegrado.entity.Cliente;
import com.ap.tpintegrado.entity.Servicio;
import com.ap.tpintegrado.service.ClienteService;
import com.ap.tpintegrado.service.ServicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
public class ClienteRestController {
    private final ClienteService clienteService;

    private final ServicioService servicioService;

    // Guardar
    @PostMapping("/cliente")
    public Cliente guardar(@Validated @RequestBody Map<String, Object> body){
        String razonSocial = String.valueOf(body.get("razonSocial"));
        String cuit = String.valueOf(body.get("cuit"));
        String mail = String.valueOf(body.get("mail"));
        boolean activo = Boolean.valueOf((String)body.get("activo"));

        //
        Set<Servicio> servicios = new HashSet<>();
        for (Integer idServiccios: (ArrayList<Integer>) body.get("servicio_ids")) {
            Servicio servicio = servicioService.obtenerPorId(Long.valueOf(idServiccios));
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

    // Actualiza
    @PutMapping("/cliente/{id}")
    public Cliente actualizar(@Validated @RequestBody Map<String, Object> body, @PathVariable("id") long id){
        Cliente cliente = new Cliente();

        if (clienteService.obtenerPorId(id) != null) {
            String razonSocial = String.valueOf(body.get("razonSocial"));
            String cuit = String.valueOf(body.get("cuit"));
            String mail = String.valueOf(body.get("mail"));
            boolean activo = Boolean.valueOf((String) body.get("activo"));

            Set<Servicio> servicios = new HashSet<>();
            for (Integer idServicios: (ArrayList<Integer>) body.get("servicio_ids")) {
                Servicio servicio = servicioService.obtenerPorId(Long.valueOf(idServicios));
                servicios.add(servicio);
            }

            cliente = Cliente.builder()
                    .razonSocial(razonSocial)
                    .cuit(cuit)
                    .mail(mail)
                    .activo(activo)
                    .servicios(servicios)
                    .build();
        }

        return clienteService.actualizar(cliente, id);
    }

    // Listado
    @GetMapping("/clientes")
    public List<Cliente> fetchClienteList(){
        return clienteService.obtenerTodos();
    }

    // Eliminar
    @DeleteMapping("/cliente/{id}")
    public String eliminar(@PathVariable("id") long id) {
        clienteService.eliminar(id);
        return "Eliminado correctamente";
    }
}
