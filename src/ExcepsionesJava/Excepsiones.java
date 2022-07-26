package ExcepsionesJava;

public class Excepsiones {

    public static void main(String[] args) {
        // hacemos una instancia del modulo OperacionesMatematicas
        OperacionesMatematicas op = new OperacionesMatematicas();
        boolean continuar = true;

        do {
            try {
                int[] valores = new int[2];
                valores = op.leer();
                System.out.println("la suma de los valores es :" + op.sumar(valores[0], valores[1]));
                System.out.println("la resta de los numeros es :" + op.restar(valores[0], valores[1]));
                System.out.println("la multiplicacion de los numeros es : " + op.multiplicar(valores[0], valores[1]));
                System.out.println("la division de los numeros es :" + op.dividir(valores[0], valores[1]));

                // ArithmeticException --> se conocen como excepciones runtime. Las excepciones
                // en tiempo de ejecución
                // ocurren cuando el programador no ha tenido cuidado al escribir su código. Por
                // ejemplo: cuando se sobrepasa la dimensión de un array, se lanza una excepción
                // en este caso ArithmeticException nos sirve para indicar cuando hay una divion
                // entre 0

            } catch (ArithmeticException e) {
                System.out.println("La divion entre 0 no existe ");

            } catch (Exception e) {
                System.out.println("opcion invalida");
                System.out.println("Debe reiniciarce");

            } finally {
                System.out.println("Gracias por utilizar el sistema ");
            }

        } while (continuar);

    }

}