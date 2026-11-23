package com.parcial.bibliotecas.repository;

import com.parcial.bibliotecas.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
