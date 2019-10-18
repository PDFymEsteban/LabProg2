package Colecciones;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String cliente;
    private String nroCliente;
    private double sueldo;

    public Cliente(String cliente, String nroCliente, double sueldo) {
        this.cliente = cliente;
        this.nroCliente = nroCliente;
        this.sueldo = sueldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(String nroCliente) {
        this.nroCliente = nroCliente;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return nroCliente.equals(cliente.nroCliente);
    }

    @Override
    public int hashCode() {
        return nroCliente.hashCode();
    }
}
