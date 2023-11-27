package com.calc.gtc.domain.gastos;

import jakarta.validation.constraints.NotEmpty;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DatosGastos(
        @NotEmpty
        Long usuarioID,
        @NotEmpty
        String categoria,
        @NotEmpty
        BigDecimal monto,
        @NotEmpty
        String banco,
        @NotEmpty
        LocalDate fecha,
        @NotEmpty
        String descripcion) {
}
