package com.calc.gtc.domain.gastos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastosRepository extends JpaRepository<Gastos,Long>{
    Page<Gastos> findByusuarioid(Long UsuarioId, Pageable paginacion);
}
