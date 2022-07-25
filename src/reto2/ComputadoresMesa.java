package reto2;

public class ComputadoresMesa extends Computadores {
    private final static Integer ALMACENAMIENTO_BASE = 50;
    // variable
    private Integer almacenamiento;

    // constructor
    public ComputadoresMesa() {
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
        this.consumoW = CONSUMO_W;
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    // constructor
    public ComputadoresMesa(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    // constructor
    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }

    // metodos
    public Double CalcularPrecio() {
        Double adicion = super.CalcularPrecio();
        if (almacenamiento > 100.0) {
            adicion += 50.0;
        }
        return adicion;
    }

    public Integer getCarga() {
        return almacenamiento;
    }

}
