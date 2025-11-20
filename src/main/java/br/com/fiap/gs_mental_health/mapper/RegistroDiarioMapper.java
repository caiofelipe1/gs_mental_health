package br.com.fiap.gs_mental_health.mapper;

import br.com.fiap.gs_mental_health.domain.entity.Paciente;
import br.com.fiap.gs_mental_health.domain.entity.RegistroDiario;
import br.com.fiap.gs_mental_health.dto.registro.RegistroDiarioRequestDTO;
import br.com.fiap.gs_mental_health.dto.registro.RegistroDiarioResponseDTO;

public class RegistroDiarioMapper {

    private RegistroDiarioMapper() {
    }

    public static RegistroDiario toEntity(RegistroDiarioRequestDTO dto, Paciente paciente) {
        RegistroDiario registro = new RegistroDiario();
        registro.setDataRegistro(dto.getDataRegistro());
        registro.setNivelHumor(dto.getNivelHumor());
        registro.setNivelAnsiedade(dto.getNivelAnsiedade());
        registro.setHorasSono(dto.getHorasSono());
        registro.setObservacoes(dto.getObservacoes());
        registro.setPaciente(paciente);
        return registro;
    }

    public static void updateEntity(RegistroDiario registro, RegistroDiarioRequestDTO dto, Paciente paciente) {
        registro.setDataRegistro(dto.getDataRegistro());
        registro.setNivelHumor(dto.getNivelHumor());
        registro.setNivelAnsiedade(dto.getNivelAnsiedade());
        registro.setHorasSono(dto.getHorasSono());
        registro.setObservacoes(dto.getObservacoes());
        registro.setPaciente(paciente);
    }

    public static RegistroDiarioResponseDTO toResponse(RegistroDiario entity) {
        return new RegistroDiarioResponseDTO(
                entity.getId(),
                entity.getDataRegistro(),
                entity.getNivelHumor(),
                entity.getNivelAnsiedade(),
                entity.getHorasSono(),
                entity.getObservacoes(),
                entity.getPaciente().getId(),
                entity.getPaciente().getNome()
        );
    }
}
