package com.Aleja.Clase4;

public class P1Estudiante {

    private Integer id;
    public String nombre;
    private String apellido;
    private Float promedio;

    public P1Estudiante() {
        this( 10, "", "", 0.0f);
    }

    public P1Estudiante(Integer id, String nombre, String apellido, Float promedio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio =  promedio;
        

    }
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre(){
        return nombre; // equivale a this.nombre
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }
}


