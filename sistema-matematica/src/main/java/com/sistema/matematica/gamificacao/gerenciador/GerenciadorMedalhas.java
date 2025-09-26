package com.sistema.matematica.gamificacao.gerenciador;

import com.sistema.matematica.gamificacao.modelo.Aluno;
import com.sistema.matematica.gamificacao.modelo.Medalha;
import com.sistema.matematica.gamificacao.observer.MuralColetivo;

public class GerenciadorMedalhas {
    
    // Adicionamos o MuralColetivo para notificar conquistas
    private final MuralColetivo mural;

    public GerenciadorMedalhas(MuralColetivo mural) {
        this.mural = mural;
    }

    // O método agora retorna a medalha concedida (ou null)
    public Medalha verificarConquistas(Aluno aluno) {
        
        Medalha novaMedalha = null;
        
        // Critério 1: Pontuação Total
        if (aluno.getPontuacaoTotal() >= 100 && !aluno.possuiMedalha("Iniciante de Ouro")) {
            novaMedalha = new Medalha("Iniciante de Ouro", "Pontuação total de 100 pontos.");
        } 
        
        // Critério 2: Superar a Potência (Exemplo de Desafio Específico)
        else if (aluno.getPontuacaoTotal() >= 50 && !aluno.possuiMedalha("Mestre da Potência")) {
             // (Para este exemplo, vamos assumir que 50 pontos já é suficiente após um certo número de acertos)
             novaMedalha = new Medalha("Mestre da Potência", "Concluiu o módulo de Potência com excelência.");
        }
        
        // Se uma nova medalha foi conquistada
        if (novaMedalha != null) {
            aluno.adicionarMedalha(novaMedalha);
            
            // Padrão Observer: Notifica o mural
            String mensagem = "CONQUISTOU A MEDALHA: " + novaMedalha.getNome() + "!";
            mural.notificar(aluno, mensagem);
            
            return novaMedalha;
        }
        return null;
    }
}