package com.calc.gtc.domain.usuarios;

import jakarta.validation.constraints.NotEmpty;

public record DatosRegistroUsuario(
        @NotEmpty
        String login,
        @NotEmpty
        String clave) {
}
