package com.calc.gtc.controller;

import com.calc.gtc.domain.bancos.Banco;
import com.calc.gtc.domain.bancos.BancoRepository;
import com.calc.gtc.domain.bancos.DatosBanco;
import com.calc.gtc.domain.usuarios.Usuario;
import com.calc.gtc.domain.usuarios.UsuarioRepository;
import com.calc.gtc.infra.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bancos")
public class BancoController {
    @Autowired
    TokenService tokenService;
    @Autowired
    BancoRepository repository;
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity añadirBanco(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorizationHeader, @RequestBody DatosBanco datosBanco){
        Long id = tokenService.getUsuarioId(authorizationHeader);
        Usuario usuario = usuarioRepository.getReferenceById(id);
        Banco banco = new Banco(datosBanco);
        banco.setUsuario(usuario);
        repository.save(banco);
        return ResponseEntity.ok().build();
    }
}
