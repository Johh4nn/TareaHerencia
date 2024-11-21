package ejercicio2.objetos;

public class CuentaCorriente extends CuentaBancaria {
    /*Incluye una comisión del 2% para cada retiro.
    Sobrescribe el metodo retirar (double monto) para aplicar la comisión
    La CuentaCorriente debe ser creada con un saldo inicial de $1000.*/
    private static final double COMISION = 0.02;

    public CuentaCorriente( String numeroCuenta, Cliente cliente) {
        super(1000, numeroCuenta, cliente);
    }

    @Override
    public boolean retirar(double monto) {
        double montoConComision = monto * (1 + COMISION);
        System.out.println("Aplicando comisión del 2%. Total a retirar: $" + montoConComision);
        return super.retirar(montoConComision);
    }
}
