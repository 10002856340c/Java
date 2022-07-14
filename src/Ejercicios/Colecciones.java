package Ejercicios;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.HashMap;

public class Colecciones {
    public static void main(String[] args) {

        // Ejemplo para declarar una lista en Java
        List<Integer> listaEnteros = new ArrayList<>();
        // Adicionar a nuestra lista --> add()
        listaEnteros.add(18);
        // mostrar --get
        System.out.println(listaEnteros.get(0));
        // de forma dinamica
        Scanner variable = new Scanner(System.in);
        System.out.println("Digite la cantidad de numeros que desea :");
        int numeroslista = variable.nextInt();
        int numero;

        for (int i = 0; i < numeroslista; i++) {
            System.out.println("Digite el numero :" + (i + 1) + ":");
            numero = variable.nextInt();
            listaEnteros.add(numero);
        }
        // --------------------------------------------------------------------------------------------//
        // Para saber el numero de datos digitados
        System.out.println("Los numeros digitads son :");

        // size ()--> El método size() devuelve el número de elementos actualmente
        // presentes en la colección. A diferencia de la propiedad length de los arrays,
        // el valor devuelto por el método size() no es constante y cambia según el
        // número de elementos.

        for (int i = 0; i < listaEnteros.size(); i++) {

            System.out.println(listaEnteros.get(i) + ",");
        }
        System.out.println("Digite el elemento a buscar :");
        int numeroL = variable.nextInt();
        // --------------------------------------------------------------------------------------------//
        // Para saber si un numero existe en un determinado lugar
        // El método contains () es un método Java para verificar si String contiene
        // otra subcadena o no. Devuelve un valor booleano para que pueda usarse
        // directamente dentro de sentencias if. Este método devuelve verdadero solo si
        // esta cadena contiene “s” else
        if (listaEnteros.contains(numeroL)) {
            System.out.println("El numero" + numeroL + "  Si existe ");
        } else {
            System.out.println("El numero " + numeroL + "  No existe ");
        }
        // --------------------------------------------------------------------------------------------//
        // Para saber la posicion o el indice en el que se encuentra un objeto

        System.out.println(" El numero " + numeroL + " se encuentra en la posicion " + listaEnteros.indexOf(numeroL));
        // Para Eliminar un Elemento
        System.out.println("Por favor ingrese el elemnto a eliminar : ");
        int oe = variable.nextInt();
        listaEnteros.remove(new Integer(oe));

        // Declaracion de conjuntos
        // Set<Integer> conjuntosEnteros = new HashSet<>();
        // --------------------------------------------------------------------------------------------//

    }
}
