package com.sistema.matematica.desafio.strategy;

import com.sistema.matematica.desafio.IProblemaMatematico;

import java.util.Random;

public class DivisaoStrategy implements IProblemaMatematico {

    private int dividendo;
    private int divisor;
    private int respostaCorreta;

    public DivisaoStrategy() {
        Random random = new Random();
        this.respostaCorreta = random.nextInt(10) + 2; // Resposta entre 2 e 11
        this.divisor = random.nextInt(10) + 2; // Divisor entre 2 e 11
        this.dividendo = this.respostaCorreta * this.divisor;
    }

    @Override
    public String gerarEnunciado() {
        return "Qual é o resultado de " + dividendo + " / " + divisor + "?";
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