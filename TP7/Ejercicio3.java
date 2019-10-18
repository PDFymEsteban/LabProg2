package TP7;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = 0;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce un número: ");
            try {
                numero = sc.nextInt();
                if (numero % 2 == 0)
                    System.out.println("---------------" +
                        "\nEL NRO ES PAR" +
                        "\n---------------");
                else System.out.println("---------------" +
                        "\nEL NRO ES IMPAR" +
                        "\n---------------");
            } catch (Exception e) {
                System.out.println("---------------" +
                        "\n<ERROR> Ingrese nuevamente" +
                        "\n---------------");
                numero = -1;
            }
        }while (numero == -1);
    }
}
/*
Ejercicio 03: excepciones
Crea un programa que pida al usuario introducir un número.
El programa debe devolver un mensaje especificando si el número introducido por el usuario es par o impar.
Además, el programa debe controlar la excepción si el usuario introduce texto en lugar
de un valor numérico y debe pedir que ingrese nuevamente el número. Esta acción se repetirá hasta que
el usuario ingrese un número. El programa se cerrará”, terminando la ejecución del programa sin hacer nada más.
 */