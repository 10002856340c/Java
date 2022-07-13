package Ejercicios;

import java.util.Scanner;

//1 Ejercio de funciones en java
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        // 1) Hacemos una variable para preguntar el nombre por teclado
        Scanner variable = new Scanner(System.in);
        System.out.print("por favor digite su nombre :");
        // 2 hacemos otra variable , en el cual va contener el metod en cual le
        // indicamos que guarde toda la linea de codigo que digite el usuario
        String nombre = variable.nextLine();
        // 3 ) llamammos a la funcion ya creada despues del main, que es la funcion
        // saludo
        System.out.print(saludo(nombre));

    }// End main

    // 4) creamos la funcion fuera del main
    // Metodos estaticos (funciones en java)

    public static String saludo(String nombre) {
        return "hola  " + nombre + " bienvenido a javaa";

    }

}
