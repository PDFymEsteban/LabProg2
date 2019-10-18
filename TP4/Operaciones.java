package TP4;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de cuentas a ingresar: ");
        int cantCuentas = sc.nextInt();
        CuentaCorriente[] cuentas = new CuentaCorriente[cantCuentas];


        CuentaCorriente.CargarCuentas(cuentas);
        CuentaCorriente.ListarCuentas(cuentas);
        int seguir = 1;
        do {
            System.out.println("\n\nIngrese la acción a realizar");
            System.out.println("1-Ingresar Dinero\t2-Retirar Dinero\t3-Hacer Transferncia\t4-SALIR");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el NroCuenta a realizar el depósito: ");
                    int indice = sc.nextInt();
                    indice = CuentaCorriente.SeleccionarCuenta(indice, cuentas);
                    System.out.print("Ingrese el monto a depositar: ");
                    double monto = sc.nextDouble();
                    cuentas[indice].depositar(monto);
                    System.out.println(cuentas[indice].verSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese el NroCuenta a retirar: ");
                    indice = sc.nextInt();
                    indice = CuentaCorriente.SeleccionarCuenta(indice, cuentas);
                    System.out.printf("Ingrese el monto a retirar: ");
                    monto = sc.nextDouble();
                    cuentas[indice].extraer(monto);
                    System.out.println(cuentas[indice].verInfo());
                    break;
                case 3:
                    System.out.printf("Ingrese el Nro de cuenta de origen: ");
                    indice = sc.nextInt();
                    indice = CuentaCorriente.SeleccionarCuenta(indice, cuentas);
                    System.out.printf("Ingrese el Nro de cuenta de destino: ");
                    int indice2 = sc.nextInt();
                    indice2 = CuentaCorriente.SeleccionarCuenta(indice2, cuentas);
                    System.out.printf("Ingrese el monto a transferir: ");
                    monto = sc.nextDouble();
                    CuentaCorriente.Transferencia(indice, indice2, monto, cuentas);
                    System.out.println("----------\n" + cuentas[indice].verSaldo());
                    System.out.println("----------\n" + cuentas[indice2].verSaldo() + "\n----------");
                    break;
                case 4:
                    System.out.println("¡¡GRACIAS POR USAR NUESTROS REVICIOS, DIOS LE BENDIGA!!");
                    seguir = -1;
                    break;
                default:
                    System.out.println("Opción errónea");
                    break;
            }
        }while (seguir != -1);


    }


}
/*
Ejercicio 01:
Crea una clase capaz de crear cuentas corrientes bancarias con las siguientes características:
● Nombre de clase: CuentaCorriente.
● Propiedades:
○ saldo (double)
○ nombreTitular (String)
○ numeroCuenta (long)
● Constructor con dos parámetros:
○ nombreTitular (String)
○ saldo (double)
○ Este constructor se encargará de establecer un nombre de titular para la cuenta
corriente, un saldo inicial y asignará un no a la cuenta corriente de tipo long de
forma aleatoria

● Métodos:
○ 2 setter: permitirán hacer ingresos y reintegros en un objeto de tipo
CuentaCorriente.
○ 2 getter: Permitirán obtener saldo de la cuenta y datos generales de una
CuentaCorriente.
○ 1 método adicional: permitirá realizar transferencias de dinero de una cuenta a
otra.

Crea una clase principal con el nombre de UsoCuenta. Crea dos instancias de CuentaCorriente
con el nombre de Cuenta1 y Cuenta2. Haz una transferencia de Cuenta1 a Cuenta2 por un
importe de $200. Imprime los datos de las dos cuentas en consola.
 */