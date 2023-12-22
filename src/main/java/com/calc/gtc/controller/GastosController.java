package com.calc.gtc.controller;

import com.calc.gtc.domain.gastos.DatosGastos;
import com.calc.gtc.domain.gastos.DatosListaGastos;
import com.calc.gtc.domain.gastos.Gastos;
import com.calc.gtc.domain.gastos.GastosRepository;
import com.calc.gtc.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gastos")
public class GastosController {
    @Autowired
    TokenService tokenService;
    @Autowired
    GastosRepository repository;
    @PostMapping
    public ResponseEntity registrarGastos(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorizationHeader,@RequestBody @Valid DatosGastos datosGastos){
        Long id = tokenService.getUsuarioId(authorizationHeader);
        repository.save(new Gastos(id,datosGastos));
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<Page<DatosListaGastos>> obtenerGastos(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorizationHeader, @PageableDefault(size = 10) Pageable paginacion){
        Long id = tokenService.getUsuarioId(authorizationHeader);
        return ResponseEntity.ok(repository.findByusuarioid(id,paginacion).map(DatosListaGastos::new));
    }
    @GetMapping("/{banco}")
    public ResponseEntity obtenerGastoPorBanco(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorizationHeader,@PathVariable String banco){
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity eliminarRegistro(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorizationHeader,@PathVariable Long id){
        Gastos gastos = repository.getReferenceById(id);
        repository.delete(gastos);
        return ResponseEntity.noContent().build();
    }
}
