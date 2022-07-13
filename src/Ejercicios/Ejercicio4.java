package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner variable = new Scanner(System.in);
        System.out.print("Digite los grados centigrados:");
        float grados = variable.nextFloat();
        System.out.print("los grados recibidos en centigrados fueron " + grados
                + " y los grados convertidos a fahrenheit son " + GradosFahrenheit(grados) + " F");

    }// end main

    public static float GradosFahrenheit(float numero) {
        float conversor = 32 + (9 * numero / 5);
        return conversor;
    }

}
