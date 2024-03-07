package com.Aleja.Clase5.practica5;

import com.Aleja.Clase5.practica4.Alumno;
import com.Aleja.Clase5.practica4.Persona;
import com.Aleja.Clase5.practica4.Profesor;
import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    /*
    En una clase que contenga main, instanciar las clases hijas y una lista de Personas.
    Agregar a la lista los objetos instanciados y mediante un bucle acceder a cada elemento de la lista y usar el método saludar
    */

    public static void main(String[] args) {
        List<String> materias = new ArrayList<>();
        materias.add("Fisica");

        Alumno alumno = new Alumno("pepe", "pepito","abc",6, materias);

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno);

        Profesor profesor = new Profesor("jose", "perez",alumnos);

        NoDocente noDocente = new NoDocente("no", "docente");


        List<Persona> personas = new ArrayList<>();
        personas.add(alumno);
        personas.add(profesor);
        personas.add(noDocente);

        for (Persona p : personas) {
            p.saludar();
        }

        profesor.calificar(10);
        profesor.calificar(2);







    }
}
