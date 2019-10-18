package Excepciones;

public class Empleados extends Personas{
    private float sueldo;

    public Empleados(String nombre, float sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }
}
