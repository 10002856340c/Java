package JUnit;

public class suma {
    private int numero1;
    private int numero2;

    public suma() {

    }

    public suma(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int sumar(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
