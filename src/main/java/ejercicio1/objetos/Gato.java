package ejercicio1.objetos;

public class Gato extends Animal{

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String hacerSonido() {
        return "El perro maulla: ¡Miau!";
    }
}
