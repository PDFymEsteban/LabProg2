package Empresa;

public class UsoEmpleado extends Persona{

    private String nombre;
    private double sueldo;
    private int id;
    private static int countId=1;

    public UsoEmpleado(String nombre, double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
        this.id=this.countId;
        this.countId++;
    }

    public String getDatos() {
        return "\n------------"+
                "\nNombre: "+this.nombre+
                "\nID: "+this.id+
                "\n-----------";
    }

    public double getSueldo(){
        return this.sueldo;
    }

    @Override
    public String getNombre(){
        return this.nombre;
    }


}
