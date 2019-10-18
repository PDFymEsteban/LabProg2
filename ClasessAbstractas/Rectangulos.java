package ClasessAbstractas;

public class Rectangulos extends FGeometricas{

    private double base;
    private double altura;

    public Rectangulos(double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area() {
        double resultado = this.base*this.altura;
        return resultado;
    }

    @Override
    public double perimetro() {
        return 0;
    }
}
