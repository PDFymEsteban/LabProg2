package TP7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = 0;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.printf("ingrese un numero entre el 1 y el 100: ");
            numero=sc.nextInt();
            rango(numero);
        }catch (FueraDeRango e){
            System.out.println(e.getMessage());

        }
    }

    public static void rango(int nro) throws FueraDeRango{
        if (nro < 1 || nro > 100)
            throw new FueraDeRango("El número está fuera de rango");
        else System.out.println("El numeros igresado es correcto");
    }
}
