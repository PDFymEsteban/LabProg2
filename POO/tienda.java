package POO;

import javax.swing.*;
import java.util.Scanner;

public class tienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamaño de la pantalla: ");
        int tamaño = sc.nextInt();
        Movil celular = new Movil(tamaño);


        System.out.print("Capacidad: ");
        int capacidad = sc.nextInt();
        celular = new Movil(capacidad);


        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        celular = new Movil(precio);


        System.out.print("Cámara: ");
        int camara = sc.nextInt();
        celular = new Movil(camara);


        System.out.print("Tipo: ");
        String tipo = sc.nextLine();
        celular = new Movil(tipo);


        System.out.println(celular.getInfo());
        System.out.println(celular.getInfo());
        System.out.println(celular.getInfor());
        System.out.println(celular.getInfo());
        System.out.println(celular.getInform());
    }
}
