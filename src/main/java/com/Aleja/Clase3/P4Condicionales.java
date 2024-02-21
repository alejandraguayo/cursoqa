package com.Aleja.Clase3;

public class P4Condicionales {
    public static void main(String[] args) {
        int var1 = 100;
        int var2 = 200;
        if (var1 < var2) {
            System.out.println("var1 es menor a var2");
        }

        int var3 = 1;
        int var4 = 10;
        if (var3 > var4) {
            System.out.println("var3 es mayor que var4");
        } else {
            System.out.println("var3 es menor que var4");
        }

        String DiaDeLaSemana = "martes";
        switch (DiaDeLaSemana) {
            case "Lunes":
                System.out.println("hoy es lunes");
                break;
            case "martes":
                System.out.println("hoy es martes");
                break;
            case "miercoles":
                System.out.println("hoy es miercoles");
                break;
            default:
                System.out.println("no existe ese dia!");
        }
        if (DiaDeLaSemana == "lunes") {
            System.out.println("hoy es lunes");

        } else if (DiaDeLaSemana == "Martes") {
            System.out.println("hoy es martes");
        } else if (DiaDeLaSemana == "Miercoles") {
            System.out.println("hoy es miercoles");
        } else {
            System.out.println("No existe ese dia!");
        }
    }
}

