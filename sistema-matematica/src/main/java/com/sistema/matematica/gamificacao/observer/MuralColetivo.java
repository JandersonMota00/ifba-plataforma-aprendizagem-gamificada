package com.sistema.matematica.gamificacao.observer;

import com.sistema.matematica.gamificacao.modelo.Aluno;
import com.sistema.matematica.util.Logger;

import java.util.ArrayList;
import java.util.List;

public class MuralColetivo {

    private final List<IObserver> observadores = new ArrayList<>();
    private final List<String> mensagens = new ArrayList<>();
    
    public void addObserver(IObserver observer) {
        observadores.add(observer);
    }

    public void notificar(Aluno aluno, String mensagem) {
        for (IObserver observer : observadores) {
            observer.update(aluno, mensagem);
        }
    }

    public void adicionarMensagem(String mensagem) {
        mensagens.add(mensagem);
        Logger.info("Nova mensagem no mural: " + mensagem);
    }

    public List<String> getMensagens() {
        return mensagens;
    }
}