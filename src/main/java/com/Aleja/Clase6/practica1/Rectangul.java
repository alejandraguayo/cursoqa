package com.Aleja.Clase6.practica1;

public class Rectangul extends Figura {
    private Integer base;
    private Integer altura;
    public Rectangul(String color, Integer base, Integer altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Integer calcularArea() {
        return base * altura;
    }
}
