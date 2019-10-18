package TP3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Ingrese un número: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int [] fila : matriz) {
            for (int elem : fila) {
                System.out.print(elem + " ");
            }
            System.out.println("");
        }

        int aux;
        for (int l = 0; l < matriz.length; l++) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < matriz.length - 1; j++) {

                    if (matriz[i][j] > matriz[i][j + 1]) {
                        aux = matriz[i][j + 1];
                        matriz[i][j + 1] = matriz[i][j];
                        matriz[i][j] = aux;
                    }
                }
            }
        }

        for (int []fila2 : matriz) {
            for (int elem2 : fila2) {
                System.out.print(elem2 + " ");
            }
            System.out.println("");
        }



    }
}
/*
Ejercicio 05:
Realice un programa que genere una matriz de 3x3 con números ingresados por el usuario por medio de la consola.

Una vez terminada la carga de los elementos se debe mostrar primero la matriz cargada con los datos iniciales
y luego la matriz con los datos ordenados de mayor a menor.
 */