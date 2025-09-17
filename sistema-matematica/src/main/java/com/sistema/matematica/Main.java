package com.sistema.matematica;

import com.sistema.matematica.desafio.IProblemaMatematico;
import com.sistema.matematica.desafio.ProblemaFactory;
import com.sistema.matematica.gamificacao.gerenciador.GerenciadorMedalhas;
import com.sistema.matematica.gamificacao.gerenciador.GerenciadorPontuacao;
import com.sistema.matematica.gamificacao.modelo.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("João");
        Scanner scanner = new Scanner(System.in);
        GerenciadorPontuacao gerenciadorPontuacao = new GerenciadorPontuacao();
        GerenciadorMedalhas gerenciadorMedalhas = new GerenciadorMedalhas();

        System.out.println("Bem-vindo(a), " + aluno.getNome() + "!");

        // Exemplo de Desafio de Soma
        System.out.println("\n--- Desafio de Soma ---");
        IProblemaMatematico problemaSoma = ProblemaFactory.criarProblema("soma");
        
        System.out.println(problemaSoma.gerarEnunciado());
        System.out.print("Sua resposta: ");
        String respostaSoma = scanner.nextLine();

        if (problemaSoma.verificarResposta(respostaSoma)) {
            System.out.println("Parabéns! Resposta correta.");
            gerenciadorPontuacao.adicionarPontos(aluno, true);
        } else {
            System.out.println("Resposta incorreta. " + problemaSoma.getFeedback());
            gerenciadorPontuacao.adicionarPontos(aluno, false);
        }

        gerenciadorMedalhas.verificarConquistas(aluno);
        
        System.out.println("\nPontuação atual: " + aluno.getPontuacaoTotal());
        System.out.println("Medalhas conquistadas: " + aluno.getMedalhas().size());
        
        scanner.close();
    }
}