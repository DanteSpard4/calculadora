package com.calc.gtc.domain.registros;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "registros")
@Entity(name = "Registro")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
