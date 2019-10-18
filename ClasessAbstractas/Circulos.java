package ClasessAbstractas;

public class Circulos extends FGeometricas{

    private double radio;

    public Circulos(double radio){
        this.radio = radio;
    }

    @Override
    public double area() {
        double resultado = (3.14*this.radio)*(3.14*this.radio);
        return resultado;
    }

    @Override
    public double perimetro() {
        return 0;
    }
}
