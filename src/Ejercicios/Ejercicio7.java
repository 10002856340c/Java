package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        Scanner variable = new Scanner(System.in);
        System.out.println("Digite el primer numero : ");
        int numero = variable.nextInt();
        Scanner variable2 = new Scanner(System.in);
        System.out.println("Digite el segundo numero :");
        int numero2 = variable2.nextInt();
        System.out.println("La potencia de los dos numeros es : " + Math.pow(numero, numero2) + "\n");
        Scanner numerodecimal = new Scanner(System.in);
        System.out.println("Por favor imprime un numero decimal con coma : " + "\n");
        float numerodeci = numerodecimal.nextFloat();
        System.out.println("el numero digitado es  " + numerodeci
                + " por lo cual quedaria redondeado de la siguiente forma : " + Math.round(numerodeci));

    }
}