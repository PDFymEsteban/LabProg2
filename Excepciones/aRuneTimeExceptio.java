package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class aRuneTimeExceptio {

    public static void main(String[] args) {


        int num1=0,num2=0, result=0;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.printf("primer numero: ");
            num1 = sc.nextInt();

            System.out.printf("segundo numero: ");
            num2 = sc.nextInt();

            try{
                result = num1/num2;
                System.out.println(num1+" / "+num2+" = "+result);
            }catch (Exception e){

                System.out.println("No se puede dividir por 0 porque da infinito");
            }

        }catch (InputMismatchException e){
            System.out.println("Solo se pueden ingresar numeros enteros");
        }



    }
}
