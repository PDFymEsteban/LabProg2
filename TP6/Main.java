package TP6;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant, largo;

        System.out.println("Ingrese la cantidad de claves que desea generar:");
        cant = sc.nextInt();
        System.out.println("Ingrese la longitud de las claves:");
        largo = sc.nextInt();


        Password[] uuid = new Password[cant];
        Password.GenerarClave(largo,uuid);
        Password.SeguridadDeClave(uuid);
        Password.MostrarClaves(uuid);
    }
}
