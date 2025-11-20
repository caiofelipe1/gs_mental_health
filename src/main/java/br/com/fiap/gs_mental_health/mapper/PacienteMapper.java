package br.com.fiap.gs_mental_health.mapper;

import br.com.fiap.gs_mental_health.domain.entity.Paciente;
import br.com.fiap.gs_mental_health.dto.paciente.PacienteRequestDTO;
import br.com.fiap.gs_mental_health.dto.paciente.PacienteResponseDTO;
import java.time.LocalDateTime;

public class PacienteMapper {

    private PacienteMapper() {
    }

    public static Paciente toEntity(PacienteRequestDTO dto) {
        Paciente paciente = new Paciente();
        paciente.setNome(dto.getNome());
        paciente.setEmail(dto.getEmail());
        paciente.setDataNascimento(dto.getDataNascimento());
        paciente.setTelefone(dto.getTelefone());
        paciente.setProfissao(dto.getProfissao());
        paciente.setCreatedAt(LocalDateTime.now());
        return paciente;
    }

    public static void updateEntity(Paciente paciente, PacienteRequestDTO dto) {
        paciente.setNome(dto.getNome());
        paciente.setEmail(dto.getEmail());
        paciente.setDataNascimento(dto.getDataNascimento());
        paciente.setTelefone(dto.getTelefone());
        paciente.setProfissao(dto.getProfissao());
    }

    public static PacienteResponseDTO toResponse(Paciente entity) {
        return new PacienteResponseDTO(
                entity.getId(),
                entity.getNome(),
                entity.getEmail(),
                entity.getDataNascimento(),
                entity.getTelefone(),
                entity.getProfissao(),
                entity.getCreatedAt()
        );
    }
}
