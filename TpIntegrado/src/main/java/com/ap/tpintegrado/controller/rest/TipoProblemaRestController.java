package com.ap.tpintegrado.controller.rest;

import com.ap.tpintegrado.entity.TipoProblema;
import com.ap.tpintegrado.service.TipoProblemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RestController
@RequiredArgsConstructor
public class TipoProblemaRestController {
    private final TipoProblemaService tipoProblemaService;

//    private final ServicioService servicioService;

    // Guardar
    @PostMapping("/tipoProblema")
    public TipoProblema guardar(@Validated @RequestBody Map<String, Object> body){

        TipoProblema tipoProblema = new TipoProblema();
//        String razonSocial = String.valueOf(body.get("razonSocial"));
//        String cuit = String.valueOf(body.get("cuit"));
//        String mail = String.valueOf(body.get("mail"));
//        boolean activo = Boolean.valueOf((String)body.get("activo"));

        //
//        Set<Servicio> servicios = new HashSet<>();
//        for (Integer idServiccios: (ArrayList<Integer>) body.get("servicio_ids")) {
//            Servicio servicio = servicioService.obtenerPorId(Long.valueOf(idServiccios));
//            servicios.add(servicio);
//        }

//        TipoProblema cliente = Cliente.builder()
//                .razonSocial(razonSocial)
//                .cuit(cuit)
//                .mail(mail)
//                .activo(activo)
//                .servicios(servicios)
//                .build();

        return tipoProblemaService.guardar(tipoProblema);
    }

    // Actualiza
    @PutMapping("/tipoProblema/{id}")
    public TipoProblema actualizar(@Validated @RequestBody Map<String, Object> body, @PathVariable("id") long id){
        TipoProblema tipoProblema = new TipoProblema();

        if (tipoProblemaService.obtenerPorId(id) != null) {
//            String razonSocial = String.valueOf(body.get("razonSocial"));
//            String cuit = String.valueOf(body.get("cuit"));
//            String mail = String.valueOf(body.get("mail"));
//            boolean activo = Boolean.valueOf((String) body.get("activo"));

            //
//            Set<Servicio> servicios = new HashSet<>();
//            for (Integer idServicios: (ArrayList<Integer>) body.get("servicio_ids")) {
//                Servicio servicio = servicioService.obtenerPorId(Long.valueOf(idServicios));
//                servicios.add(servicio);
//            }

//            tipoProblema = TipoProblema.builder()
////                    .razonSocial(razonSocial)
////                    .cuit(cuit)
////                    .mail(mail)
////                    .activo(activo)
////                    .servicios(servicios)
//                    .build();
        }

        return tipoProblemaService.actualizar(tipoProblema, id);
    }

    // Listado
    @GetMapping("/tipoProblema")
    public List<TipoProblema> fetchClienteList(){
        return tipoProblemaService.obtenerTodos();
    }

    // Eliminar
    @DeleteMapping("/tipoProblema/{id}")
    public String eliminar(@PathVariable("id") long id) {
        tipoProblemaService.eliminar(id);
        return "Eliminado correctamente";
    }
}
