package POO;

import java.util.Date;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos clientes desea ingresar al sistema : ");
        int nC = sc.nextInt();
        sc.nextLine();// Limpiando consola
        Cliente[] cliente = new Cliente[nC];

        for (int i = 0; i < nC; i++) {
            System.out.println(" Digite los nombre y Apellidos del Cliente" + (i + 1) + ":");
            String nombre = sc.nextLine();
            System.out.println("El cliente es VIP (True) or (False) : ");
            boolean vip = sc.nextBoolean();
            cliente[i] = new Cliente(new Date(), vip);
            cliente[i].setNombre(nombre);
            sc.nextLine();// Limpiando buffer

        }
        for (int i = 0; i < nC; i++) {
            // System.out.println("Nombre del cliente :" + cliente[i]);
            System.out.println(cliente[i].toString());
        }
        // -----------------------------------------------------------------------------------------------------------//

        System.out.println("Cuantos empleados desea ingresar al sistema  :");
        int numeroEmpleado = sc.nextInt();
        sc.nextLine();// Limpiando consola
        Empleado[] empleado = new Empleado[numeroEmpleado];
        for (int i = 0; i < numeroEmpleado; i++) {
            System.out.println(" Digite los nombre y Apellidos del Empleado  " + (i + 1) + ":");
            String nombreEmpleado = sc.nextLine();
            System.out.println("Ingrese su sueldo :");
            int sueldo = sc.nextInt();
            System.out.println(empleado.toString());
            sc.nextLine();// Limpiando consola

        }
        for (int i = 0; i < numeroEmpleado; i++) {
            // System.out.println("Nombre del cliente :" + cliente[i]);
            System.out.println(empleado.toString());
        }

    }
    // End Main
}