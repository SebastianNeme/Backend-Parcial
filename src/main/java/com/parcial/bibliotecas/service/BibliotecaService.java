package com.parcial.bibliotecas.service;

import com.parcial.bibliotecas.dto.BibliotecaDTO;
import com.parcial.bibliotecas.dto.RegistroBibliotecaDTO;
import com.parcial.bibliotecas.entity.Biblioteca;
import com.parcial.bibliotecas.repository.BibliotecaRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BibliotecaService {

    private final BibliotecaRepository bibliotecaRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public BibliotecaDTO registrar(RegistroBibliotecaDTO datos) {
        if (datos == null) {
            throw new IllegalArgumentException("Los datos de la biblioteca son obligatorios.");
        }

        Biblioteca biblioteca = modelMapper.map(datos, Biblioteca.class);
        biblioteca.setNombre(validar(biblioteca.getNombre(), "nombre"));
        biblioteca.setDireccion(validar(biblioteca.getDireccion(), "direccion"));
        biblioteca.setCiudad(validar(biblioteca.getCiudad(), "ciudad"));

        return modelMapper.map(bibliotecaRepository.save(biblioteca), BibliotecaDTO.class);
    }

    @Transactional(readOnly = true)
    public List<BibliotecaDTO> consultar() {
        return bibliotecaRepository.findAll(Sort.by("id")).stream()
                .map(biblioteca -> modelMapper.map(biblioteca, BibliotecaDTO.class))
                .toList();
    }

    private String validar(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El campo " + campo + " es obligatorio.");
        }
        return valor.strip();
    }
}
