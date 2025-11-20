package br.com.fiap.gs_mental_health.service;

import br.com.fiap.gs_mental_health.domain.entity.Paciente;
import br.com.fiap.gs_mental_health.dto.paciente.PacienteRequestDTO;
import br.com.fiap.gs_mental_health.dto.paciente.PacienteResponseDTO;
import br.com.fiap.gs_mental_health.exception.PacienteNotFoundException;
import br.com.fiap.gs_mental_health.mapper.PacienteMapper;
import br.com.fiap.gs_mental_health.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Transactional
    public PacienteResponseDTO criar(PacienteRequestDTO dto) {
        Paciente paciente = PacienteMapper.toEntity(dto);
        Paciente salvo = pacienteRepository.save(paciente);
        return PacienteMapper.toResponse(salvo);
    }

    @Transactional(readOnly = true)
    public List<PacienteResponseDTO> listarTodos() {
        return pacienteRepository.findAll()
                .stream()
                .map(PacienteMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public PacienteResponseDTO buscarPorId(Long id) {
        Paciente paciente = pacienteRepository.findById(id)
                .orElseThrow(() -> new PacienteNotFoundException(id));
        return PacienteMapper.toResponse(paciente);
    }

    @Transactional
    public PacienteResponseDTO atualizar(Long id, PacienteRequestDTO dto) {
        Paciente paciente = pacienteRepository.findById(id)
                .orElseThrow(() -> new PacienteNotFoundException(id));
        PacienteMapper.updateEntity(paciente, dto);
        Paciente atualizado = pacienteRepository.save(paciente);
        return PacienteMapper.toResponse(atualizado);
    }

    @Transactional
    public void remover(Long id) {
        if (!pacienteRepository.existsById(id)) {
            throw new PacienteNotFoundException(id);
        }
        pacienteRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Paciente buscarEntityPorId(Long id) {
        return pacienteRepository.findById(id)
                .orElseThrow(() -> new PacienteNotFoundException(id));
    }
}
