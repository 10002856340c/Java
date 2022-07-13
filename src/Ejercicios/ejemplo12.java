package Ejercicios;

import java.util.Scanner;

public class ejemplo12 {
    // conversion de km/h --> m/s
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la velocidad :");
        int velocidadKmH = input.nextInt();
        System.out.println("se han convertido a " + conversion(velocidadKmH));
    }// end Main

    public static float conversion(int numero) {

        float convNumero = numero * 1000 / 3600;
        return convNumero;

    }

}
