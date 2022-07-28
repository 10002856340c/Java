package reto2;

public class PrecioTotal {
    private Double totalComputadores = 0.0;
    private Double totalComputadoresPortatiles = 0.0;
    private Double totalComputadoresMesa = 0.0;
    private Computadores[] listaComputadores;

    // constructor
    PrecioTotal(Computadores[] pComputadores) {
        this.listaComputadores = pComputadores;
    }

    public void mostrarTotales() {
        // codigo
        for (int i = 0; i < listaComputadores.length; i++) {
            if (listaComputadores[i] instanceof Computadores) {
                totalComputadores += listaComputadores[i].CalcularPrecio();
            }
            if (listaComputadores[i] instanceof ComputadoresMesa) {
                totalComputadoresMesa += listaComputadores[i].CalcularPrecio();
            }
            if (listaComputadores[i] instanceof ComputadoresPortatiles) {
                totalComputadoresPortatiles += listaComputadores[i].CalcularPrecio();
            }

        }
        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " +
                totalComputadoresMesa);
        System.out.print("La suma del precio de los computadores portátiles es de " +
                totalComputadoresPortatiles);

    }

}
