package com.sistema.matematica.gamificacao.modelo;

public class Pontuacao {
    private int pontos;
    private String motivo;

    public Pontuacao(int pontos, String motivo) {
        this.pontos = pontos;
        this.motivo = motivo;
    }

    public int getPontos() {
        return pontos;
    }

    public String getMotivo() {
        return motivo;
    }
}