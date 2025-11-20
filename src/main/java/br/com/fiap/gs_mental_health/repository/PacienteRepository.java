package br.com.fiap.gs_mental_health.repository;

import br.com.fiap.gs_mental_health.domain.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
