package com.sistema.matematica.desafio;

import com.sistema.matematica.gamificacao.gerenciador.GerenciadorMedalhas;
import com.sistema.matematica.gamificacao.gerenciador.GerenciadorPontuacao;
import com.sistema.matematica.gamificacao.modelo.Aluno;

public class Desafio {

    private final IProblemaMatematico problema;
    private final Aluno aluno;
    private final GerenciadorPontuacao gerenciadorPontuacao;
    private final GerenciadorMedalhas gerenciadorMedalhas;

    public Desafio(IProblemaMatematico problema, Aluno aluno) {
        this.problema = problema;
        this.aluno = aluno;
        this.gerenciadorPontuacao = new GerenciadorPontuacao();
        this.gerenciadorMedalhas = new GerenciadorMedalhas();
    }
    
    public String getEnunciado() {
        return problema.gerarEnunciado();
    }
    
    public boolean submeterResposta(String resposta) {
        boolean acertou = problema.verificarResposta(resposta);
        
        if (acertou) {
            gerenciadorPontuacao.adicionarPontos(aluno, true);
        } else {
            System.out.println("Resposta incorreta. " + problema.getFeedback());
            gerenciadorPontuacao.adicionarPontos(aluno, false);
        }

        gerenciadorMedalhas.verificarConquistas(aluno);
        
        return acertou;
    }
}