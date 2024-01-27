package com.calc.gtc.domain.bancos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BancoRepository extends JpaRepository<Banco,Long> {
    List<Banco> findByusuario_id(Long usuario_id);
}
