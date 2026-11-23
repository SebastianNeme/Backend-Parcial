package com.parcial.bibliotecas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistroBibliotecaDTO {

    private String nombre;
    private String direccion;
    private String ciudad;
}
