package br.com.fiap.gs_mental_health.dto.paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PacienteResponseDTO {

    private Long id;
    private String nome;
    private String email;
    private LocalDate dataNascimento;
    private String telefone;
    private String profissao;
    private LocalDateTime createdAt;

    public PacienteResponseDTO() {
    }

    public PacienteResponseDTO(Long id, String nome, String email, LocalDate dataNascimento,
                               String telefone, String profissao, LocalDateTime createdAt) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.profissao = profissao;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
