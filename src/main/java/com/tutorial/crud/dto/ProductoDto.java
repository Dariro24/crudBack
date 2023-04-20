package com.tutorial.crud.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProductoDto {
    @NotBlank
    private String nombre;
    @Min(0)
    private Float altura;

    public ProductoDto() {
    }

    public ProductoDto(String nombre, Float altura) {
        this.nombre = nombre;
        this.altura = altura;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
