package com.Aleja.Clase6.Practica2;

public interface Dibujable {
    void dibujar ();

    default void borrar (){
        System.out.println("Borrando figura. . . ");
    }
}
