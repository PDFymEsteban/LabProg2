package TP4;

import java.util.Scanner;

public class CuentaCorriente {

    private String nombre;
    private double saldo;
    private int numeroCuenta;

    int monto;


    public CuentaCorriente(String nombre, double saldo, int numeroCuenta){
        this.nombre = nombre;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public CuentaCorriente(){
        this.nombre = null;
        this.saldo = 0;
        this.numeroCuenta = 0;
    }

    public void depositar(double monto) {
        this.saldo = this.saldo + monto;
    }

    public void extraer(double monto){
        this.saldo = this.saldo - monto;
    }

    public static void Transferencia(int i, int j, double monto, CuentaCorriente[] cuentas){
        cuentas[i].extraer(monto);
        cuentas[j].depositar(monto);
    }

    public double verSaldo(){
        return this.saldo;
    }

    public  String verInfo(){
        return "\n-----------\n"
                        +"Nombre: "+ this.nombre
                        +"\nSaldo: "+this.saldo
                        +"\nNroCuenta: "+this.numeroCuenta
                        +"\n-----------\n";
    }


    public static void CargarCuentas(CuentaCorriente[] cuentas){
        Scanner sc = new Scanner(System.in);

        for (int i = 0;i < cuentas.length;i++) {
            System.out.print("Nombre: ");
            String nom = sc.next();
            System.out.print("Saldo Incial: ");
            double sal = sc.nextDouble();
            System.out.print("Nro Cuenta: ");
            int nroCuenta = sc.nextInt();

            cuentas[i] = new CuentaCorriente(nom, sal, nroCuenta);
        }
    }

    public static void ListarCuentas(CuentaCorriente[] cuentas){
        for (int i = 0;i < cuentas.length;i++){
            System.out.print("\nTitular: " + cuentas[i].nombre);
            System.out.printf("\nSaldo Incial: " + cuentas[i].saldo);
            System.out.print("\nNroCuenta: " + cuentas[i].numeroCuenta);
            System.out.print("\n---------------------\n");
        }
    }

    public static int SeleccionarCuenta(int i, CuentaCorriente[] cuentas){
        for (int j = 0; j < cuentas.length; j++) {
            if (cuentas[j].numeroCuenta == i)
                return j;
        }
        return -1;
    }




}

/*
Crear un programa que contenga una clase capaz de crear objetos de tipo “Cuenta Corriente”
como si de un banco se tratase.

La clase tendrá el nombre de “CuentaCorriente” y construirá objetos de tipo cuenta corriente
con tres propiedades:
1. Nombre del titular (String).
2. Saldo inicial de la cuenta corriente (Double).
3. No de cuenta corriente (Long). Este campo será creado de forma aleatoria por la clase
CuentaCorriente.

Además, la clase tendrá los correspondientes métodos setters y getters que deberán realizar
las siguientes tareas:
● Poder ingresar dinero en una cuenta.
● Poder sacar dinero de una cuenta.
● Devolver el saldo de una cuenta.
● Devolver los datos de una cuenta (titular, saldo y nro de cuenta)
● Hacer transferencias de dinero entre dos cuentas

El sistema debe tener un panel por consola que permita al usuario ejecutar estas acciones a su
gusto.
 */