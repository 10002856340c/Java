package reto2;

public class ComputadoresMesa extends Computadores {

    protected final static Integer ALMACENAMIENTO_BASE = 50;
    private Integer almacenamiento;

    // constructores
    public ComputadoresMesa() {
        this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.consumoW = CONSUMO_W;
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    public ComputadoresMesa(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.almacenamiento = ALMACENAMIENTO_BASE;

    }

    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
        this.almacenamiento = almacenamiento;
    }
    // metodos

    public Double CalcularPrecio() {
        Double adicion = super.CalcularPrecio();

        if (almacenamiento > 100) {
            adicion += 50.0;
        }
        return adicion;
    }

    public Integer getCarga() {
        return almacenamiento;
    }

}
