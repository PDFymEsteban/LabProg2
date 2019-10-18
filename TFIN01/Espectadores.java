package Integrador1;

public class Espectadores extends Personas{

    private String fila;
    private String silla;

    public Espectadores(String nombre,int edad, String fila, String silla) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.fila = fila;
        this.silla = silla;
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getTipo() {
        return "; es un Espectador";
    }

    @Override
    public String toString() {
        return "Nombre "+getNombre()+ " - Edad "+getEdad()+getTipo();
    }
}
