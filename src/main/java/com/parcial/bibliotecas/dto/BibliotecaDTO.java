package com.parcial.bibliotecas.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BibliotecaDTO {

    private Long id;
    private String nombre;
    private String direccion;
    private String ciudad;
    private List<LibroDTO> libros;
}
