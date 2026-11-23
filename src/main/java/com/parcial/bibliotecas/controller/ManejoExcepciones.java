package com.parcial.bibliotecas.controller;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ManejoExcepciones {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> manejarDatosInvalidos(IllegalArgumentException excepcion) {
        return ResponseEntity.badRequest().body(Map.of("mensaje", excepcion.getMessage()));
    }
}
