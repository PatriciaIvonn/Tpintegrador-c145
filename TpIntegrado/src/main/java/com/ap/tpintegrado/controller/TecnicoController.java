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
    TecnicoServiceImpl tecService;
    @GetMapping("/tecnicos")
    public ResponseEntity<?>obtenerTecnicos(){
        return new ResponseEntity<>(tecService.traerTecnicos(), HttpStatus.OK);
    }
    @PostMapping("/tecnico")
    public ResponseEntity<?>crearTecnico(@RequestBody Tecnico tecnico){
        return new ResponseEntity<>(tecService.crearTecnico(tecnico), HttpStatus.OK);
    }
    @GetMapping("/unTecnico/{idTecnico}")
    public ResponseEntity<?> traerUntecnico(@PathVariable Long idTecnico){
        return new ResponseEntity<>(tecService.buscarTecnico(idTecnico), HttpStatus.OK);
    }
    @DeleteMapping("/eliminarTecnico/{idTecnico}")
    public ResponseEntity<?> eliminarTecnico(@PathVariable Long idTecnico){
        return new ResponseEntity<>(tecService.eliminarTecnico(idTecnico), HttpStatus.OK);
    }

}
