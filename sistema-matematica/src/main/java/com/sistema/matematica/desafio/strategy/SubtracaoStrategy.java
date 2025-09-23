package com.sistema.matematica.desafio.strategy;

import com.sistema.matematica.desafio.IProblemaMatematico;

import java.util.Random;

public class SubtracaoStrategy implements IProblemaMatematico {

    private int numero1;
    private int numero2;
    private int respostaCorreta;

    public SubtracaoStrategy() {
        Random random = new Random();
        this.numero1 = random.nextInt(100) + 1;
        this.numero2 = random.nextInt(this.numero1) + 1;
        this.respostaCorreta = this.numero1 - this.numero2;
    }

    @Override
    public String gerarEnunciado() {
        return "Qual é o resultado de " + numero1 + " - " + numero2 + "?";
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
