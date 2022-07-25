package reto2;

public class PrecioTotal extends Computadores {

    private Double totalComputadoras = 0.0;
    private Double totalComputadoresPortatiles = 0.0;
    private Double totalComputadoresMesa = 0.0;
    private Computadores[] listaComputadores;

    // Constructor
    PrecioTotal(Computadores[] pComputadores) {
        this.listaComputadores = pComputadores;
    }

    public void mostrarTotales() {
        // codigo
        for (int i = 0; i < listaComputadores.length; i++) {
            if (listaComputadores[i] instanceof Computadores) {
                totalComputadoras += listaComputadores[i].CalcularPrecio();
            }
            if (listaComputadores[i] instanceof ComputadoresMesa) {
                totalComputadoras += listaComputadores[i].CalcularPrecio();
            }
            if (listaComputadores[i] instanceof ComputadoresPortatil) {
                totalComputadoras += listaComputadores[i].CalcularPrecio();
            }

        }
        // mostramos los resultados
        System.out.println("La usma del precio de los computadores es de " + totalComputadoras);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.println("La suma del precio de los computadores Portatil es de " + totalComputadoresPortatiles);
    }
}
