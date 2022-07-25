package variablesGenericas;
//wrappers 

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {

        var Integergenericos = new genericos<Integer>();
        // creamos nuestro input
        Scanner x = new Scanner(System.in);
        System.out.println("ingrese un numero ");
        int numero = x.nextInt();

        Integergenericos.setT(numero);

        System.out.println("el numero digitado es :" + Integergenericos.getT());

        System.out.println(" --------------------Datos Personales-----------------------");
        // se crean las variables genericas
        var integerCedula = new genericos<Integer>();
        var integerEdad = new genericos<Integer>();
        var stringNombre = new genericos<String>();
        var stringApellido = new genericos<String>();
        var doubleNota = new genericos<Double>();
        // hacemos nuestras impresiones
        System.out.println("ingrese su cedula :");
        // creamos nuestras variables donde se va almacenar lo que digite el usuario
        int cedula = x.nextInt();

        System.out.println("ingrese su Edad:");
        int Edad = x.nextInt();
        x.nextLine();
        System.out.println("Digite el nombre del estudiante  :");
        String nombre = x.nextLine();

        System.out.println("Digite el Apellido del estudiante  :");
        String Apellido = x.nextLine();
        System.out.println("La nota del estudiante  :");
        double Nota = x.nextDouble();

        // almacenamos la informacion que ingrese el usuario a los set de las variables
        // genericas posteriormente creadas
        integerCedula.setT(cedula);
        integerEdad.setT(Edad);
        stringNombre.setT(nombre);
        stringApellido.setT(Apellido);
        doubleNota.setT(Nota);

        // concatenacion
        System.out.println("el señor  " + stringNombre.getT() + " " + stringApellido.getT()
                + "Identificado con el numero de cedula " + integerCedula.getT() + "saco en la nota final "
                + doubleNota.getT());
    }

}
