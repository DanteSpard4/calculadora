package com.calc.gtc.domain.gastos;

import jakarta.validation.constraints.NotEmpty;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DatosListaGastos(Long gastoID, String categoria, BigDecimal monto, String banco, LocalDate fecha, String descripcion,String razon,Boolean tipo) {

    public DatosListaGastos(Gastos gasto){
        this(gasto.getGastoID(),gasto.getCategoria(),gasto.getMonto(), gasto.getBanco(),gasto.getFecha(), gasto.getDescripcion(),gasto.getRazon(),gasto.getTipo());
    }

}
