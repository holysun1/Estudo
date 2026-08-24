# 🎙️ Budgeting App com Spring AI

## 📌 O que o projeto faz
Este projeto é uma aplicação de gestão de orçamento (budgeting) inteligente. Ele utiliza **Spring AI** com o modelo da **OpenAI** para transcrição e processamento de dados financeiros. A aplicação é capaz de receber requisições em áudio, interpretá-las e auxiliar na organização dos gastos do usuário, automatizando e facilitando o controle financeiro.

## 🚀 Como executar a aplicação
1. Faça um `git clone` do repositório ou crie um fork no GitHub.
2. Certifique-se de que o Docker está rodando e suba o banco de dados MySQL utilizando o Docker Compose (já configurado via `compose.yml`).
3. Configure a sua **API KEY da OpenAI** diretamente nas variáveis de ambiente da sua IDE, garantindo que a chave não fique exposta no código.
4. Atualize as dependências do Gradle.
5. Execute a classe principal `BudgetingApplication.java` localizada em `src/main/java/dio/budgeting/BudgetingApplication.java`.

## 🛠️ Qual melhoria implementei
* **Integração com Swagger:** Adicionei o `springdoc-openapi-starter-webmvc-ui` para gerar a documentação interativa da API, facilitando a visualização e testes dos endpoints.


## 💻 Quais tecnologias foram usadas
* **Linguagem:** Java
* **Framework Principal:** Spring Boot (v4.0.5)
* **Inteligência Artificial:** Spring AI (OpenAI Model)
* **Banco de Dados:** MySQL (com Spring Data JPA)
* **Documentação de API:** Swagger / Springdoc OpenAPI
* **Infraestrutura:** Docker Compose
* **Utilitários:** Lombok (v9.5.0), Gradle
* **Testes:** Gradle Test Runner (configurado pela IDE) / JUnit Platform

## 🧪 Como testar o fluxo principal
O projeto foi preparado com múltiplas formas de validação:
* **Testes Automatizados (Gradle):** Os testes da aplicação foram executados pelo próprio Gradle, configurados e rodando nativamente direto pela IDE.
* **Arquivos de Áudio:** O repositório conta com 5 arquivos de áudio, sendo 2 deles separados exclusivamente para os testes principais de processamento.
* **Arquivos HTML (Teste na IDE):** Foram criados 2 arquivos HTML com o propósito exclusivo de uso interno na IDE. Após dar um "Run" no projeto principal, você pode dar "Run" nesses arquivos HTML para gerar/gravar os arquivos de áudio diretamente para a API.
* **Arquivos HTTP (IDE):** Você pode disparar os testes de API rapidamente utilizando os arquivos `.http` (como o `budgegetting-endpoints_1.http` e `budgegetting-endpoints_2.http`).
* **Swagger UI:** Com a aplicação rodando, acesse a interface do Swagger no seu navegador local para testar os endpoints de forma visual.

## 🧠 O que aprendi durante o desafio
Durante o desenvolvimento, pude compreender na prática como integrar LLMs (Large Language Models) em aplicações corporativas usando **Spring AI**, especialmente a injeção do `ChatClient`. A configuração do ambiente de banco de dados com Docker Compose, a manipulação de requisições de áudio e a estruturação de uma API documentada via Swagger foram essenciais para consolidar as práticas de desenvolvimento no ecossistema Spring.

## 📸 Anotações e Prints do Processo
Abaixo, o print da estrutura do projeto na IDE durante o processo de desenvolvimento e commit:
<img width="741" height="935" alt="image" src="https://github.com/user-attachments/assets/c80fbf09-c081-4fb9-847b-eeb978b890e7" />



## 🔮 Implementações Possíveis (Próximos Passos)
Pensando na evolução do sistema, listei algumas implementações futuras:
* [ ] **Criação de categoria via comando de voz**: Permitir que a IA entenda não só o gasto, mas crie categorias dinamicamente pelo áudio.
* [ ] **Save em categoria nova**: Lógica para identificar categorias inexistentes e salvá-las automaticamente no banco.
* [ ] **Total gasto em categoria**: Criação de classes e endpoints específicos (ex: `Total_gasto_em_categoria`) para consolidar relatórios e fornecer análises estatísticas dos gastos.
