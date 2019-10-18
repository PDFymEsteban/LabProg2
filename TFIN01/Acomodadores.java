package Integrador1;

public class Acomodadores extends Empleados implements ParaAcomodadores{
    private String nroSala;
    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    @Override
    public String getSala() {
        return this.nroSala;
    }

    @Override
    public void setSala(Salas sala) {
        this.nroSala = sala.getNombre();
    }

    @Override
    public String getTipo() {
        return "es un Acomodador";
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" - Edad: "+getEdad()
                +" - Sueldo: "+getSueldo()
                +"\nAsignado a "+getSala()
                +"\n"+getNombre()+" "+getTipo();
    }
}
