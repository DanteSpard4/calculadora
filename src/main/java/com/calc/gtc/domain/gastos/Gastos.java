package com.calc.gtc.domain.gastos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Gastos")
@Entity(name = "Gasto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Gastos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
