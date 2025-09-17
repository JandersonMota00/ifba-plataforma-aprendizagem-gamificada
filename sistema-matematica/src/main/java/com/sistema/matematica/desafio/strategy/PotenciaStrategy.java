package com.sistema.matematica.desafio.strategy;
import com.sistema.matematica.desafio.IProblemaMatematico;
import java.util.Random;

public class PotenciaStrategy implements IProblemaMatematico {

    private int base;
    private int expoente;
    private long respostaCorreta; // Use long para evitar overflow com potências maiores

    public PotenciaStrategy() {
        Random random = new Random();
        this.base = random.nextInt(5) + 2; // Base entre 2 e 6
        this.expoente = random.nextInt(3) + 2; // Expoente entre 2 e 4
        this.respostaCorreta = (long) Math.pow(this.base, this.expoente);
    }

    @Override
    public String gerarEnunciado() {
        return "Qual é o resultado de " + base + " elevado a " + expoente + "?";
    }

    @Override
    public boolean verificarResposta(String resposta) {
        try {
            long respostaAluno = Long.parseLong(resposta);
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
