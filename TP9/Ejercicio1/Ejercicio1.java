package TP9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int cant = pedirTamañoArray();
        Numeros[] numeros = new Numeros[cant];
        //System.out.println(numeros.length);

        for (int i = 0; i < numeros.length; i++) {

        }
    }

    public static int pedirTamañoArray(){
        Scanner entrada = new Scanner(System.in);

        int cant=0;
        System.out.println("Ingrese el tamaño del array q desea");
        try {
            cant = entrada.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Ingrese un numero natural");
            cant = pedirTamañoArray();
        }
        return cant;
    }

    public static void crearNumeros(Numeros[] nro){
        Scanner entrada = new Scanner(System.in);

        System.out.println("elija el tipo de numero:    1>Natural 2>Complejo");
        try {
            int op = entrada.nextInt();

            for (int i = 0; i < nro.length; i++) {
                switch (op){
                    case 1:
                        System.out.println("Ingrese un numero");
                        double a = entrada.nextDouble();
                        nro[i] = new Naturales(a);
                        break;
                    case 2:
                        System.out.println("Ingrese el numero real");
                        a = entrada.nextDouble();
                        System.out.println("Ingrese el numero imaginario");
                        double b = entrada.nextDouble();
                        nro[i] = new Complejos(a,b);
                        break;
                    default:
                        System.out.println("<opcion erronea>");
                        i--;
                        break;
                }
            }

        }catch (InputMismatchException e){

        }

    }
}
/*
El programa pedirá la cantidad de números a cargar. Los números serán cargados hasta llenar el array.
Cada número cargado será un objeto dentro de un arrays de objetos.
Las operaciones sólo podrán ser realizadas entre objetos de tipo número que fueron creados.
Se debe evitar el error de división por 0 devolviendo el resultado “indeterminación”.
El usuario debe poder solicitar las siguientes operaciones. Que Serán realizados por una clase que reciba como parámetro un array de objetos números:
Suma de todos los números naturales.
Suma de todos los números complejos.
Listado de número naturales ordenados de menor a mayor separados por una coma.
Listado de los números complejos.
Las operaciones sobre los objetos números deben realizarse en una interfaz implementada por cada objeto de tipo número:
Sumar el objeto a otro objeto
Restar el objeto a otro objeto
Multiplicar el objeto con otro objeto
El programa debe poder crear también números complejos, por lo que en la creación de cada objeto se debe poder crear tanto números naturales como complejos.
Las operaciones de la interfaz debe poder ser aplicada a cualquier tipo de números (complejos y naturales).
 */