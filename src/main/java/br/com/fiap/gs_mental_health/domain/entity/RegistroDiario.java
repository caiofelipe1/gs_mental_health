package br.com.fiap.gs_mental_health.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.time.LocalDate;

@Entity
@Table(name = "registros_diarios")
public class RegistroDiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_registro", nullable = false)
    private LocalDate dataRegistro;

    @Column(name = "nivel_humor", nullable = false)
    private Integer nivelHumor;

    @Column(name = "nivel_ansiedade", nullable = false)
    private Integer nivelAnsiedade;

    @Column(name = "horas_sono", nullable = false)
    private Double horasSono;

    @Column(length = 500)
    private String observacoes;

    @ManyToOne(optional = false)
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    public RegistroDiario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
