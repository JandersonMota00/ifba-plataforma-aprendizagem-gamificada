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
/ifba-plataforma-aprendizagem-gamificada
├── sistema-matematica/
|   └── src/
│       └── main/
│           ├── java/
│           │   └── com/sistema/matematica/
│           │       ├── Main.java                             # Classe principal para iniciar a aplicação
│           │       ├── desafio/                              # Módulo de Desafios (Padrão Strategy)
│           │       │   ├── strategy/
│           │       │   │   ├── SomaStrategy.java
│           │       │   │   ├── SubtracaoStrategy.java
│           │       │   │   ├── MultiplicacaoStrategy.java
│           │       │   │   ├── DivisaoStrategy.java
│           │       │   │   ├── PotenciaStrategy.java
│           │       │   │   └── RaizStrategy.java
│           │       │   ├── ProblemaFactory.java              # Padrão Factory Method
│           │       │   ├── IProblemaMatematico.java
│           │       │   └── Desafio.java
│           │       │   
│           │       ├── gamificacao/                          # Módulo de Gamificação
│           │       │   ├── modelo/
│           │       │   │   ├── Aluno.java
│           │       │   │   ├── Pontuacao.java
│           │       │   │   └── Medalha.java
│           │       │   ├── gerenciador/
│           │       │   │   ├── GerenciadorPontuacao.java
│           │       │   │   └── GerenciadorMedalhas.java
│           │       │   └── observer/                         # Padrão Observer
│           │       │       ├── IObserver.java
│           │       │       ├── MuralColetivo.java
│           │       │       └── ConquistaObserver.java
│           │       │   
│           │       └── util/                                 # Módulo de utilidades
│           │           └── Logger.java
│           └── resources/
│
└── README.md
```

## UML
Diagrama de Classes: 

<img width="3840" height="1448" alt="Untitled diagram _ Mermaid Chart-2025-09-21-110940" src="https://github.com/user-attachments/assets/81eb3929-a812-4ee1-baba-4c28339fdeb0" />

Diagrama de Sequência:
<img width="3840" height="1328" alt="Untitled diagram _ Mermaid Chart-2025-09-21-111229" src="https://github.com/user-attachments/assets/12071de4-822e-455b-8850-f3d499fb2bb4" />

## Telas de execução
Quando executa o código:

<img width="304" height="119" alt="image" src="https://github.com/user-attachments/assets/38e4f32e-9639-4b3e-9a1e-0233c4f40450" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="298" height="119" alt="image" src="https://github.com/user-attachments/assets/fc2d5957-2798-4f9c-ac15-39caf934a469" />

<br><br>

<img width="306" height="82" alt="image" src="https://github.com/user-attachments/assets/42c72b44-4320-4c11-9029-eb2a09557cb6" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="305" height="122" alt="image" src="https://github.com/user-attachments/assets/0b1d2583-41bc-4cf6-92d2-6a9b54d3e341" />

<br><br>

<img width="306" height="70" alt="image" src="https://github.com/user-attachments/assets/c66fb968-95de-47e9-accd-2801f434de12" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="304" height="116" alt="image" src="https://github.com/user-attachments/assets/fbc1f4c6-b90b-43b1-96d8-f3c8c0d5aeb0" />

<br><br>

<img width="274" height="76" alt="image" src="https://github.com/user-attachments/assets/c0365aff-b2dd-4c91-b3e2-1d0409ec99ba" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="273" height="114" alt="image" src="https://github.com/user-attachments/assets/50a8d7e4-1bfc-4146-8907-3d77b3e1ec51" />

<br><br>

<img width="274" height="72" alt="image" src="https://github.com/user-attachments/assets/46c57bbd-387c-4faf-ac2f-14a128172c09" />
&nbsp;
<img width="724" height="136" alt="image" src="https://github.com/user-attachments/assets/3c313439-6642-480a-a5e6-85cd961c964c" />

<br><br>

<img width="249" height="73" alt="image" src="https://github.com/user-attachments/assets/d0927ac8-bc6c-4039-b253-4fd29d78ffbd" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="369" height="98" alt="image" src="https://github.com/user-attachments/assets/6868c952-f0f7-4f3c-a6b0-82fab9926420" />

<br><br>

<img width="359" height="139" alt="image" src="https://github.com/user-attachments/assets/ecc38e4d-1c8b-444e-813f-f5782299f130" />

## Documentação

[Projeto Final-Padroes de Projeto-2025.1.pdf](https://github.com/user-attachments/files/22569483/Projeto.Final-Padroes.de.Projeto-2025.1.pdf)


## Apresentação

[Slide P1 Padrões de Projeto-2025.1.pptx](https://github.com/user-attachments/files/22569484/Slide.P1.Padroes.de.Projeto-2025.1.pptx)

