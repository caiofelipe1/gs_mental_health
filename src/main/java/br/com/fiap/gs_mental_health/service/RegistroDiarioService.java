package br.com.fiap.gs_mental_health.service;

import br.com.fiap.gs_mental_health.domain.entity.Paciente;
import br.com.fiap.gs_mental_health.domain.entity.RegistroDiario;
import br.com.fiap.gs_mental_health.dto.registro.RegistroDiarioRequestDTO;
import br.com.fiap.gs_mental_health.dto.registro.RegistroDiarioResponseDTO;
import br.com.fiap.gs_mental_health.exception.RegistroDiarioNotFoundException;
import br.com.fiap.gs_mental_health.mapper.RegistroDiarioMapper;
import br.com.fiap.gs_mental_health.repository.RegistroDiarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegistroDiarioService {

    private final RegistroDiarioRepository registroDiarioRepository;
    private final PacienteService pacienteService;

    public RegistroDiarioService(RegistroDiarioRepository registroDiarioRepository,
                                 PacienteService pacienteService) {
        this.registroDiarioRepository = registroDiarioRepository;
        this.pacienteService = pacienteService;
    }

    @Transactional
    public RegistroDiarioResponseDTO criar(RegistroDiarioRequestDTO dto) {
        Paciente paciente = pacienteService.buscarEntityPorId(dto.getPacienteId());
        RegistroDiario registro = RegistroDiarioMapper.toEntity(dto, paciente);
        RegistroDiario salvo = registroDiarioRepository.save(registro);
        return RegistroDiarioMapper.toResponse(salvo);
    }

    @Transactional(readOnly = true)
    public List<RegistroDiarioResponseDTO> listarTodos() {
        return registroDiarioRepository.findAll()
                .stream()
                .map(RegistroDiarioMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public RegistroDiarioResponseDTO buscarPorId(Long id) {
        RegistroDiario registro = registroDiarioRepository.findById(id)
                .orElseThrow(() -> new RegistroDiarioNotFoundException(id));
        return RegistroDiarioMapper.toResponse(registro);
    }

    @Transactional
    public RegistroDiarioResponseDTO atualizar(Long id, RegistroDiarioRequestDTO dto) {
        RegistroDiario registro = registroDiarioRepository.findById(id)
                .orElseThrow(() -> new RegistroDiarioNotFoundException(id));
        Paciente paciente = pacienteService.buscarEntityPorId(dto.getPacienteId());
        RegistroDiarioMapper.updateEntity(registro, dto, paciente);
        RegistroDiario atualizado = registroDiarioRepository.save(registro);
        return RegistroDiarioMapper.toResponse(atualizado);
    }

    @Transactional
    public void remover(Long id) {
        if (!registroDiarioRepository.existsById(id)) {
            throw new RegistroDiarioNotFoundException(id);
        }
        registroDiarioRepository.deleteById(id);
    }
}
