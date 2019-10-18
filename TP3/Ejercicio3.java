package TP3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] nombre = new String[3];
        int [] dni = new int[3];
        int [] edad = new int[3];

        for (int i = 0; i < dni.length; i++) {
            System.out.print("Ingrese su nombre: ");
            nombre [i] = sc.next();
            System.out.print("Ingrese su dni: ");
            dni [i]= sc.nextInt();
            System.out.print("Ingrese su edad: ");
            edad [i]= sc.nextInt();
        }

        for (int i = 0; i < nombre.length; i++) {
            for (int j = 0; j < nombre.length; j++) {
            }
        }



        for (int i = 0; i < nombre.length; i++) {
            System.out.print( nombre [i]+ "     ");
        }
        System.out.println("");
        for (int i = 0; i < dni.length; i++) {
            System.out.print(  dni [i]+ "      ");
        }
        System.out.println("");
        for (int i = 0; i < edad.length; i++) {
            System.out.print( edad [i]+ "      ");
        }

    }
}
/*   <  >
Ejercicio03:
Crear una matriz que contenga datos de personas, siendo cada columna una persona diferente y cada fila los datos de las mismas.

El esquema de la matriz será el siguiente:

NOMBRE

DNI

EDAD

A modo de ejemplo, la matriz que se debería lograr sería la siguiente:

NOMBRE      Juan        Pablo       Pedro

DNI         34912312    31123987    32123123

EDAD        12          23            34

Los datos para rellenar la matriz deben ser proporcionados por el usuario.

Una vez que se llene todo el arreglo de arreglos se debe mostrar la información en la consola de una forma clara.

BONUS: ordenar alfabéticamente el arreglo.
 */