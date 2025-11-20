package br.com.fiap.gs_mental_health.exception;

public class RegistroDiarioNotFoundException extends RuntimeException {

    public RegistroDiarioNotFoundException(Long id) {
        super("Registro diário não encontrado com id " + id);
    }
}
