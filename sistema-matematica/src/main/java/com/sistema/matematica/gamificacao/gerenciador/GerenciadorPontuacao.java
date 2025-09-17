package com.sistema.matematica.gamificacao.gerenciador;

import com.sistema.matematica.gamificacao.modelo.Aluno;

public class GerenciadorPontuacao {

    private static final int PONTOS_ACERTO = 10;
    
    public void adicionarPontos(Aluno aluno, boolean acertou) {
        if (acertou) {
            aluno.adicionarPontos(PONTOS_ACERTO);
            System.out.println(aluno.getNome() + " ganhou " + PONTOS_ACERTO + " pontos!");
        }
    }
}