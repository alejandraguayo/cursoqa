package com.Aleja.Clase6.ejercicio_herencia;

import java.sql.SQLOutput;

public class MainHerencia {
    /* En el método main, crea una instancia de la clase Vehiculo con
   los valores "Toyota", "Corolla" y 2020. Luego, crea una instancia
   de la clase Coche con los valores "Ford", "Mustang", 2021 y
   5000.
   Imprime los detalles del vehículo y del coche utilizando los
    para cada objeto.
 */
        public static void main(String[] args) {
            Vehiculo vehiculo = new Vehiculo("Toyota","Corolla", 2020);
            Coche coche = new Coche("Ford","Mustang",2021,5000);

            System.out.println("Datos de vehiculo:");
            System.out.println("Vehiculo marca:" + vehiculo.getMarca());
            System.out.println("Vehiculo modelo:" + vehiculo.getModelo());
            System.out.println("Vehiculo anio:" + vehiculo.getAnio());

            System.out.println("Datos de coche:");
            System.out.println("Coche marca:" +  coche.getMarca());
            System.out.println("Coche modelo:" + coche.getModelo());
            System.out.println("Coche anio:" + coche.getAnio());
            System.out.println("Coche cilindrada:" +  coche.getCilindrada());

            System.out.println();
            vehiculo.acelerar();
            coche.acelerar();


    }

}