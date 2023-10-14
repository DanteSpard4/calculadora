package com.calc.gtc.controller;

import com.calc.gtc.domain.usuarios.DatosRegistroUsuario;
import com.calc.gtc.domain.usuarios.Usuario;
import com.calc.gtc.domain.usuarios.UsuarioRepository;
import com.calc.gtc.infra.security.EncryptService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singup")
public class RegistroController {

    @Autowired
    EncryptService encryptService;
    @Autowired
    UsuarioRepository repository;

    @PostMapping
    public ResponseEntity registrarUsuario(@RequestBody @Valid DatosRegistroUsuario datosRegistroUsuario){
        var passwordEncrypt = encryptService.cifrarContraseña(datosRegistroUsuario.clave());
        repository.save(new Usuario(datosRegistroUsuario.login(),passwordEncrypt));
        return ResponseEntity.ok().build();
    }
}
