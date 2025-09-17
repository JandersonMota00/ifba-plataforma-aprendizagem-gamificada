package com.sistema.matematica.gamificacao.modelo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    
    private String nome;
    private int pontuacaoTotal;
    private final List<Medalha> medalhas = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
        this.pontuacaoTotal = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacaoTotal() {
        return pontuacaoTotal;
    }

    public void adicionarPontos(int pontos) {
        this.pontuacaoTotal += pontos;
    }

    public void adicionarMedalha(Medalha medalha) {
        this.medalhas.add(medalha);
    }
    
    public boolean possuiMedalha(String nomeMedalha) {
        return medalhas.stream().anyMatch(m -> m.getNome().equals(nomeMedalha));
    }

    public List<Medalha> getMedalhas() {
        return medalhas;
    }
}