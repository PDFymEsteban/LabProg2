package Colecciones;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    public static void main(String[] args) {


        Cliente cliente1 = new Cliente("Gerardo", "12345", 40500);
        Cliente cliente2 = new Cliente("XUxa", "54321", 32000);
        Cliente cliente3 = new Cliente("Fulanito", "12435", 30000);
        Cliente cliente4 = new Cliente("Fulanita", "13254", 42000);

        //cliente1 = cliente2;
        //if (cliente1.equals(cliente3)) System.out.println("SON IGUALES");
        //else System.out.println("NO SON IGUALES");

        //System.out.println(cliente1.getCliente().hashCode() + " " + cliente3.getCliente().hashCode());
        //System.out.println(cliente4.getCliente().hashCode() + " " + cliente2.getCliente().hashCode());



        Set<Cliente> clientesBanco = new HashSet<Cliente>();

        clientesBanco.add(cliente1);
        clientesBanco.add(cliente2);
        clientesBanco.add(cliente3);
        clientesBanco.add(cliente4);
        for (Cliente cliente : clientesBanco) {
            //mostrar el elemento
            System.out.println(cliente.getCliente() + " " + cliente.getNroCliente() + " $ " + cliente.getSueldo());
        }


    }
}
