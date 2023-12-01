package com.ap.tpintegrado.controller;

import com.ap.tpintegrado.entity.Especialidad;
import com.ap.tpintegrado.service.EspecialidadServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class EspecialidadController {
    @Autowired
    EspecialidadServiceImpl espeService;

    @GetMapping("/listadoEspecialidades")
    public ResponseEntity<?> listarEspecialidad(){
    return new ResponseEntity<>(espeService.listarEspecialidad(), HttpStatus.OK);
    }
    @PostMapping("/especialidad")
    public ResponseEntity<?> crearEspe(@RequestBody Especialidad espe){
        return new ResponseEntity<>(espeService.crearEspecialidad(espe), HttpStatus.OK);

    }
    @GetMapping("/especialidad/{idEspe}")
    public ResponseEntity<?>buscarEspe(@PathVariable Long idEspe){
    return new ResponseEntity<>(espeService.buscarEspecialidad(idEspe), HttpStatus.OK);
    }
    @DeleteMapping("/especialidad/{idEspe}")
    public ResponseEntity<?> borrarEspecialidad(@PathVariable Long idEspe){
        return new ResponseEntity<>(espeService.eliminarEspe(idEspe), HttpStatus.OK);
    }
}



