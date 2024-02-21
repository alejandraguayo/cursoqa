package com.Aleja.Clase3;

public class P3Operadores {
    public static void main(String[] args) {
        // OPERADORES ARITMETICOS
        int suma = 10 + 10 ;
        int division = 10/5;
        System.out.println("suma:" + suma);
        System.out.println("division:" + division);

        // OPERADORES RELACIONALES
        boolean menor = 20 < 10;
        boolean distinto = 5 != 10;
        boolean igualdad = 20==20;

        System.out.println("MENOR:" + menor);
        System.out.println("Distinto:" + distinto);
        System.out.println("Igualdad:" + igualdad);

        //OPERADORES CONDICIONALES
        boolean and =(10 < 100 ) && (20 != 5);
        boolean or = (5!=1) || (100<100);

        System.out.println("and:" + and);
        System.out.println("or:" + or);


    }
}
