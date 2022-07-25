package MapVariablesGenericas;

import java.util.InputMismatchException;

public class genericos {

    public static void main(String[] args) {
        var mapa = new App<Integer, String>();
        mapa.setV("Cristian Galeano");
        mapa.setK(1);

        try {
            System.out.println("el señor " + mapa.getV() + "  perdio solo " + mapa.getK() + " materia ");

        } catch (InputMismatchException ex) {
            System.out.println("hubo un error");
        }

    }

}
