package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cThrows {

    public static void main(String[] args) {

        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Introducir datos");
        System.out.println("2. Salir del programa");

        Scanner sc = new Scanner(System.in);

        int opcion = sc.nextInt();
            try {
                pedirDatos();
            }catch (InputMismatchException e){
                System.out.println("Error al introducir datos");
            }
        if (opcion == 1){
            pedirDatos();
        }else System.out.println("ADIOS");
    }

    public static void pedirDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre, por favor");
        String nombre = sc.nextLine();
        System.out.println("Introduzca su edad, por favor");
        int edad = sc.nextInt();

        System.out.println(nombre+" el año siguiente tendrá "+(edad+1));
    }



}
