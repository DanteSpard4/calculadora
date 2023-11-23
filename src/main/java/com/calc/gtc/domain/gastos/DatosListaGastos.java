package com.calc.gtc.domain.gastos;

import jakarta.validation.constraints.NotEmpty;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DatosListaGastos(Long usuarioID, String categoria, BigDecimal monto, String banco, LocalDate fecha, String descripcion) {

    public DatosListaGastos(Gastos gasto){
        this(gasto.getGastoID(),gasto.getCategoria(),gasto.getMonto(), gasto.getBanco(),gasto.getFecha(), gasto.getDescripcion());
    }

}
