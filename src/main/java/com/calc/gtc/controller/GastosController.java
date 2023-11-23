package com.calc.gtc.controller;

import com.calc.gtc.domain.gastos.DatosGastos;
import com.calc.gtc.domain.gastos.DatosListaGastos;
import com.calc.gtc.domain.gastos.Gastos;
import com.calc.gtc.domain.gastos.GastosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gastos")
public class GastosController {
    @Autowired
    GastosRepository repository;
    @PostMapping
    public ResponseEntity registrarGastos(@RequestBody @Valid DatosGastos datosGastos){
        repository.save(new Gastos(datosGastos));
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<Page<DatosListaGastos>> obtenerGastos(@RequestBody @Valid Long id){
        return ResponseEntity.ok(repository.)
    }

}
