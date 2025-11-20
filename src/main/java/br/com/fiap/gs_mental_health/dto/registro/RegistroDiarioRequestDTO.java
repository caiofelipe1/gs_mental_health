package br.com.fiap.gs_mental_health.dto.registro;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

public class RegistroDiarioRequestDTO {

    @NotNull(message = "Data de registro é obrigatória")
    private LocalDate dataRegistro;

    @NotNull(message = "Nível de humor é obrigatório")
    @Min(value = 1, message = "Nível de humor deve ser entre 1 e 5")
    @Max(value = 5, message = "Nível de humor deve ser entre 1 e 5")
    private Integer nivelHumor;

    @NotNull(message = "Nível de ansiedade é obrigatório")
    @Min(value = 1, message = "Nível de ansiedade deve ser entre 1 e 5")
    @Max(value = 5, message = "Nível de ansiedade deve ser entre 1 e 5")
    private Integer nivelAnsiedade;

    @NotNull(message = "Horas de sono são obrigatórias")
    @Min(value = 0, message = "Horas de sono não podem ser negativas")
    @Max(value = 24, message = "Horas de sono não podem ser maiores que 24")
    private Double horasSono;

    @Size(max = 500, message = "Observações deve ter no máximo 500 caracteres")
    private String observacoes;

    @NotNull(message = "Id do paciente é obrigatório")
    private Long pacienteId;

    public RegistroDiarioRequestDTO() {
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Integer getNivelHumor() {
        return nivelHumor;
    }

    public void setNivelHumor(Integer nivelHumor) {
        this.nivelHumor = nivelHumor;
    }

    public Integer getNivelAnsiedade() {
        return nivelAnsiedade;
    }

    public void setNivelAnsiedade(Integer nivelAnsiedade) {
        this.nivelAnsiedade = nivelAnsiedade;
    }

    public Double getHorasSono() {
        return horasSono;
    }

    public void setHorasSono(Double horasSono) {
        this.horasSono = horasSono;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }
}
