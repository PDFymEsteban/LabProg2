package TP3;

public class Ejercicio4 {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= (int) (Math.random()*100);
            }
        }

        for (int [] fila: matriz) {
            for (int elem:fila) {
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


        System.out.println("");
        for (int[] fila1: matriz) {
            for (int elem2:fila1) {
                System.out.print(elem2 + " ");
            }
            System.out.println("");
        }
    }
}
/*
Ejercicio 04:
Realice un programa que genere una matriz de 3x3 con números al azar y la muestra utilizando la consola.

Una vez que muestre la matriz desordenada, debe mostrar también la matriz ordenada de menor a mayor
 */