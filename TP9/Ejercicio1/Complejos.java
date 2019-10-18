package TP9;

public class Complejos extends Numeros implements Operaciones{

    private double a;
    private double b;

    public Complejos(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void sumar(Numeros nro) {
        // TODO Auto-generated method stub

    }

    @Override
    public void restar(Numeros nro) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getValor() {
        // TODO Auto-generated method stub
        return "valor: ("+this.a+","+this.b+")";
    }

}