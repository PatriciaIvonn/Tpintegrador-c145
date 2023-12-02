package com.ap.tpintegrado.controller.rest;

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

    // Guarda
    @PostMapping("/rol")
    public Rol guardar(@Validated @RequestBody Map<String, Object> body){
        //        String rol = String.valueOf(body.get("rol"));
        boolean activo = Boolean.valueOf((String)body.get("activo"));

        Rol rol = Rol.builder()
//                .rol(rol)
                .activo(activo)
                .build();

        return rolService.guardar(rol);
    }

    // Actualiza
    @PutMapping("/rol/{id}")
    public Rol actualizar(@Validated @RequestBody Map<String, Object> body, @PathVariable("id") long id){
        Rol rol = new Rol();

        if (rolService.obtenerPorId(id) != null) {
//            String nombre= String.valueOf(body.get("rol"));
            boolean activo = Boolean.valueOf((String) body.get("activo"));

            rol = Rol.builder()
//                .rol(rol)
                .activo(activo)
                .build();
        }

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
