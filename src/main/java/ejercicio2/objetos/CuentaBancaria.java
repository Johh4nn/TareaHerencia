package ejercicio2.objetos;

public class CuentaBancaria {
    /*
    *
    * saldo (double): Representa el monto disponible en la cuenta.

       numeroCuenta (String): Identificador único de la cuenta.
      cliente (Cliente): Representa al titular de la cuenta.

    * */
    protected double saldo;
    protected String numeroCuenta;
    protected Cliente cliente;

    /*Métodos:

    getSaldo(): Retorna el saldo disponible.
    getNumeroCuenta(): Retorna el número de cuenta.
    getCliente(): Retorna la información del cliente.*/

    public CuentaBancaria(double saldo, String numeroCuenta, Cliente cliente) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }


    //Depositar(double monto): Incrementa el saldo según el monto ingresado.
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso de $" + monto + "."); // NUEVA LÍNEA
        } else {
            System.out.println("El monto debe ser mayor a cero.");
        }
        mostrarInformacion();
    }



    //Retirar(double monto): Realiza un retiro verificando si hay fondos suficientes. Este metodo será sobrescrito por las subclases.

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto + ".");  // NUEVA LÍNEA
            mostrarInformacion();  // NUEVA LÍNEA: Llama automáticamente para mostrar el estado actualizado.
            return true;
        } else {
            System.out.println("Fondos insuficientes o monto no válido.");  // NUEVA LÍNEA
            mostrarInformacion();
            return false;
        }
    }

    public void mostrarInformacion() {
        cliente.mostrarInformacion();
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }


}
