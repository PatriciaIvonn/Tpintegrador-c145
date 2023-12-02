package com.ap.tpintegrado.controller.rest;

import com.ap.tpintegrado.entity.Usuario;
import com.ap.tpintegrado.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UsuarioRestController {
    private final UsuarioService usuarioService;

//    private final ServicioService servicioService;

    // Guardar
    @PostMapping("/usuario")
    public Usuario guardar(@Validated @RequestBody Map<String, Object> body){
        Usuario usuario = new Usuario();
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

        return usuarioService.guardar(usuario);
    }

    // Actualiza
    @PutMapping("/usuario/{id}")
    public Usuario actualizar(@Validated @RequestBody Map<String, Object> body, @PathVariable("id") long id){
        Usuario usuario = new Usuario();

        if (usuarioService.obtenerPorId(id) != null) {
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
        }

        return usuarioService.actualizar(usuario, id);
    }

    // Listado
    @GetMapping("/usuarios")
    public List<Usuario> fetchClienteList(){
        return usuarioService.obtenerTodos();
    }

    // Eliminar
    @DeleteMapping("/usuario/{id}")
    public String eliminar(@PathVariable("id") long id) {
        usuarioService.eliminar(id);
        return "Eliminado correctamente";
    }
}
