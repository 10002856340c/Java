package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    // Ejercicio con operador terniario (?) en java
    // saber si un numero es para o impar
    public static void main(String[] args) throws Exception {
        // 1) Hacemos una variable para preguntar el nombre por teclado
        Scanner variable = new Scanner(System.in);
        System.out.print("Digite el numero :");
        // 2 hacemos otra variable , en el cual va contener el metod en cual le
        // indicamos que guarde toda la linea de codigo que digite el usuario
        int numero = variable.nextInt();
        System.out.print("el numero " + numero + " es " + ParImpar(numero));

    }// end main

    // 4) creamos la funcion fuera del main
    // Metodos estaticos (funciones en java)
    // operador terniario
    // "variable=(condicion)?primervalor(True):segundovalor(false)"

    public static String ParImpar(int numero) {

        return (numero % 2 == 0) ? "par" : "impar";

    }

}
