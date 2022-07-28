package reto2;

public class ComputadoresPortatiles extends Computadores {
    protected final static Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private boolean camaraITG;

    public ComputadoresPortatiles() {
        super();
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;

    }

    public ComputadoresPortatiles(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }

    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas,
            boolean camaraITG) {
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;

    }

    public Double CalcularPrecio() {
        Double adicion = 0.0;
        if (this.pulgadas > 40) {
            adicion += super.precioBase * 0.3;
        }
        if (this.camaraITG) {
            adicion += 50.0;
        }
        return super.CalcularPrecio() + adicion;

    }
}
