package com.sistema.matematica.desafio;

import com.sistema.matematica.desafio.strategy.*;

public class ProblemaFactory {
    
    public static IProblemaMatematico criarProblema(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "soma" -> new SomaStrategy();
            case "subtracao" -> new SubtracaoStrategy();
            case "multiplicacao" -> new MultiplicacaoStrategy();
            case "divisao" -> new DivisaoStrategy();
            case "potencia" -> new PotenciaStrategy();
            case "raiz" -> new RaizStrategy();
            default -> throw new IllegalArgumentException("Tipo de problema desconhecido: " + tipo);
        };
    }
}