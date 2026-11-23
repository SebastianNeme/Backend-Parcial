package com.parcial.bibliotecas.controller;

import com.parcial.bibliotecas.dto.BibliotecaDTO;
import com.parcial.bibliotecas.dto.RegistroBibliotecaDTO;
import com.parcial.bibliotecas.service.BibliotecaService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bibliotecas")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class BibliotecaController {

    private final BibliotecaService bibliotecaService;

    @PostMapping
    public ResponseEntity<BibliotecaDTO> registrar(@RequestBody RegistroBibliotecaDTO datos) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bibliotecaService.registrar(datos));
    }

    @GetMapping
    public ResponseEntity<List<BibliotecaDTO>> consultar() {
        return ResponseEntity.ok(bibliotecaService.consultar());
    }
}
