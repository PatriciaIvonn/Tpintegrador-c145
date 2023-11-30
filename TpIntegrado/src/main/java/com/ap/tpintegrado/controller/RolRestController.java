package com.ap.tpintegrado.controller;

import com.ap.tpintegrado.entity.Rol;
import com.ap.tpintegrado.service.RolService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class RolRestController {
    private final RolService rolService;

//    private final ServicioService servicioService;

    // Guardar
    @PostMapping("/rol")
    public Rol guardar(@Validated @RequestBody Map<String, Object> body){
        Rol rol = new Rol();
//        String razonSocial = String.valueOf(body.get("razonSocial"));
//        String cuit = String.valueOf(body.get("cuit"));
//        String mail = String.valueOf(body.get("mail"));
//        boolean activo = Boolean.valueOf((String)body.get("activo"));
//
//        //
//        Set<Servicio> servicios = new HashSet<>();
//        for (Integer idServiccios: (ArrayList<Integer>) body.get("servicio_ids")) {
//            Servicio servicio = servicioService.obtenerPorId(Long.valueOf(idServiccios));
//            servicios.add(servicio);
//        }
//

//        Rol rol = rol.builder()
//                .razonSocial(razonSocial)
//                .cuit(cuit)
//                .mail(mail)
//                .activo(activo)
//                .servicios(servicios)
//                .build();

        return rolService.guardar(rol);
    }

    // Actualiza
    @PutMapping("/rol/{id}")
    public Rol actualizar(@Validated @RequestBody Map<String, Object> body, @PathVariable("id") long id){
        Rol rol = new Rol();
        //if (clienteService.obtenerPorId(id) != null) {
//            String razonSocial = String.valueOf(body.get("razonSocial"));
//            String cuit = String.valueOf(body.get("cuit"));
//            String mail = String.valueOf(body.get("mail"));
//            boolean activo = Boolean.valueOf((String) body.get("activo"));
//
//            //
//            Set<Servicio> servicios = new HashSet<>();
//            for (Integer idServicios: (ArrayList<Integer>) body.get("servicio_ids")) {
//                Servicio servicio = servicioService.obtenerPorId(Long.valueOf(idServicios));
//                servicios.add(servicio);
//            }
//
//            Cliente cliente = Cliente.builder()
//                    .razonSocial(razonSocial)
//                    .cuit(cuit)
//                    .mail(mail)
//                    .activo(activo)
//                    .servicios(servicios)
//                    .build();
//        //}

        return rolService.actualizar(rol, id);
    }

    // Listado
    @GetMapping("/roles")
    public List<Rol> fetchClienteList(){
        return rolService.obtenerTodos();
    }

    // Eliminar
    @DeleteMapping("/rol/{id}")
    public String eliminar(@PathVariable("id") long id) {
        rolService.eliminar(id);
        return "Eliminado correctamente";
    }
}
