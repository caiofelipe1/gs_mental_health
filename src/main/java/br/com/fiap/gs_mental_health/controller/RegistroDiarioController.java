package br.com.fiap.gs_mental_health.controller;

import br.com.fiap.gs_mental_health.dto.registro.RegistroDiarioRequestDTO;
import br.com.fiap.gs_mental_health.dto.registro.RegistroDiarioResponseDTO;
import br.com.fiap.gs_mental_health.service.RegistroDiarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registros-diarios")
public class RegistroDiarioController {

    private final RegistroDiarioService registroDiarioService;

    public RegistroDiarioController(RegistroDiarioService registroDiarioService) {
        this.registroDiarioService = registroDiarioService;
    }

    @PostMapping
    public ResponseEntity<RegistroDiarioResponseDTO> criar(
            @Valid @RequestBody RegistroDiarioRequestDTO dto) {
        RegistroDiarioResponseDTO criado = registroDiarioService.criar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(criado);
    }

    @GetMapping
    public ResponseEntity<List<RegistroDiarioResponseDTO>> listarTodos() {
        List<RegistroDiarioResponseDTO> registros = registroDiarioService.listarTodos();
        return ResponseEntity.ok(registros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistroDiarioResponseDTO> buscarPorId(@PathVariable Long id) {
        RegistroDiarioResponseDTO registro = registroDiarioService.buscarPorId(id);
        return ResponseEntity.ok(registro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RegistroDiarioResponseDTO> atualizar(
            @PathVariable Long id,
            @Valid @RequestBody RegistroDiarioRequestDTO dto) {
        RegistroDiarioResponseDTO atualizado = registroDiarioService.atualizar(id, dto);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        registroDiarioService.remover(id);
        return ResponseEntity.noContent().build();
    }
}
