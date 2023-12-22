package com.calc.gtc.domain.usuarios;

import jakarta.validation.constraints.NotEmpty;

public record DatosAunteticacionUsuario(
        @NotEmpty
        String email,
        @NotEmpty
        String clave) {
}
