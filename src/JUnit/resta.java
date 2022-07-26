package JUnit;

public class resta {
    private int numero1;
    private int numero2;

    public resta() {

    }

    public resta(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int restar(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;
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
