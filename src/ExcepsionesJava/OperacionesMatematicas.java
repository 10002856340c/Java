package ExcepsionesJava;

import java.io.IOException;
import java.util.Scanner;

public class OperacionesMatematicas {

    // IOException --> Se utilizan en Java para capturar las excepciones que se
    // hayan podido producir en el bloque de código delimitado por try y catch.

    public int[] leer() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero 1 :");
        int numero1 = sc.nextInt();
        System.out.println("Digite el numero 2 :");
        int numero2 = sc.nextInt();
        int vector[] = new int[2];
        vector[0] = numero1;
        vector[1] = numero2;
        return vector;
    }

    public int sumar(int numero1, int numero2) throws IOException {
        int sumar = numero1 + numero2;
        return sumar;

    }

    public int restar(int numero1, int numero2) throws IOException {
        int restar = numero1 - numero2;
        return restar;
    }

    public int multiplicar(int numero1, int numero2) throws IOException {
        int multiplicar = numero1 * numero2;
        return multiplicar;
    }

    public int dividir(int numero1, int numero2) throws ArithmeticException {
        int dividir = numero1 / numero2;
        return dividir;
    }

}
