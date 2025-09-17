package com.sistema.matematica.gamificacao.gerenciador;

import com.sistema.matematica.gamificacao.modelo.Aluno;
import com.sistema.matematica.gamificacao.modelo.Medalha;

public class GerenciadorMedalhas {
    
    public void verificarConquistas(Aluno aluno) {
        if (aluno.getPontuacaoTotal() >= 100 && !aluno.possuiMedalha("Iniciante de Ouro")) {
            Medalha medalha = new Medalha("Iniciante de Ouro", "Pontuação total de 100 pontos.");
            aluno.adicionarMedalha(medalha);
            System.out.println(aluno.getNome() + " conquistou a medalha: " + medalha.getNome() + "!");
        }
    }
}