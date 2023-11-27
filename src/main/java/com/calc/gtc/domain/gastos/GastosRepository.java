package com.calc.gtc.domain.gastos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastosRepository extends JpaRepository<Gastos,Long>{
}
