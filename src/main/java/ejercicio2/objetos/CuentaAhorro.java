package ejercicio2.objetos;

public class CuentaAhorro extends CuentaBancaria{
    /*No permite realizar retiros si el saldo es menor a $100.
    Sobrescribe el metodo retirar (double monto) para verificar esta condición.*/

    private static final double SALDO_MINIMO = 100;

    public CuentaAhorro(String numeroCuenta, Cliente cliente) {
        super(500, numeroCuenta, cliente); // Saldo inicial $500
    }

    @Override
    public boolean retirar(double monto) {
        if (getSaldo() - monto >= SALDO_MINIMO) {
            return super.retirar(monto); // LLAMA AUTOMÁTICAMENTE A mostrarInformacion().
        } else {
            System.out.println("No se puede retirar. El saldo mínimo permitido es $" + SALDO_MINIMO);
            mostrarInformacion();
            return false;
        }
    }
}
