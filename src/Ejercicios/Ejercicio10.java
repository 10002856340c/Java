package Ejercicios;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("el numero Pi es :" + Math.round(Math.PI));
        System.out.println("el numero euler es :" + Math.E);
        // ------------------------------------------------------------------//
        // Un ejemplo para redondear pero asignadole el numero de decimales es el
        // siguiente, todo depende de la cantidad de 0 que uno le asigne
        System.out.println("el numero Pi es :" + Math.round(Math.PI * 10.0) / 10.0);
        // ------------------------------------------------------------------//
        // redondeo al entero MENOR Y MAYOR , con las funciones floor y ceil
        System.out.println("EL MENOR:" + Math.floor(Math.PI));
        System.out.println("el MAYOR :" + Math.ceil(Math.PI));
    }
}
