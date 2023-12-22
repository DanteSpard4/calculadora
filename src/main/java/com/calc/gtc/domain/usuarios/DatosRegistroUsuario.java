package com.calc.gtc.domain.usuarios;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record DatosRegistroUsuario(
        @NotEmpty
        String login,
        @NotEmpty
        String clave,
        @NotEmpty
        @Email
        String email) {}
