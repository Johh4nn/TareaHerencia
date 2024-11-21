package ejercicio1.main;

import ejercicio1.objetos.Gato;
import ejercicio1.objetos.Perro;

public class Main {
    public static void main(String[] args) {

        /*Ejercicio 1: Herencia y atributos privados

        Descripción:

            Crea un sistema donde se represente una jerarquía de animales.
            Todos los animales tienen un nombre y una edad (atributos privados). Algunos animales tienen un
            metodo adicional que describe su acción característica.

        */

        // Crear instancias de Perro y Gato
        Perro miPerro = new Perro("Rex", 5);
        Gato miGato = new Gato("Michi", 3);

        // Mostrar información y sonidos
        System.out.println("Mi perro se llama " + miPerro.getNombre() + ", tiene " + miPerro.getEdad() +
                " años y dice: " + miPerro.hacerSonido());
        System.out.println("Mi gato se llama " + miGato.getNombre() + ", tiene " + miGato.getEdad() +
                " años y dice: " + miGato.hacerSonido());

    }
}