package JUnit;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        suma suma = new suma();
        System.out.println("Digite el numero 1 :");
        suma.setNumero1(sc.nextInt());
        System.out.println("Digite el numero 2 :");
        suma.setNumero2(sc.nextInt());
        System.out.println("la suma es :" + suma.sumar(suma.getNumero1(), suma.getNumero2()));

    }
}
