package com.calc.gtc.domain.bancos;

import com.calc.gtc.domain.gastos.Gastos;
import com.calc.gtc.domain.usuarios.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

@Table(name = "bancos")
@Entity(name = "Banco")
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "banco")
    private List<Gastos> gastos;

    public Banco(DatosBanco datosBanco) {
        this.nombre = datosBanco.nombre();
    }
}
