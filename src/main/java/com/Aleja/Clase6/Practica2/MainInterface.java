package com.Aleja.Clase6.Practica2;

import com.Aleja.Clase6.practica1.Cuadrado;
import com.Aleja.Clase6.practica1.Rectangul;
import com.Aleja.Clase6.practica1.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class MainInterface {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado ("rojo", 10);
        Rectangul rectangul = new Rectangul("verde", 5,8);
        Triangulo triangulo = new Triangulo("amarillo", 2, 15);

        List<Dibujable> listaDeDibujable = new ArrayList<>();
        listaDeDibujable.add(cuadrado);
        listaDeDibujable.add(triangulo);

        for (Dibujable dibujable : listaDeDibujable) {
            dibujable.dibujar();
            dibujable.borrar();
        }
    }
}
