package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner Usuario = new Scanner(System.in);
        System.out.println("Ingrese el Cateto Adyacente :");
        int catetoAdyacente = Usuario.nextInt();
        System.out.println("Ingrese el Cateto Opuesto :");
        int catetoOpuesto = Usuario.nextInt();
        System.out.println("La hipotenusa de ese triangulo es :" + Hipotenusa(catetoAdyacente, catetoOpuesto));
    }// Ende main

    public static double Hipotenusa(int catetoAdyacente, int catetoOpuesto) {
        double formula = Math.sqrt(Math.pow(catetoAdyacente, 2) + Math.pow(catetoOpuesto, 2));
        // Para redondear
        double redondeo = Math.round(formula) * 100.0 / 10.0;
        return redondeo;
    }

}
