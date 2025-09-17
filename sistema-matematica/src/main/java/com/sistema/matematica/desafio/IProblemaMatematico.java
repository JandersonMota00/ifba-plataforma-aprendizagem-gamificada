package com.sistema.matematica.desafio;

import com.sistema.matematica.gamificacao.modelo.Aluno;

public interface IProblemaMatematico {
    
    String gerarEnunciado();
    
    boolean verificarResposta(String resposta);
    
    // Método opcional para fornecer feedback específico
    String getFeedback();
}