package Integrador1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {
	// write your code here


        Salas[] salas = new Salas[1];
        salas[0] = new Salas("Sala 01",3);

        salas[0].setPelicula("Jocker");

        System.out.println("Ingrese los espectadores a la sala 01");
        try {
            Scanner sc = new Scanner(System.in);

            cargarEspectadores(salas);
        }catch (InputMismatchException e){
            System.out.println("ERROR - SE CERRARÁ EL PROGRAMA");
        }


        System.out.println(salas[0].toString());
        for (int i = 0; i < salas.length; i++) {
            salas[0].getEspectadores();
            System.out.println("--------------------");
        }

        Acomodadores acomodadores = new Acomodadores("Fulano",40);
        acomodadores.setSala(salas[0]);
        acomodadores.setSueldo(50000);
        System.out.println(acomodadores.toString());
        acomodadores.getTipo();

        Salas sala1 = new Salas("Salas 01",3);
        sala1.setPelicula("Jocker");
        Espectadores[] espectadores = new Espectadores[3];
        espectadores[0] = new Espectadores("Juan",17,"A","1");
    }

    public static void cargarEspectadores(Salas[] salas){
        Scanner sc = new Scanner(System.in);

        Espectadores[] espectadores = new Espectadores[3];
        for (int i = 0; i < espectadores.length; i++) {
            try {
                System.out.println("Ingrese el nombre");
                String nom = sc.next();

                System.out.println("Edad");
                int edad = sc.nextInt();

                System.out.println("Ingrese la fila");
                String fila = sc.next();

                System.out.println("Ingrese el numero de butaca");
                String silla = sc.next();

                espectadores[i] = new Espectadores(nom,edad,fila,silla);
            }catch (Exception e){
                System.out.println("ERROR - EL PROGRAMA SE CERRARÁ");
                break;
            }

        }
        salas[0].setEspectadores(espectadores);
    }

    public static void mostrarDatos(Salas[] salas){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(salas[0].toString());
            salas[0].getEspectadores();
        }catch (Exception e){

        }
    }

}