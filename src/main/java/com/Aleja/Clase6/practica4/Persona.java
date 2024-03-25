package com.Aleja.Clase6.practica4;

public class Persona {
    private Dvd dvd;
    public  Persona (Dvd dvd ){
        this.dvd = dvd;
    }
    public void mirarPelicula() {
        dvd.reproducir();
    }

    public void irADormir() throws StopException {
        dvd.detener();
    }
}

