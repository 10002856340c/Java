package Ejercicios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        // Colas en Java

        System.out.println("Cola");
        Queue<Integer> colaEnteros = new PriorityQueue<>();

        // Adicionar --> add
        colaEnteros.add(5);
        System.out.println("Los elementos de la cola son :");

        for (Integer entero : colaEnteros) {
            System.out.println(entero);

        }
        // --------------------------------------------------------------------------------------------//
        System.out.println("Mapas");
        // primero se crea un Map
        Map<Integer, String> MapClientes = new HashMap<>();
        // Por asignacion de datos
        MapClientes.put(1010, "Calletana Lopez Baleta");
        MapClientes.put(1212, "Mario Hernandez");
        MapClientes.put(1414, "Rodolfo Perez");
        System.out.println(MapClientes);
        // --------------------------------------------------------------------------------------------//
        // LinkedHashMap
        Map<String, String> maplH = new LinkedHashMap<>();
        maplH.put("1254", "Harol fernando");
        maplH.put("1254", "Harol fernando");
        maplH.put("1254", "Harol fernando");
        System.out.println(maplH);
        // --------------------------------------------------------------------------------------------//
        // TreeMap
        // Extensiones de lenguajes de programacion
        Map<String, String> Maptm = new TreeMap<>();
        Maptm.put("java", "java");
        Maptm.put("Python", "py");
        Maptm.put("JavaScript", "js");
        Maptm.put("Sql", "sql");
        System.out.println(Maptm);
    }

}
