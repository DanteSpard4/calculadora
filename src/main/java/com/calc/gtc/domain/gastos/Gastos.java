package com.calc.gtc.domain.gastos;

import com.calc.gtc.domain.bancos.Banco;
import com.calc.gtc.domain.usuarios.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "gastos")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "gastoID")
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

    @Column(name = "Fecha")
    private LocalDate fecha;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "tipo")
    private Boolean tipo;

    @Column(name = "razon")
    private String razon;

    @ManyToOne
    @JoinColumn(name = "banco_id")
    private Banco banco;

    public Gastos(Long id,DatosGastos datosGastos) {
        this.usuarioid=id;
        this.categoria=datosGastos.categoria();
        this.monto=datosGastos.monto();
        this.banco=datosGastos.banco();
        this.fecha=datosGastos.fecha();
        this.descripcion=datosGastos.descripcion();
        this.tipo=datosGastos.tipo();
        this.razon=datosGastos.razon();
    }
}
