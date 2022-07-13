package Ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;

public class clase1 {

    public static void main(String[] args) throws Exception {

        // 1) Ejemplo , como imprimir en pantalla
        System.out.println(
                "COMO VAMOS, ESTAMOS EN CICLO 2 , SE VIENEN GRANTES RETOS EN ESTE SEGUNDO SEMESTRE DEL AÑO");
        // --------------------------------------------------------------------------------------------------------------------------------------
        // 2) Ejemplo como imprimir en pantalla con variables y identacion
        int x = 10;
        System.out.println("yo tengo " + x + "años");
        // -------------------------------------------------------------------------------------------------------------------------------------
        // 3) Ejemplo , como hacer una variable que contenga un input() y almacene
        // informacion del usuario por teclado
        Scanner variable = new Scanner(System.in);
        System.out.print("por favor digite su nombre :");
        // .next () --> sirve para ejecutar solo una linea por teclado ---> input()
        // .nextline() --> sirve para ejecutar varias linea po teclado ---> input()
        String nombre = variable.nextLine();
        System.out.print(" su nombre es :" + nombre + "\n");
        // ------------------------------------------------------------------------------------------------------------------------------------
        // Otra forma de hacerlo es con buffer:
        System.out.print("Aprendiendo con Buffer :");
        BufferedReader variable2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("por favor digite su nombre nuevamente :");
        String nombre2 = variable2.readLine();
        System.out.print("su nombre es  :" + nombre2 + "\n");

        // Ejemplo de identacion con las variables ya creadas

        System.out.print("los datos recibidos fueron  :" + nombre + " " + nombre2);

    }

}
