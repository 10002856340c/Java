package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        // primero creamos los scanner es decir los datos que el usuario va entrear por
        // teclado
        Scanner input = new Scanner(System.in);
        System.out.println("Digite el numero entero N :");
        int numeroN = input.nextInt();
        System.out.println("Digite el numero entero M");
        int numeroM = input.nextInt();

        // convertir el numero a sting con la funcion ValueOf()
        String numero1 = String.valueOf(numeroN);
        // Despues de haber pasado el numero de tipo int a string , vamos a hallar su
        // longitud con el metodo length()
        int numero2 = numero1.length();
        System.out.println("el valor de N es :" + numeroN(numeroN, numeroM));
        System.out.println("el valor de N es :" + numeroN2(numeroN, numeroM));

    }// End Main

    public static String numeroN(int numeroN, int numeroM) {
        String numero1 = String.valueOf(numeroN);
        int longN = numero1.length();
        int longF = longN - numeroM;
        String cadenaFS = " ";
        for (int i = 0; i < longF; i++) {
            cadenaFS += numero1.charAt(i);
        }
        return cadenaFS;
    }

    public static String numeroN2(int numeroN, int numeroM) {
        String numero1 = String.valueOf(numeroN);
        int longN = numero1.length();
        int longF = longN - numeroM;
        String subN = numero1.substring(0, longF);
        return subN;

    }

}
