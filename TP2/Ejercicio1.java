package TP2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n=0,p=0,c=0;
        int[] a = new int[10];

        System.out.println("Ingrese 10 números enteros");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Número " + (i+1) + ": ");
            a[i] = s.nextInt();
            if(a[i] < 0)
                n++;
            if(a[i] > 0)
                p++;
            if(a[i] == 0)
                c++;
        }

        System.out.print("Arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(+a[i] + " ");
        }

        System.out.println("\nCantidad de positivos: "+p+", cantidad de negativos: "+n+", cantidad de ceros: "+c);
    }
}
