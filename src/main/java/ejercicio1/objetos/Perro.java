package ejercicio1.objetos;

public class Perro extends Animal{

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    /*Perro:

    Sobrescribe el metodo hacerSonido() para que devuelva "El perro ladra: ¡Guau, guau!".
    */
    @Override
    public String hacerSonido() {
        return "El perro ladra: ¡Guau, guau!";
    }


}
