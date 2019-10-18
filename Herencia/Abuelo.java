package Herencia;

public class Abuelo {
    private String nombre;
    String genero;
    private int edad;
    private String residendia;

    public Abuelo(String nombre, String genero, int edad){
        this.nombre=nombre;
        this.genero=genero;
        this.edad=edad;
    }

    public String nada(){
        return "no estoy haciendo nada";
    }

}
