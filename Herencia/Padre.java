package Herencia;

public class Padre extends Abuelo{
    public Padre(String nombre, String genero, int edad){
        super(nombre, genero, edad);
    }

    public void cambiarSexo(){
        if (super.genero == "m"){
            super.genero = "f";
        } else super.genero = "m";

    }

}
