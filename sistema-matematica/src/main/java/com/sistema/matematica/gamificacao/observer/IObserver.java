package com.sistema.matematica.gamificacao.observer;

import com.sistema.matematica.gamificacao.modelo.Aluno;

public interface IObserver {
    void update(Aluno aluno, String mensagem);
}