package com.calc.gtc.domain.bancos;

import jakarta.validation.constraints.NotEmpty;

public record DatosBanco(
        @NotEmpty
        String nombre
) {
}
