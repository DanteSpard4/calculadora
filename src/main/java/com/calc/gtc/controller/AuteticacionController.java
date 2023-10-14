package com.calc.gtc.controller;

import com.calc.gtc.domain.usuarios.DatosAunteticacionUsuario;
import com.calc.gtc.domain.usuarios.Usuario;
import com.calc.gtc.infra.security.DatosJWTToken;
import com.calc.gtc.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuteticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;
    @PostMapping
    public ResponseEntity autentificarUsuario(@RequestBody @Valid DatosAunteticacionUsuario datosAunteticacionUsuario){
        Authentication authenticationToken =
                new UsernamePasswordAuthenticationToken(datosAunteticacionUsuario.login(),datosAunteticacionUsuario.clave());
        Authentication usuarioAuth = authenticationManager.authenticate(authenticationToken);
        var jwtToken = tokenService.generarToken((Usuario) usuarioAuth.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(jwtToken));
    }
}
