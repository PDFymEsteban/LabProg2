package TP9.Ejercicio2;

import java.lang.ref.SoftReference;

public class ComplejoDeportivo implements Presentacion, Detalles{
    private String nombre;
    private String instalacion;
    private int cantOffice;
    private int cantCanchas;
    private String deporte;
    private double superficie;

    public ComplejoDeportivo() {
    }

    public ComplejoDeportivo(String nombre, String instalacion, int cantOffice, int cantCanchas, String deporte, double superficie) {
        this.nombre = nombre;
        this.instalacion = instalacion;
        this.cantOffice = cantOffice;
        this.cantCanchas = cantCanchas;
        this.deporte = deporte;
        this.superficie = superficie;
    }

    @Override
    public String nombreComplejo() {
        return "Nombre: "+this.nombre+
                "\n-------------------------";
    }

    @Override
    public double superficie() {
        return this.superficie;
    }

    @Override
    public String cantOficinas() {
        return "Cantidad canchas: "+this.cantCanchas+
                "\n-------------------------";
    }


    @Override
    public String listarCanchas(ComplejoDeportivo[] complejos) {
        return "Nombre: "+this.nombre+
                "\nCant Canchas: "+this.cantCanchas+
                "\nSe juega: "+this.deporte+
                "\n-------------------------";
    }

    @Override
    public String cantCanchas() {
        return "Complejo "+this.nombre+"\nCant de canchas: "+this.cantCanchas
                +"\n-------------------------";
    }

    @Override
    public String getTipo() {
        return "Complejo: "+this.nombre+
                "Instalacion: "+this.instalacion;
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