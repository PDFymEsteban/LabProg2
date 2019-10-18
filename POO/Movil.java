package POO;

public class Movil {

    int tamañoPantalla;

    public Movil(int tamañoPantalla){
        this.tamañoPantalla = tamañoPantalla;
    }

    public int getInfo(){
        return this.tamañoPantalla;
    }

    int capacidad;
    double precio;
    int camara;
    String tipo;

    public Movil(double precio){
        this.precio = precio;
    }

    public double getInfor(){
        return this.precio;
    }

    public Movil(String tipo){
        this.tipo = tipo;
    }

    public String getInform(){
        return this.tipo;
    }

}
