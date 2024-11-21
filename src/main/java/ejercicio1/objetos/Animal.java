package ejercicio1.objetos;

public class Animal {
    /*Crea una clase base llamada Animal:
    Atributos privados: nombre (String), edad (int).*/

    protected  String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /*Métodos:

    getNombre(), getEdad(), setNombre(String nombre), setEdad(int edad).

    hacerSonido() (metodo que será sobrescrito por las subclases).

        */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String hacerSonido(){
        return "NO tiene un sonido definido";
    }
}
