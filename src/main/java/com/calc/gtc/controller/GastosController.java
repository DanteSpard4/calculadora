package com.calc.gtc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gastos")
public class GastosController {
    @CrossOrigin(origins = "http://127.0.0.1:5501")
    @PostMapping
    public ResponseEntity helloWorld() {
        System.out.println("prueba");
        return ResponseEntity.ok().build();
    }

}
