package com.calc.gtc.domain.bancos;

public record DatosListaBancos(Long bancoID,String nombreBanco) {
    public DatosListaBancos(Banco banco){
        this(banco.getId(), banco.getNombre());
    }
}
