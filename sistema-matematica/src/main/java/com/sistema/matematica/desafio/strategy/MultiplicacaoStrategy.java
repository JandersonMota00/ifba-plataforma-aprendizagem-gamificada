package com.sistema.matematica.desafio.strategy;

import com.sistema.matematica.desafio.IProblemaMatematico;

import java.util.Random;

public class MultiplicacaoStrategy implements IProblemaMatematico {

    private int numero1;
    private int numero2;
    private int respostaCorreta;

    public MultiplicacaoStrategy() {
        Random random = new Random();
        this.numero1 = random.nextInt(13) + 1; // Fatores de 1 a 13
        this.numero2 = random.nextInt(13) + 1;
        this.respostaCorreta = this.numero1 * this.numero2;
    }

    @Override
    public String gerarEnunciado() {
        return "Qual é o resultado de " + numero1 + " x " + numero2 + "?";
    }

    @Override
    public boolean verificarResposta(String resposta) {
        try {
            int respostaAluno = Integer.parseInt(resposta);
            return respostaAluno == respostaCorreta;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String getFeedback() {
        return "A resposta correta era: " + respostaCorreta;
    }
}