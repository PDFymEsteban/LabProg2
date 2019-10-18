package Integrador1;

public class Empleados extends Personas{

    private double sueldo;

    public Empleados(String nombre, int edad) {

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getTipo() {
        return "es un empleado";
    }

    @Override
    public String toString() {
        return "Empleado "+getNombre()+"ª\nEdad "+getEdad()+"\nSueldo "+getSueldo()+"\n---------------";
    }
}
