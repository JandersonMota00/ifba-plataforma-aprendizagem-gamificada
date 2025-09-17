package com.sistema.matematica.desafio.strategy;
import com.sistema.matematica.desafio.IProblemaMatematico;
import java.util.Random;

public class RaizStrategy implements IProblemaMatematico {

    private int numero;
    private int respostaCorreta;

    public RaizStrategy() {
        Random random = new Random();
        this.respostaCorreta = random.nextInt(10) + 2; // Resposta entre 2 e 11
        this.numero = this.respostaCorreta * this.respostaCorreta;
    }

    @Override
    public String gerarEnunciado() {
        return "Qual é a raiz quadrada de " + numero + "?";
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
