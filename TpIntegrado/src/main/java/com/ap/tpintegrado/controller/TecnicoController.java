package com.ap.tpintegrado.controller;

import com.ap.tpintegrado.entity.Tecnico;
import com.ap.tpintegrado.service.TecnicoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class TecnicoController {

    @Autowired
    TecnicoServiceImpl tecnicoService;

    @GetMapping("/listadoTecnicos")
    public ResponseEntity<?>listarTecnicos(){
        return new ResponseEntity<>(tecnicoService.listarTecnico(), HttpStatus.OK);
    }
    @PostMapping("/tecnico")
    public ResponseEntity<?> crearTecnico(@RequestBody Tecnico tecnico){
        return new ResponseEntity<>(tecnicoService.crearTecnico(tecnico),HttpStatus.OK);

    }
    @GetMapping("/tecnico/{idTecnico}")
    public ResponseEntity<?>traerTecnicoId(@PathVariable Long idTecnico){
        return new ResponseEntity<>(tecnicoService.traerUnTecnico(idTecnico), HttpStatus.OK);
    }
    @DeleteMapping("/tecnico/{idTecnico}")
    public ResponseEntity<?>borrarTecnico(@PathVariable Long idTecnico){
        return new ResponseEntity<>(tecnicoService.borrarTecnico(idTecnico),HttpStatus.OK);
    }

}
