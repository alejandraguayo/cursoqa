package com.Aleja.Clase6.practica4;

public class Dvd {
    public void reproducir() {
        System.out.println("reproduciendo contenido");

        throw new ReproducirException();
    }

    public void detener () throws StopException {
        System.out.println("Deteniendo contenido");

        throw  new StopException();


}
}
