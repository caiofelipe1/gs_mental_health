package br.com.fiap.gs_mental_health.exception;

public class PacienteNotFoundException extends RuntimeException {

    public PacienteNotFoundException(Long id) {
        super("Paciente não encontrado com id " + id);
    }
}
