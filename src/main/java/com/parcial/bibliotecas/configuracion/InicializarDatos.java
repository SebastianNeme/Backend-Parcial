package com.parcial.bibliotecas.configuracion;

import com.parcial.bibliotecas.entity.Biblioteca;
import com.parcial.bibliotecas.entity.Libro;
import com.parcial.bibliotecas.repository.BibliotecaRepository;
import com.parcial.bibliotecas.repository.LibroRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class InicializarDatos implements CommandLineRunner {

    private final BibliotecaRepository bibliotecaRepository;
    private final LibroRepository libroRepository;

    @Override
    @Transactional
    public void run(String... args) {
        if (libroRepository.count() > 0) {
            return;
        }

        Biblioteca central = bibliotecaRepository.save(
                new Biblioteca("Biblioteca Central", "Calle 10 # 8-20", "Bogotá"));
        Biblioteca norte = bibliotecaRepository.save(
                new Biblioteca("Biblioteca Norte", "Carrera 15 # 100-10", "Bogotá"));

        libroRepository.saveAll(List.of(
                new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, central),
                new Libro("El coronel no tiene quien le escriba", "Gabriel García Márquez", 1961, norte)));
    }
}
