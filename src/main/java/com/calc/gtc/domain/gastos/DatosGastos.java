package com.calc.gtc.domain.gastos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DatosGastos(
        @NotEmpty
        String categoria,
        @NotNull
        BigDecimal monto,
        @NotEmpty
        String banco,
        @NotNull
        LocalDate fecha,
        @NotEmpty
        String descripcion,
        @NotNull
        Boolean tipo,
        @NotEmpty
        String razon) {
}
