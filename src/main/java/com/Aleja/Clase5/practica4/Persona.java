package com.Aleja.Clase5.practica4;

/*
Crear una clase (padre) Persona y las clases Alumno y Profesor que hereden de Persona.
Persona debe tener los atributos nombre y apellido (ambos strings).
Alumno debe tener los atributos matrícula (string), nota (integer) y lista de materias (lista de string)
Profesor debe tener el atributo lista de alumnos (lista de Alumno)

Todas las clases deben contar con sus constructores correspondientes y métodos getters & setters
Crear una clase (padre) Persona y las clases Alumno y Profesor que hereden de Persona.
Persona debe tener los atributos nombre y apellido (ambos strings).
Alumno debe tener los atributos matrícula (string), nota (integer) y lista de materias (lista de string)
Profesor debe tener el atributo lista de alumnos (lista de Alumno)

Todas las clases deben contar con sus constructores correspondientes y métodos getters & setters

 */
public class Persona {
    public String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    protected void saltar (){
        System.out.println("Estoy saltando");
    }

    public void saludar() {
        System.out.println("Hola, como estan?");

    }
    }

