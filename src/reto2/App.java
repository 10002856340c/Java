package reto2;

public class App {
    public static void main(String[] args) {
        Computadores computadores[] = new Computadores[4];
        computadores[0] = new Computadores(60.0, 10, 'D');
        computadores[1] = new ComputadoresMesa(300.0, 40, 'Z', 40);
        computadores[2] = new ComputadoresPortatil(50.0, 10, 'A', 70, false);
        computadores[3] = new Computadores(50.0, 10);
        PrecioTotal solucion1 = new PrecioTotal(computadores);
        solucion1.mostrarTotales();
        System.out.println();

    }
}
