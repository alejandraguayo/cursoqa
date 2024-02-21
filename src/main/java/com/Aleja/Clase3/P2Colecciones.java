package com.Aleja.Clase3;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2Colecciones {
    public static void main(String[] args) {

        //ARRAYS
        int [] arrayDeEnteros = new int [3];

        arrayDeEnteros[0] = 100;
        arrayDeEnteros[1] = 200;
        arrayDeEnteros[2] = 300;

        System.out.println("Posicion 0:" + arrayDeEnteros [0]);
        System.out.println("Posicion 1:" + arrayDeEnteros [1]);
        System.out.println("Posicion 2:" + arrayDeEnteros [2]);

        System.out.println("Array:" + Arrays.toString(arrayDeEnteros));

        arrayDeEnteros[1] = 1000;

        System.out.println("Posicion 3:" + arrayDeEnteros[3]); // ESTO NO SE PUEDE HACER

        // LISTAS

        List <String> listDeString = new ArrayList<>();
        listDeString.add("Hola");
        listDeString.add("Cómo");
        listDeString.add("están?");

        System.out.println("La lista contiene" + listDeString);

        System.out.println("Posicion 0:" + listDeString.get(0));
        System.out.println("Posicion 2:" + listDeString.get(2));

        System.out.println("Posicion 3:" + listDeString.get(3)); // esto no se puede hacer!

        listDeString.remove(1);
        System.out.println("La lista contiene:" + listDeString);



    }
}
