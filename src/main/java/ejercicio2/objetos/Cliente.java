package ejercicio2.objetos;

public class Cliente {
    /*
    *
    * Atributos privados:
        nombre (String): Nombre del cliente.
        identificacion (String): Identificación única del cliente.
    *
    * */

    private String nombre;
    private String identificacion;

    /*Metodos:

    getNombre(): Retorna el nombre del cliente.
            getIdentificacion(): Retorna la identificación del cliente.
            mostrarInformacion(): Muestra el nombre y la identificación del cliente.*/

    public Cliente() {
    }

    public Cliente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }


    public String getIdentificacion() {
        return identificacion;
    }




    public String mostrarInformacion() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                '}';
    }
}
