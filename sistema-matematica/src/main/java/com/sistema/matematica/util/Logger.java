package com.sistema.matematica.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void info(String mensagem) {
        System.out.println("[INFO] " + LocalDateTime.now().format(FORMATTER) + " - " + mensagem);
    }
    
    public static void erro(String mensagem) {
        System.err.println("[ERRO] " + LocalDateTime.now().format(FORMATTER) + " - " + mensagem);
    }
}