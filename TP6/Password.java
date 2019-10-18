package TP6;

import org.w3c.dom.ls.LSOutput;
import javax.swing.*;

import java.util.Scanner;
import java.util.UUID;

public class Password {
    private int longitud;
    private String uuid;
    private String seguridad;

    public Password(){
    }

    public String getUuid() {
        return uuid;
    }

    public int getLongitud() {
        return longitud;
    }

    public static void GenerarClave(int a, Password[] uuid) {
        String clave1,clave2;
        for (int i = 0; i < uuid.length; i++) {
            if (a % 2 == 0){
                clave1 = (String) UUID.randomUUID().toString().toUpperCase().subSequence(0, (a/2));
                clave2 = (String) UUID.randomUUID().toString().subSequence(0, (a/2));}
            else {
                clave1 = (String) UUID.randomUUID().toString().toUpperCase().subSequence(0, (a/2));
                clave2 = (String) UUID.randomUUID().toString().subSequence(0, (a/2)+1);
            }
            uuid[i] = new Password();
            uuid[i].uuid = clave1 + clave2;
            uuid[i].longitud = a;
        }
    }



    public static void SeguridadDeClave(Password[] uuid){
        int numeros = 0;
        int letrasMayus = 0;
        int letrasMinus = 0;
        for (int i = 0; i < uuid.length; i++) {
            if (Character.isDigit(uuid[i].uuid.charAt(i)))
            numeros++;
            else if (Character.isUpperCase(uuid[i].uuid.charAt(i)))
                letrasMayus++;
            else if (Character.isLowerCase(uuid[i].uuid.charAt(i)))
                letrasMayus++;
        }

        for (int i = 0; i < uuid.length; i++) {
            if (numeros >= 5 && letrasMayus >= 2 && letrasMinus >= 1){
                uuid[i].seguridad = "Segura.";
            }else uuid[i].seguridad = "Débil.";
        }

    }

    public static void MostrarClaves(Password[] uuid){

        for (int i = 0; i < uuid.length; i++) {
            System.out.println("-------------------------"
                                +"\nClave "+(i+1)+": "+uuid[i].uuid
                                +"\nLongitud: "+uuid[i].longitud
                                +"\nLa contraseña es "+uuid[i].seguridad
                                +"\n-------------------------\n");
        }
    }

}
