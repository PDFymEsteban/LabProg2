package TP3;

public class Ejercicio2 {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz [i] [j] = (int) (Math.random() * 100);
                
            }
        }

        for (int []fila : matriz) {
            for ( int elem : fila) {
                System.out.print(elem + " ");
            }
            System.out.println("");
        }
    }
}
/*
Ejercicio 02:
Crear una matriz de 3 x 3 con elementos generados de forma aleatoria por medio del método random() de la clase Math. 

Una vez que se genere el array de array mostrar los elementos cargados utilizando la consola. 
 */