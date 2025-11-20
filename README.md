GS 2025 – Plataforma de Monitoramento de Saúde Mental e Bem-Estar

FIAP – Global Solution 2025
Tema: O Futuro do Trabalho

Este projeto implementa uma API RESTful para uma plataforma de monitoramento de saúde mental, permitindo que usuários registrem diariamente informações relacionadas ao seu bem-estar emocional, como humor, ansiedade e horas de sono.

A solução foi desenvolvida utilizando Java + Spring Boot e segue uma arquitetura limpa em camadas, alinhada às melhores práticas.

1. Objetivo do Projeto

O objetivo é construir um backend capaz de:

- Registrar pacientes

- Registrar entradas diárias de saúde mental

- Realizar acompanhamento contínuo

- Suportar futuras integrações com profissionais de saúde e conteúdos terapêuticos

Com isso, a plataforma auxilia trabalhadores a prevenir burnout, reduzir estresse e melhorar sua qualidade de vida — conectando-se diretamente ao tema Futuro do Trabalho e aos ODS 3 (Saúde e Bem-Estar) e ODS 8 (Trabalho Decente).

2. Arquitetura da Aplicação

A aplicação segue a arquitetura:

Controller → Service → Repository → Entity


Camadas:

Controller: Lida com requisições HTTP.

Service: Contém regras de negócio e validações.

Repository: Acesso ao banco de dados via Spring Data JPA.

Entity: Classes persistidas no banco.

DTO: Entrada/saída de dados.

Exception Handler: Tratamento global de erros.

Banco: H2 (memória)
ORM: JPA/Hibernate
Validação: Jakarta Bean Validation

3. Tecnologias Utilizadas
- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database
- Spring Validation
- Maven
- Lombok
- Postman

4. Como Executar o Projeto
 Pré-requisitos:

- Java 17 instalado

- Maven instalado

- IntelliJ IDEA ou VS Code

 Rodar a aplicação:
mvn spring-boot:run


A API sobe automaticamente em:

http://localhost:8080

5. Endpoints da API
🔹 Pacientes (/api/pacientes)
GET /api/pacientes

Lista todos os pacientes.

POST /api/pacientes

Cria um novo paciente.

Exemplo de JSON:
{
  "nome": "Vinicius Lira",
  "email": "vinicius.lira@example.com",
  "dataNascimento": "1998-09-10",
  "telefone": "11988887777",
  "profissao": "Dev Java"
}

GET /api/pacientes/{id}

Busca paciente específico.

PUT /api/pacientes/{id}

Atualiza dados de um paciente.

DELETE /api/pacientes/{id}

Remove paciente.

🔹 Registros Diários (/api/registros-diarios)
GET /api/registros-diarios

Lista todos os registros.

POST /api/registros-diarios

Cria um novo registro diário.

Exemplo de JSON:
{
  "dataRegistro": "2025-11-20",
  "nivelHumor": 3,
  "nivelAnsiedade": 4,
  "horasSono": 6.5,
  "observacoes": "Semana corrida, um pouco cansado.",
  "pacienteId": 1
}

GET /api/registros-diarios/{id}

Busca registro por ID.

PUT /api/registros-diarios/{id}

Atualiza registro.

DELETE /api/registros-diarios/{id}

Remove registro.

6. Banco de Dados H2

Acesse o console:

http://localhost:8080/h2-console


Credenciais:

JDBC URL: jdbc:h2:mem:gsmentalhealthdb
User: sa
Password: (vazio)

7. Testes com Postman

✔️ GET /pacientes

✔️ POST /pacientes

✔️ POST /registros-diarios

✔️ Respostas 201 CREATED

✔️ Listagens funcionando

✔️ Validação funcionando (400 BAD REQUEST com mensagens claras)

8. Conexão com o Futuro do Trabalho + ODS

A plataforma proposta:

Ajuda profissionais a acompanharem seu bem-estar emocional

Previne burnout e estresse crônico em ambientes de alta pressão

Incentiva autoconsciência e hábitos saudáveis

Alinha-se ao ODS 3 – Saúde e Bem-Estar

Contribui para ODS 8 – Trabalho Decente ao fomentar ambientes mais humanos

9. Conclusão

Este projeto entrega:

Arquitetura sólida

Código limpo e profissional

Endpoints completos

Relação direta com o tema da Global Solution

Documentação alinhada ao padrão FIAP

Testes validados e funcionando
