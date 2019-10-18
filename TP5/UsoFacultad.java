package TP5;
//Esteban Josué Verza   Facundo Luis Ferrara    Villalba Pedro  Neston Laurore
import java.util.Scanner;

public class UsoFacultad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Facultad facu1 = new Facultad();

        int cant = facu1.CrearFacultad();

        Estudiante[] estudiantes = new Estudiante[cant];
        facu1.CargarAlumnos(estudiantes);

        Estudiante.ListarAlumnos(estudiantes);

        int op = 0;
        do {
            System.out.println("¿Qué desea hacer?\n1)Buscar Alumno 2)Borrar Alumno 3)Cambiar nota de Alumno 4)SALIR");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Estudiante.BuscarAlumno(estudiantes);
                    break;
                case 2:
                    Estudiante.BorrarAlumnos(estudiantes);
                    Estudiante.ListarAlumnos(estudiantes);
                    break;
                case 3:
                    Estudiante.CambiarNota(estudiantes);
                    break;
                case 4:
                    op = -1;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }while (op != -1);

    }
}


/*
Ejercicio 01: La Facultad
Crear un programa que conste de tres clases:
UsoFacultad: Clase principal  */