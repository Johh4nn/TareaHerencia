package ejercicio2.main;

import ejercicio2.objetos.Cliente;
import ejercicio2.objetos.CuentaAhorro;
import ejercicio2.objetos.CuentaCorriente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    *
    * Ejercicio 2: Simulación de Transacciones Bancarias con Información del Cliente
    *
    Objetivo:
    Desarrollar un sistema bancario que utilice herencia para representar diferentes tipos de cuentas bancarias, asociadas a clientes.
    * Se incluirá un menú interactivo que permita realizar operaciones como ver el saldo, realizar transferencias,
    * retiros y depósitos. Además, se implementará sobreescritura de métodos para manejar características específicas de
    * cada tipo de cuenta.
    *
    *
    */
        Scanner scanner = new Scanner(System.in);

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Pérez", "123456789");
        Cliente cliente2 = new Cliente("Ana Gómez", "987654321");

        // Crear cuentas asociadas a los clientes
        CuentaCorriente cuentaCorriente = new CuentaCorriente("CC12345", cliente1);
        CuentaAhorro cuentaAhorro = new CuentaAhorro("CA54321", cliente2);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Ver información del cliente y saldo");
            System.out.println("2. Transferir entre cuentas");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Depositar dinero");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\nInformación de la Cuenta Corriente:");
                    cuentaCorriente.mostrarInformacion();
                    System.out.println("\nInformación de la Cuenta de Ahorro:");
                    cuentaAhorro.mostrarInformacion();
                }
                case 2 -> {
                    System.out.print("\nIngrese el monto a transferir de la cuenta corriente a la de ahorro: ");
                    double monto = scanner.nextDouble();
                    if (cuentaCorriente.retirar(monto)) {
                        cuentaAhorro.depositar(monto);
                        System.out.println("Transferencia realizada con éxito.");
                    } else {
                        System.out.println("Transferencia fallida. Fondos insuficientes.");
                    }
                }
                case 3 -> {
                    System.out.print("\nSeleccione la cuenta (1 para corriente, 2 para ahorro): ");
                    int tipoCuenta = scanner.nextInt();
                    System.out.print("Ingrese el monto a retirar: ");
                    double monto = scanner.nextDouble();

                    if (tipoCuenta == 1) {
                        cuentaCorriente.retirar(monto);  // Llama automáticamente a mostrarInformacion().
                    } else if (tipoCuenta == 2) {
                        cuentaAhorro.retirar(monto);    // Llama automáticamente a mostrarInformacion().
                    } else {
                        System.out.println("Cuenta no válida.");
                    }
                }

                case 4 -> {
                    System.out.print("\nSeleccione la cuenta (1 para corriente, 2 para ahorro): ");
                    int tipoCuenta = scanner.nextInt();
                    System.out.print("Ingrese el monto a depositar: ");
                    double monto = scanner.nextDouble();

                    if (tipoCuenta == 1) {
                        cuentaCorriente.depositar(monto);  // Llama automáticamente a mostrarInformacion().
                    } else if (tipoCuenta == 2) {
                        cuentaAhorro.depositar(monto);    // Llama automáticamente a mostrarInformacion().
                    } else {
                        System.out.println("Cuenta no válida.");
                    }
                }
                case 5 -> {
                    salir = true;
                    System.out.println("Gracias por usar el sistema.");
                }
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();

    }
}
