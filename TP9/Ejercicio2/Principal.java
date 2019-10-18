package TP9.Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ComplejoDeportivo[] complejos = new ComplejoDeportivo[3];

        complejos[0] = new ComplejoDeportivo("Municipal","Sala Cubierta",2,2,"Voley",500);
        complejos[1] = new ComplejoDeportivo("Bicentenario","Aire Libre",2,6,"Futbol 5",240);
        complejos[2] = new ComplejoDeportivo("Eva Perón","Aire libre",2,12,"Basquetball",1200);

        menu(complejos);
    }

    public static void menu(ComplejoDeportivo[] complejos){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do{
            System.out.println("Ingrese una opcion" +
                    "\n1-Listar complejos 2-Ver el tipo de instalacion 3-Listar nombres 4-Ver superfice 5-Cant de canchas 6-Salir");
            try {
                op = sc.nextInt();
                    switch (op){
                        case 1:
                            for (int i = 0; i < complejos.length; i++) {
                                System.out.println(complejos[i].listarCanchas(complejos));
                            }
                            break;
                        case 2:
                            for (int i = 0; i < complejos.length; i++) {
                                System.out.println(complejos[i].getTipo());
                            }
                            break;
                        case 3:
                            for (int i = 0; i < complejos.length; i++) {
                                System.out.println(complejos[i].nombreComplejo());
                            }
                            break;
                        case 4:
                            for (int i = 0; i < complejos.length; i++) {
                                System.out.println("Uperficie: " + complejos[i].superficie() + "\n-------------------------");
                            }
                            break;
                        case 5:
                            for (int i = 0; i < complejos.length; i++) {
                                System.out.println(complejos[i].cantCanchas());
                            }
                            break;
                        case 6:
                            System.out.println("GRACIAS POR SU TIEMPO");
                            op = 6;
                            break;
                        default:
                            System.out.println("<error> opcion erronea");
                            break;
                    }

            }catch (InputMismatchException e){
                System.out.println("Ingrese solo numeros naturales");
            }
        }while (op != 6);
    }
}
/*
Se plantea desarrollar un programa Java que permita simular una instalación deportiva
es un recinto delimitado donde se practican deportes. El programa debe tener métodos que permitan como mínimo las siguientes operaciones:
Un método que me permita saber qué tipo de instalación es.
Un método double que muestre la superficie del edificio.
Ver el nombre de la instalación.
Cantidad de oficinas de las que dispone.
Cantidad de canchas que posee.
Listar las canchas que posee e indicar el tipo de deporte que se juega en cada una.
Definir por lo menos dos interfaces y una clase que implemente ambas interfaces para representar la situación anterior.
En una clase con el método main, crear un Array que contiene tres polideportivos y dos edificios de oficinas }
y utilizando un iterator, recorrer la colección y mostrar los atributos de cada elemento.
 */