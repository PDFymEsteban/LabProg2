package TP3;

import java.util.Calendar;

public class Ejercicio1 {
    public static void main(String[] args) {
        int [] matriz = new int[100];
        int cont = 0;

        for (int i = 0; i < matriz.length; i++) {

            matriz[i] = (int) (Math.random() * 100);

            do {
                if (matriz[cont] == matriz[i]) {
                    matriz[i] = (int) (Math.random() * 100);
                    cont = 0;
                }
                else cont++;
            }while (cont < i);

        }

        for (int dimencion :matriz) {
                System.out.print(dimencion + " ");
        }

    }
}
/*Ejercicio 01:
Crear un array de 100 elementos que guarde en cada una de las posiciones un número aleatorio entre 1 y 100.
El programa debe imprimir en consola todos los valores almacenados en el array. Utiliza un bucle for-each para leer los valores almacenados.
(Debes utilizar el método random() de la clase Math para poder rellenar los elementos del array.

BONUS: Verificar que el número no se repita.*/