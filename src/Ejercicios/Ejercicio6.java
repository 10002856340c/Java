package Ejercicios;

import java.util.Scanner;

//*********************************************************METODOS DE STRING********************************************************* */

//En este ejercicio vamos a conocer varios metodos o funciones que tiene el lenguaje java
//1) Lenght () --> para hallar la longitud o largo de una cadena de caracteres tipo String
//2) indexOf ()--> para hallar la posicon donde este una letra o un carater en especifico 
//3) lastIndexOf()--> sirve para hallar la ultima aparicion  de un determinado carcter string ubicandonos en que indice esta ubicada 
//4) charAt ()--> sirve para hallar o ubicar que letra hay en un determinado indice segun uno se lo indique
//5)substring ()--> substring() es un método para extraer una subcadena de texto de una cadena más grande, dadas las posiciones inicial y final dentro de la cadena. Debido a que el método substring() es un método del objeto String
// 6)toUpperCase ()--> para convretir una cadena de caracteres tipo string a mayusculas
// 7)ValueOf ()-->El método valueOf de String devuelve el valor primitivo de un objeto String como un tipo de dato cadena. Este valor es equivalente a String
//8) equalsIgnoreCase()--> esta funcion sirve para saber si son iguales o no una cadena de caracteres asi esten en mayusculas o minusculas 
//Ejemplo:
///String str1 = String("CCCP");
//String str2 = String("ccCP");
// Prueba para ver si str1 es igual a str2
// if (str1.equalsIgnoreCase(str2) == true) {
// Ellos son iguales ignorando la diferencia entre may&uacute;sculas y 
// min&uacute;sculas entonces imprimir&aacute;
// Serial.println("Igual");  
//} 
//  else {
//  Serial.println("No es Igual");
// }
//} 

public class Ejercicio6 {

        public static void main(String[] args) throws Exception {
                Scanner variable = new Scanner(System.in);
                System.out.print("digite su nombre :");
                String nombre = variable.nextLine();
                Scanner variable2 = new Scanner(System.in);
                System.out.print("digite su Apellido  :");
                String Apellido = variable2.nextLine();
                System.out.print("El nombre y apellido es " + nombre + " " + Apellido + "\n");
                // --------------------------------------------------------------------------------------------------------------------//
                // 1) Lenght () --> para hallar la longitud o largo de una cadena de caracteres
                // tipo String
                System.out.print("El numero de letras que tiene el nombre " + nombre + " " + "es de " + nombre.length()
                                + "\n");
                System.out.print(
                                "El numero de letras que tiene el Apellido " + Apellido + " " + "es de "
                                                + Apellido.length() + "\n");
                // ----------------------------------------------------------------------------------------------------------------------//
                // 2) indexOf ()--> para hallar la posicon donde este una letra o un carater en
                // especifico
                System.out.print(
                                "La ubicacion de la letra r en el nombre " + nombre + " esta en la posicion "
                                                + nombre.indexOf("n")
                                                + "\n");
                // ----------------------------------------------------------------------------------------------------------------------//
                // 3) lastIndexOf()--> sirve para hallar la ultima aparicion de un determinado
                // carcter string ubicandonos en que indice esta ubicada
                System.out.print(
                                "La ultima aparicion de la letra a del nombre " + nombre + "es  "
                                                + nombre.lastIndexOf("a") + "\n");
                // ----------------------------------------------------------------------------------------------------------------------//
                // 4) charAt ()--> sirve para hallar o ubicar que letra hay en un determinado
                // indice segun uno se lo indique
                System.out.print(
                                "En el indice 4 del nombre " + nombre + "esta la letra :  " + nombre.charAt(4) + "\n");
                // ----------------------------------------------------------------------------------------------------------------------//
                // 5)substring ()--> substring() es un método para extraer una subcadena de
                // texto de una cadena más grande, dadas las posiciones inicial y final dentro
                // de la cadena. Debido a que el método substring() es un método del objeto
                // String
                System.out.print(
                                "en la subcadena del rango (0,5) del nombre  " + nombre
                                                + "esta conformado por las siguientes letras : "
                                                + nombre.substring(0, 5) + "\n");
                // ----------------------------------------------------------------------------------------------------------------------//
                // 6)toUpperCase ()--> para convretir una cadena de caracteres tipo string a
                // mayusculas
                System.out.print("el nombre en mayusculas " + nombre.toUpperCase());
                // ----------------------------------------------------------------------------------------------------------------------//

        }// End main

}
