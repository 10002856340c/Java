package Ejercicios;

import java.util.Scanner;

//Ejercicio 2 funciones en java
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        // 1) Hacemos una variable para preguntar el nombre por teclado
        Scanner variable = new Scanner(System.in);
        System.out.print("por favor digite un numero Entero :");
        // 2 hacemos otra variable , en el cual va contener el metodo en cual le
        // indicamos que guarde toda la linea de codigo que digite el usuario
        int numero = variable.nextInt();

        // 3 ) llamamos a la funcion ya creada despues del main, que es la funcion
        // CantidaddeDigitos , mediante una cadeta de caracteres y identacion
        System.out.print("El numero " + numero + "  tiene  " + CantidaddeDigitos(numero) + " cifras");

    }// End main

    // 4) creamos la funcion duera del main
    // Metodos estaticos (funciones en java)

    public static int CantidaddeDigitos(int numero) {
        int cifras = 0;
        while (numero != 0) {
            numero = numero / 10;
            cifras += 1;

        }
        return cifras;
    }

}
