package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) throws Exception {
        // 1) Hacemos una variable para preguntar el nombre por teclado
        Scanner variable = new Scanner(System.in);
        // 2 hacemos otra variable , en el cual va contener el metod en cual le
        // indicamos que guarde toda la linea de codigo que digite el usuario
        System.out.print("Digite un numero entero:");
        int numero = variable.nextInt();
        // 3 ) llamammos a la funcion ya creada despues del main, que es la funcion
        // CantidaddeDigitos , mediante una cadeta de caracteres y identacion
        System.out.print("el numero digitado es " + numero + " y su doble es " + DobleNumero(numero)
                + "  y su triple es " + TripleNumero(numero));

    }// End

    // 4) creamos la funcion fuera del main
    // Metodos estaticos (funciones en java)

    public static int DobleNumero(int numero) {
        int Doble = numero * 2;
        return Doble;
    }

    public static int TripleNumero(int numero) {
        int Triple = numero * 3;
        return Triple;
    }

}
