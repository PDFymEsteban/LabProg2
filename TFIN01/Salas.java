package Integrador1;

public class Salas {
    private int capacidad;
    private String pelicula;
    private String nombre;

    Espectadores[] espectadores = new Espectadores[capacidad];

    public Salas(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setEspectadores(Espectadores[] espectadores) {
        this.espectadores = espectadores;
    }

    public void getEspectadores() {
        for (int i = 0; i < espectadores.length; i++) {
            System.out.println(espectadores[i].toString());
        }
    }

    @Override
    public String toString() {
        return this.nombre+" "+this.capacidad+" - Pelicula: "+this.pelicula;
    }
}
