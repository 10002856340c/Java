package Ejercicios;

import java.util.Scanner;

public class AreasFigurasGeometricas {
    public static void main(String[] args) {

        // se instancia la variable Scaner
        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca el color del cuadrado :");
        String colorDelCuadrado = usuario.nextLine();
        System.out.println("Introduzca el lado del cuadrado:");
        double LadodelCuadrado = usuario.nextDouble();
        System.out.println(
                "El cuadrado de color " + colorDelCuadrado + " tiene un Area de " + Areadelcuadrado(LadodelCuadrado));
        Scanner usuario2 = new Scanner(System.in);
        System.out.println("Introduzca el color del circulo :");
        String colorCirculo = usuario2.nextLine();
        System.out.println("Intruduzca el radio del circulo :");
        double radioCirculo = usuario2.nextDouble();
        System.out
                .println("el circulo de color " + colorCirculo + " tiene un area de : " + AreadelCirculo(radioCirculo));

    }// End main

    public static double Areadelcuadrado(double lado) {
        double formula = lado * lado;
        return formula;

    }

    public static double AreadelCirculo(double radio) {
        double formula = Math.PI * Math.pow(radio, 2);
        return formula;

    }

}
