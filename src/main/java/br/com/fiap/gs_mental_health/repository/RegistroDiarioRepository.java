package br.com.fiap.gs_mental_health.repository;

import br.com.fiap.gs_mental_health.domain.entity.RegistroDiario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroDiarioRepository extends JpaRepository<RegistroDiario, Long> {
}
