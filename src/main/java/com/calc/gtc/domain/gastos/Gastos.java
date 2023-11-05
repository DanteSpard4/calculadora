package com.calc.gtc.domain.gastos;

import com.calc.gtc.domain.usuarios.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "Gastos")
@Entity(name = "Gasto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Gastos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GastoID")
    private Long gastoID;

    @Column(name = "UsuarioID", nullable = false)
    private Long usuarioid;

    @Column(name = "Categoria")
    private String categoria;

    @Column(name = "Monto")
    private BigDecimal monto;

    @Column(name = "Banco")
    private String banco;

    @Column(name = "Fecha")
    private LocalDate fecha;

    @Column(name = "Descripcion")
    private String descripcion;

}
