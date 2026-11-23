package com.parcial.bibliotecas.repository;

import com.parcial.bibliotecas.entity.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {
}
