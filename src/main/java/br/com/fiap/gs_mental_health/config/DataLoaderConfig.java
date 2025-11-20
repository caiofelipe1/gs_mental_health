package br.com.fiap.gs_mental_health.config;

import br.com.fiap.gs_mental_health.domain.entity.Paciente;
import br.com.fiap.gs_mental_health.domain.entity.RegistroDiario;
import br.com.fiap.gs_mental_health.repository.PacienteRepository;
import br.com.fiap.gs_mental_health.repository.RegistroDiarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class DataLoaderConfig {

    @Bean
    public CommandLineRunner dataLoader(PacienteRepository pacienteRepository,
                                        RegistroDiarioRepository registroDiarioRepository) {
        return args -> {
            if (pacienteRepository.count() == 0) {
                Paciente p1 = new Paciente();
                p1.setNome("Ana Souza");
                p1.setEmail("ana.souza@example.com");
                p1.setDataNascimento(LocalDate.of(1995, 3, 10));
                p1.setTelefone("11999990001");
                p1.setProfissao("Analista de Sistemas");
                p1.setCreatedAt(LocalDateTime.now());

                Paciente p2 = new Paciente();
                p2.setNome("Carlos Lima");
                p2.setEmail("carlos.lima@example.com");
                p2.setDataNascimento(LocalDate.of(1988, 7, 22));
                p2.setTelefone("11999990002");
                p2.setProfissao("Gestor de Projetos");
                p2.setCreatedAt(LocalDateTime.now());

                pacienteRepository.save(p1);
                pacienteRepository.save(p2);

                RegistroDiario r1 = new RegistroDiario();
                r1.setPaciente(p1);
                r1.setDataRegistro(LocalDate.now().minusDays(1));
                r1.setNivelHumor(4);
                r1.setNivelAnsiedade(2);
                r1.setHorasSono(7.5);
                r1.setObservacoes("Dia produtivo, um pouco cansada, mas bem.");

                RegistroDiario r2 = new RegistroDiario();
                r2.setPaciente(p2);
                r2.setDataRegistro(LocalDate.now());
                r2.setNivelHumor(2);
                r2.setNivelAnsiedade(4);
                r2.setHorasSono(5.0);
                r2.setObservacoes("Muito trabalho, preocupado com prazos.");

                registroDiarioRepository.save(r1);
                registroDiarioRepository.save(r2);
            }
        };
    }
}
