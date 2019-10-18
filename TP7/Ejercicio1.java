package TP7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int numero = 0;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.printf("ingrese un numero: ");
            numero=sc.nextInt();
            if (numero%2==0) {
                System.out.println("\n-------------------------");
                System.out.println("El numero ingresado es: " + numero);
                System.out.println("EL NRO ES PAR");
                System.out.println("-------------------------");
            }else {
                System.out.println("\n-------------------------");
                System.out.println("El numero ingresado es: " + numero);
                System.out.println("EL NRO ES IMAR");
                System.out.println("-------------------------");
            }
        }catch (InputMismatchException e){
            System.out.println("Solo se puede ingresar numeros enteros" +
                    "\nEl programa se cerrará");

        }
    }
}
/*
Ejercicio 01: excepciones
Crea un programa que pida al usuario introducir un número.
El programa debe devolver un mensaje especificando si el número introducido por el usuario es par o impar.
Además, el programa debe controlar la excepción si el usuario introduce texto en lugar de un valor numérico.
En caso de introducir texto, se debe advertir al usuario que “El valor introducido no es numérico.
El programa se cerrará”, terminando la ejecución del programa sin hacer nada más.
 */