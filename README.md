# Trabalho de Plataforma Colaborativa de Aprendizagem Gamificada

- **Instituição:** Instituto Federal da Bahia (IFBA)
- **Curso:** Análise e Desenvolvimento de Sistemas (ADS)
- **Disciplina:** Padrões de Projetos
- **Projeto:** Projeto Final – Plataforma Colaborativa de Aprendizagem Gamificada
- **Professor:** Felipe de Souza Silva
- **Semestre:** 5
- **Ano:** 2025.1

## Descrição do projeto: Sistema de Conhecimento em Matemática
Desenvolver uma plataforma de aprendizagem gamificada, aplicando padrões de projeto (GOF) e princípios SOLID, com foco em modularidade, extensibilidade e divisão equilibrada de responsabilidades entre os integrantes do grupo.

O projeto deve simular um ambiente educacional interativo, em que alunos participam de desafios, acumulam pontos, conquistam medalhas e interagem em um mural coletivo.

### **Escopo e Regras do Projeto**

**1. Funcionalidades Mínimas**

  - Gerenciamento de Usuários e Perfis
  - Sistema de Desafios e Pontuação
  - Gamificação e Recompensas
  - Relatórios e Exportação
  - Histórico de Interações

**2. Regras Técnicas**

  - O sistema pode ser desenvolvido em Java, C# ou Python.
  - Não é permitido usar frameworks prontos de gamificação; a lógica deve ser construída pelos alunos.
  - O código deve ser modularizado e documentado.
  - A aplicação pode ser console-based ou com interface simples (GUI ou web), desde que todas as funcionalidades sejam contempladas.

### **Padrões de Projeto Exigidos**

Deverá aplicar no mínimo 7 padrões distintos, sendo:
- De Criação: Singleton, Factory Method. 
- Estruturais: Decorator, Composite, Adapter, Facade. 
- Comportamentais: Observer, Strategy, Command.

[P1 - Plataforma Colaborativa de Aprendizagem Gamificada.pdf](https://github.com/user-attachments/files/22211885/P1.-.SAJ-ADS08.-.Plataforma.Colaborativa.de.Aprendizagem.Gamificada.pdf)

## Integrantes do Projeto

<table>
  <tr>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/111200453?v=4" width="100px;" alt="Foto do Integrante Amanda"/><br />
      <sub><b><a href="https://github.com/Amandalopes28">Amanda Lopes</a></b></sub>
    </td>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/80362674?v=4" width="100px;" alt="Foto do Integrante Janderson"/><br />
      <sub><b><a href="https://github.com/JandersonMota">Janderson Mota</a></b></sub>
    </td>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/110790276?v=4" width="100px;" alt="Foto da Integrante Sarah"/><br />
      <sub><b><a href="https://github.com/SarahPithon/">Sarah Pithon</a></b></sub>
    </td>
  </tr>
</table>

## Tecnologias

- **Linguagem:** Java 21

## Estrutura do Projeto
A estrutura de pacotes é a chave para a modularidade do seu projeto. Cada módulo ou componente deve ter seu próprio pacote, garantindo o princípio de Responsabilidade Única (SRP) e facilitando a organização. A estrutura é baseada em Maven para facilitar o gerenciamento de dependências e a compilação.

```
/sistema-matematica
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/sistema/matematica/
│   │   │       ├── Main.java                             # Classe principal para iniciar a aplicação
│   │   │       ├── desafio/                              # Módulo de Desafios (Padrão Strategy)
│   │   │       │   ├── strategy/
│   │   │       │   │   ├── SomaStrategy.java
│   │   │       │   │   ├── SubtracaoStrategy.java
│   │   │       │   │   ├── MultiplicacaoStrategy.java
│   │   │       │   │   ├── DivisaoStrategy.java
│   │   │       │   │   ├── PotenciaStrategy.java
│   │   │       │   │   └── RaizStrategy.java
│   │   │       │   ├── ProblemaFactory.java              # Padrão Factory Method
│   │   │       │   ├── IProblemaMatematico.java
│   │   │       │   └── Desafio.java
│   │   │       │   
│   │   │       ├── gamificacao/                          # Módulo de Gamificação
│   │   │       │   ├── modelo/
│   │   │       │   │   ├── Aluno.java
│   │   │       │   │   ├── Pontuacao.java
│   │   │       │   │   └── Medalha.java
│   │   │       │   ├── gerenciador/
│   │   │       │   │   ├── GerenciadorPontuacao.java
│   │   │       │   │   └── GerenciadorMedalhas.java
│   │   │       │   └── observer/                         # Padrão Observer
│   │   │       │       ├── IObserver.java
│   │   │       │       ├── MuralColetivo.java
│   │   │       │       └── ConquistaObserver.java
│   │   │       │   
│   │   │       └── util/                                 # Módulo de utilidades
│   │   │           └── Logger.java
│   │   └── resources/
│   │       └── config.properties
│   │   
│   └── test/
│       └── java/
│           └── com/sistema/matematica/
│               ├── desafio/
│               │   └── ProblemaMatematicoTest.java
│               └── gamificacao/
│                   └── GerenciadorPontuacaoTest.java
│
├── pom.xml                                               # Arquivo de configuração do Maven
└── README.md
```

## UML

<img width="3840" height="1448" alt="Untitled diagram _ Mermaid Chart-2025-09-21-110940" src="https://github.com/user-attachments/assets/81eb3929-a812-4ee1-baba-4c28339fdeb0" />

<img width="3840" height="1328" alt="Untitled diagram _ Mermaid Chart-2025-09-21-111229" src="https://github.com/user-attachments/assets/12071de4-822e-455b-8850-f3d499fb2bb4" />



## Documentação

https://docs.google.com/document/d/1beZO7KMC_pAvIYz_fktU6f7bppvh_SbKrem1Q0h-_v0/edit?usp=sharing

## Apresentação
