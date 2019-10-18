package TP1;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {
	// write your code here
        String nombre = (JOptionPane.showInputDialog("Ingrese su nombre: "));
        System.out.println(nombre);

        int edad;

        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
            if(edad<18 & edad >0)
                System.out.println("Fulanito es menor de edad");
            else if(edad >= 18)System.out.println("Fulanito es mayor de edad");
        }while (edad!=0);
    }
}
