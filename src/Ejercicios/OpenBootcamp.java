package Ejercicios;

public class OpenBootcamp {
    public static void main(String[] args) {

        potato hola = new potato();
        hola.retorno();
        hola.retorno();
        hola.retorno();
        System.out.println(hola.retorno());

    }

}

class potato {
    public int brazos = 0;

    public void retorno() {
        this.brazos--;
    }
}