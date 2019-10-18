package TP8.Ejercicio3;

public interface Vehiculo {
    int VELOCIDAD_MAXIMA = 120;

    void FRENAR();

    void ACELERAR(int acelerar);

    String PLAZAS();

    int getVelocidad();
}