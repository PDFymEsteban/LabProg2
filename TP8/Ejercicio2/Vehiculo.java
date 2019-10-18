package TP8.Ejercicio2;

public interface Vehiculo {
    int VELOCIDAD_MAXIMA = 120;

    void FRENAR(int frenar);

    void ACELERAR(int acelerar);

    String PLAZAS();

    int getVelocidad();
}