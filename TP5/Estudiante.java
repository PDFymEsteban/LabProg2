package TP5;

import com.sun.source.doctree.SeeTree;

import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int nroEstud;
    private float notaMedia;

    public Estudiante(String nombre, int nroEstud, float notaMedia){
        this.nombre=nombre;
        this.nroEstud=nroEstud;
        this.notaMedia=notaMedia;
    }


    public Estudiante() {
        this.nombre= null;
        this.nroEstud= 0;
        this.notaMedia= 0;
    }

    public static void ListarAlumnos(Estudiante[] estudiantes){
        System.out.println("\n-----------------------");

            for (int i = 0; i < estudiantes.length; i++) {
                if (estudiantes[i].nombre != null){
                System.out.println("Estudiante: "+estudiantes[i].nombre
                        +"\nNro Estudiante: "+estudiantes[i].nroEstud
                        +"\nNota Media: "+estudiantes[i].notaMedia
                        +"\n-----------------------");
            }
        }
    }

    public static void BuscarAlumno(Estudiante[] estudiantes){
        Scanner sc = new Scanner(System.in);

        System.out.println("Intrdozca el nombre del estudiante a buscar: ");
        String buscar = sc.nextLine();
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].nombre.equals(buscar));
            System.out.println("\n---------------"+
                    "\nEstudiante: "+estudiantes[i].nombre+
                    "\nNroEstud: "+estudiantes[i].nroEstud+
                    "\nNota Media: "+estudiantes[i].notaMedia);
        }

    }

    public static void BorrarAlumnos(Estudiante[] estudiantes){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del Alumno a eliminar: ");
        String borrar = sc.nextLine();
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].nombre.equals(borrar)){
                estudiantes[i].nombre = null;
                estudiantes[i].nroEstud = 0;
                estudiantes[i].notaMedia = 0;
            }
        }
    }

    public static void CambiarNota(Estudiante[] estudiantes){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del Alumno para cambiar la nota: ");
        String cambiar = sc.nextLine();

        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].nombre.equals(cambiar)){
                System.out.print("Ingrese la nueva nota: ");
                int nuevaNota = sc.nextInt();
                estudiantes[i].notaMedia = nuevaNota;
                break;
            }
        }

        for (int i = 0; i < estudiantes.length; i++) {

            if (estudiantes[i].nombre.equals(cambiar));
            System.out.println("\n---------------"+
                    "\nEstudiante: "+estudiantes[i].nombre+
                    "\nNroEstud: "+estudiantes[i].nroEstud+
                    "\nNota Media: "+estudiantes[i].notaMedia);
        }
    }
}


/*
Ejercicio 01: La Facultad
Crear un programa que conste de tres clases:
UsoFacultad: Clase principal

Facultad, con los siguientes métodos
Constructor con nombre del colegio y cantidad máxima de estudiantes.
Agregar estudiantes a la Facultad.
Listar todos los estudiantes que se encuentran en ella.
Buscar un estudiante por medio de su nombre.
Cada vez que se cree un estudiantes para la Facultad este tendrá un número de estudiantes
asignado que debe ser consecutivo y no repetitivo.
Borrar Estudiantes.
Modificar la nota media de un Estudiante, ingresando su nombre y la nueva nota media.

Estudiantes, con los siguientes métodos y características
Constructor con nombre de estudiante, nro de estudiante y nota media.
Los Estudiantes deberán asistir a una Facultad, por lo que debe existir un método que exprese dicha relación.
 */