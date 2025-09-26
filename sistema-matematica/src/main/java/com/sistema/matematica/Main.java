package com.sistema.matematica;

import com.sistema.matematica.desafio.IProblemaMatematico;
import com.sistema.matematica.desafio.ProblemaFactory;
import com.sistema.matematica.gamificacao.gerenciador.GerenciadorMedalhas;
import com.sistema.matematica.gamificacao.gerenciador.GerenciadorPontuacao;
import com.sistema.matematica.gamificacao.modelo.Aluno;
import com.sistema.matematica.gamificacao.observer.ConquistaObserver; // Importar
import com.sistema.matematica.gamificacao.observer.MuralColetivo; // Importar

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    private static final GerenciadorPontuacao gerenciadorPontuacao = new GerenciadorPontuacao();
    private static final Scanner scanner = new Scanner(System.in);
    
    // Adicionando Mural e Gerenciador de Medalhas como variáveis de classe
    private static MuralColetivo mural;
    private static GerenciadorMedalhas gerenciadorMedalhas;


    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("João");
        
        // 1. Inicializa o Mural e o Observer (Padrão Observer)
        mural = new MuralColetivo();
        ConquistaObserver observer = new ConquistaObserver(mural);
        mural.addObserver(observer);
        
        // 2. Inicializa o Gerenciador de Medalhas passando o Mural
        gerenciadorMedalhas = new GerenciadorMedalhas(mural);
        
        System.out.println("Bem-vindo(a), " + aluno.getNome() + "!");
        System.out.println("Vamos começar os desafios de Matemática!");

        List<String> tiposDeProblema = Arrays.asList(
                "soma", 
                "subtracao", 
                "multiplicacao", 
                "divisao", 
                "potencia", 
                "raiz"
        );
        
        Collections.shuffle(tiposDeProblema);

        for (int i = 0; i < 6; i++) {
             // Repetimos o loop para que o aluno tenha mais chances de alcançar 100 pontos
            String tipo = tiposDeProblema.get(i % tiposDeProblema.size()); 
            System.out.println("\n===== Desafio " + (i + 1) + " de 6: " + tipo.toUpperCase() + " =====");
            executarDesafio(aluno, tipo);
        }

        System.out.println("\n=============================================");
        System.out.println("FIM DOS DESAFIOS!");
        System.out.println("Pontuação Final de " + aluno.getNome() + ": " + aluno.getPontuacaoTotal() + " pontos.");
        System.out.println("Medalhas conquistadas: " + aluno.getMedalhas().size());
        
        // O mural agora pode ser inspecionado para ver as mensagens!
        System.out.println("\n--- Mural de Conquistas ---");
        mural.getMensagens().forEach(System.out::println); 
        System.out.println("---------------------------");
        
        scanner.close();
    }
    
    private static void executarDesafio(Aluno aluno, String tipo) {
        try {
            IProblemaMatematico problema = ProblemaFactory.criarProblema(tipo);

            System.out.println(problema.gerarEnunciado());
            System.out.print("Sua resposta: ");
            String resposta = scanner.nextLine();

            boolean acertou = problema.verificarResposta(resposta);

            if (acertou) {
                System.out.println("-> Parabéns! Resposta correta.");
                gerenciadorPontuacao.adicionarPontos(aluno, true);
            } else {
                System.out.println("-> Resposta incorreta. " + problema.getFeedback());
                gerenciadorPontuacao.adicionarPontos(aluno, false);
            }

            // Chamada do gerenciador de medalhas
            gerenciadorMedalhas.verificarConquistas(aluno);
            
            System.out.println("Pontuação atual: " + aluno.getPontuacaoTotal());

        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}