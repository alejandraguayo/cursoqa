package com.Aleja.Clase6.practica1;

import java.util.ArrayList;
import java.util.List;

public class mainAbstract {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado ("rojo", 10);

        Rectangul rectangul = new Rectangul("verde", 5,8);

        Triangulo triangulo = new Triangulo("amarillo", 2, 15);

        List<Figura> listaDeFiguras = new ArrayList<>();

        listaDeFiguras.add(cuadrado);
        listaDeFiguras.add(rectangul);
        listaDeFiguras.add(triangulo);
     listaDeFiguras.forEach(figura -> System.out.println("Area: " + figura.calcularArea()));

     

        for(Figura figura : listaDeFiguras) {
            System.out.println("Area: " + figura.calcularArea());
        }
    }


}
