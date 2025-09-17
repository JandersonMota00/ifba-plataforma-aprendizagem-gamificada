package com.sistema.matematica.gamificacao.modelo;

public class Medalha {

    private String nome;
    private String descricao;

    public Medalha(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}