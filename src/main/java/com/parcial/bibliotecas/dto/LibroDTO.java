package com.parcial.bibliotecas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibroDTO {

    private Long id;
    private String titulo;
    private String autor;
    private Integer publicacion;
}
