package com.Aleja.Clase6.practica1;

import com.Aleja.Clase6.Practica2.Dibujable;

public class Triangulo extends Figura implements Dibujable {
    private  Integer base;
    private Integer altura;

    public Triangulo(String color, Integer base, Integer altura) {
        super(color);
        this.base = base;
        this.altura = altura;

    }

    @Override
    public Integer calcularArea() {
        return (base * altura) / 2;

    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando el triangulo . . .");
    }
}
