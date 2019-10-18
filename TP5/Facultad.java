package TP5;

import java.util.Scanner;

public class Facultad {
    private String nombre;
    private int cantAlum;
    private int id;
    private static int countId=1;

    public Facultad(){
        this.nombre=nombre;
        this.cantAlum=cantAlum;
    }

    public int CrearFacultad(){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Ingrese el nombre de la Faclutad: ");
        this.nombre = sc.nextLine();
        System.out.printf("Ingrese la cantidad de alumnos a inscribir: ");
        this.cantAlum = sc.nextInt();
        return this.cantAlum;
    }



    public  void CargarAlumnos(Estudiante[] estudiantes) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < estudiantes.length; i++){
            sc.nextLine();
            System.out.printf("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            int nroEst = (int)(Math .random()*this.cantAlum);
            System.out.printf("Ingrese el promedio: ");
            float prom = sc.nextFloat();

            estudiantes[i] = new Estudiante(nombre, nroEst, prom);
        }
    }





}


/*


Facultad, con los siguientes métodos
Constructor con nombre del colegio y cantidad máxima de estudiantes.

Agregar estudiantes a la Facultad.
Listar todos los estudiantes que se encuentran en ella.

Buscar un estudiante por medio de su nombre.
Cada vez que se cree un estudiantes para la Facultad este tendrá un número de estudiantes
asignado que debe ser consecutivo y no repetitivo.

Borrar Estudiantes.

Modificar la nota media de un Estudiante, ingresando su nombre y la nueva nota media.

 */