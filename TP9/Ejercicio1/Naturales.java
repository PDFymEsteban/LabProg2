package TP9;

import java.util.Scanner;

public class Naturales extends Numeros implements Operaciones{

    private double a;

    public Naturales(double a) {
        this.a = a;
    }

    @Override
    public void sumar(Numeros nro) {
        // TODO Auto-generated method stub

    }

    @Override
    public void restar(Numeros nro) {
        // TODO Auto-generated method stub

    }

    public String getValor() {
        return "valor: "+this.a;
    }


}
/*
Ejercicio 01:
El programa pedir&aacute; la cantidad de n&uacute;meros a cargar.
Los n&uacute;meros ser&aacute;n cargados hasta llenar el array.
Cada n&uacute;mero cargado ser&aacute; un objeto dentro de un arrays de objetos.
Las operaciones s&oacute;lo podr&aacute;n ser realizadas entre objetos de tipo
n&uacute;mero que fueron creados.
Se debe evitar el error de divisi&oacute;n por 0 devolviendo el resultad
o &ldquo;indeterminaci&oacute;n&rdquo;.
El usuario debe poder solicitar las siguientes operaciones.
Que ser&aacute;n realizadas por una clase que reciba como par&aacute;metro un array de objetos n&uacute;meros:
Suma de todos los n&uacute;meros naturales.
Suma de todos los n&uacute;meros complejos.
Listado de n&uacute;mero naturales ordenados de menor a mayor separados por una coma.
Listado de los n&uacute;meros complejos.
Las operaciones sobre los objetos n&uacute;meros deben realizarse
en una interfaz implementada por cada objeto de tipo n&uacute;mero:
Sumar el objeto a otro objeto
Dividir el objeto por otro objeto
Restar el objeto a otro objeto
Multiplicar el objeto con otro objeto
El programa debe poder crear tambi&eacute;n n&uacute;meros complejos, por lo que en la creaci&oacute;n de cada objeto se debe poder crear tanto n&uacute;meros naturales como complejos.
Las operaciones de la interfaz debe poder ser aplicada a cualquier tipo de n&uacute;meros (complejos y naturales).
*/