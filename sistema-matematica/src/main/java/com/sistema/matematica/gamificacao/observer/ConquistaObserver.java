package com.sistema.matematica.gamificacao.observer;

import com.sistema.matematica.gamificacao.modelo.Aluno;
import com.sistema.matematica.util.Logger;

public class ConquistaObserver implements IObserver {

    private final MuralColetivo mural;

    public ConquistaObserver(MuralColetivo mural) {
        this.mural = mural;
    }

    @Override
    public void update(Aluno aluno, String mensagem) {
        // Lógica para formatar a mensagem antes de publicar no mural
        String mensagemFormatada = String.format("%s - %s", aluno.getNome(), mensagem);
        
        // Simula a adição da mensagem ao mural
        mural.adicionarMensagem(mensagemFormatada); 
    }
}