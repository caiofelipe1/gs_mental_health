👥 Integrantes

- Caio Felipe de Lima Bezerra – RM 556197

- Marcos Vinicius da Silva Costa – RM 555490

- Rafael Federici de Oliveira – RM 554736

🧠 GS 2025 – Plataforma de Monitoramento de Saúde Mental e Bem-Estar

FIAP – Global Solution 2025 · Tema: O Futuro do Trabalho

Este projeto implementa uma API RESTful focada no monitoramento de saúde mental, permitindo que usuários registrem diariamente informações relacionadas ao seu bem-estar emocional, como:

- Humor

- Ansiedade

- Horas de sono

A solução foi desenvolvida em Java + Spring Boot, com arquitetura limpa e modular, seguindo todas as exigências e as melhores práticas do mercado.

🎯 1. Objetivo do Projeto

O objetivo é construir um backend capaz de:

- Cadastrar pacientes

- Registrar entradas diárias de saúde mental

- Registrar humor, ansiedade e horas de sono

- Realizar acompanhamento contínuo

- Suportar integrações futuras com profissionais, consultas e conteúdos terapêuticos

A plataforma auxilia trabalhadores a prevenir burnout, reduzir estresse e melhorar sua qualidade de vida.

🏗️ 2. Arquitetura da Aplicação

A aplicação segue a arquitetura em camadas:

Controller → Service → Repository → Entity

Camadas:

- Controller: controla endpoints e requisições HTTP

- Service: contém regras de negócio e validações

- Repository: comunicação com o banco (Spring Data JPA)

- Entity: classes persistidas no banco

- DTOs: transferência de dados (entrada/saída)

- Exception Handler: tratamento global de erros

Banco e Validações

- Banco: H2 em memória

- ORM: JPA / Hibernate

- Validação: Jakarta Bean Validation.

⚙️ 3. Tecnologias Utilizadas

- Java 17

- Spring Boot 3

- Spring Web

- Spring Data JPA

- H2 Database

- Spring Validation

- Lombok

- Maven

- Postman para testes
  
🚀 4. Como Executar o Projeto

Pré-requisitos:

- Java 17 instalado

- Maven instalado

- IntelliJ IDEA ou VS Code

✔ Passo 1 — Clonar o projeto

Abra o terminal e execute:

git clone https://github.com/caiofelipe1/gs_mental_health.git
cd gs_mental_health

✔ Passo 2 — Executar o projeto (Maven)
mvn spring-boot:run

Ou, caso esteja usando IntelliJ, basta clicar no botão verde “Run” na classe Application.java.

✔ Passo 3 — Acessar a API

A API sobe automaticamente em:

http://localhost:8080

✔ Passo 4 — Acessar o Banco H2

Abra:

http://localhost:8080/h2-console


Credenciais obrigatórias:

JDBC URL: jdbc:h2:mem:gsmentalhealthdb
User: sa
Password: (vazio)

Clique em Connect para visualizar as tabelas.


📡 5. Endpoints da API
🔹 /api/pacientes
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

Busca paciente por ID.

PUT /api/pacientes/{id}

Atualiza dados.

DELETE /api/pacientes/{id}

Remove paciente.

🔹 /api/registros-diarios
GET /api/registros-diarios

Lista todos os registros.

POST /api/registros-diarios

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

Atualiza.

DELETE /api/registros-diarios/{id}

Remove registro.

🗄️ 6. Banco de Dados H2

Console:

http://localhost:8080/h2-console


Configurações:

JDBC URL: jdbc:h2:mem:gsmentalhealthdb

Username: sa

Password: (vazio)

Tabelas disponíveis:

PACIENTES

REGISTROS_DIARIOS

🧪 7. Testes com Postman

Testes realizados com sucesso:

✔ GET /api/pacientes

✔ POST /api/pacientes

✔ POST /api/registros-diarios

✔ GET /api/registros-diarios

✔ PUT e DELETE funcionando

✔ Validação Bean Validation (400 Bad Request)

Exemplos de erros tratados:

Paciente não encontrado

Registro não encontrado

Campos inválidos

Email inválido

Valores fora do range (humor/ansiedade)

🌍 8. Conexão com Futuro do Trabalho + ODS

A solução contribui diretamente para:

ODS 3 – Saúde e Bem-Estar

Monitoramento contínuo de bem-estar

Registro emocional diário

Prevenção de burnout

ODS 8 – Trabalho Decente

Incentiva ambientes corporativos mais saudáveis

Apoia trabalhadores no equilíbrio emocional

Tecnologia como ferramenta para qualidade de vida

🧾 9. Conclusão

Este projeto entrega:

Arquitetura sólida e modular

Código limpo e organizado

CRUDs completos e validados

Tratamento de exceções global

Banco configurado com seeds

Documentação completa

Total aderência ao tema da Global Solution
