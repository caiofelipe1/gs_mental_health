package br.com.fiap.gs_mental_health.dto.registro;

import java.time.LocalDate;

public class RegistroDiarioResponseDTO {

    private Long id;
    private LocalDate dataRegistro;
    private Integer nivelHumor;
    private Integer nivelAnsiedade;
    private Double horasSono;
    private String observacoes;
    private Long pacienteId;
    private String nomePaciente;

    public RegistroDiarioResponseDTO() {
    }

    public RegistroDiarioResponseDTO(Long id, LocalDate dataRegistro, Integer nivelHumor,
                                     Integer nivelAnsiedade, Double horasSono,
                                     String observacoes, Long pacienteId, String nomePaciente) {
        this.id = id;
        this.dataRegistro = dataRegistro;
        this.nivelHumor = nivelHumor;
        this.nivelAnsiedade = nivelAnsiedade;
        this.horasSono = horasSono;
        this.observacoes = observacoes;
        this.pacienteId = pacienteId;
        this.nomePaciente = nomePaciente;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public Integer getNivelHumor() {
        return nivelHumor;
    }

    public Integer getNivelAnsiedade() {
        return nivelAnsiedade;
    }

    public Double getHorasSono() {
        return horasSono;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }
}
