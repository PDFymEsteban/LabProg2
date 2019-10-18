package TP2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = new int[10];

        System.out.println("Ingrese 10 números enteros");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            a[i] = s.nextInt();
            if(a[i] % 2 == 0)
                a[i]=a[i]/2;
        }

        System.out.println("Arreglo con los números pares a la media: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}

/*
* Ejercicio 2. Media en posiciones pares del Array
En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola.
Los números se almacenarán en un array y el programa calculará la media de los números introducidos en las posiciones pares del array.
* (Debes utilizar el operador módulo “%”).*/