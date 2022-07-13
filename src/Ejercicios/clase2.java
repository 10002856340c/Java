package Ejercicios;

//FLUJOS DE CONTROL//SWITH
import java.util.Date;

public class clase2 {

    public static void main(String[] args) throws Exception {
        // 1)Creaos una variables para que almacene la data de la fecha y hora del
        // sistema
        java.util.Date fecha = new Date();
        System.out.println("la fecha" + fecha);
        // 2 Creamos una variable para que alamacene la informacion del calendario de
        // nuestro sistema, es decir los dias del calendario
        int dia = fecha.getDay();
        System.out.println("el dia " + dia);
        // 3) Creamos un switch, para que el sistema identifique en que dia estamos
        switch (dia) {
            case 1:
                System.out.println("Hoy es lunes");
                break;

            case 2:
                System.out.println("Hoy es martes");
                break;
            case 3:
                System.out.println("hoy es miercoles  ");
                break;

            case 4:
                System.out.println("hoy es jueves ");
                break;

            case 5:
                System.out.println("hoy es viernes ");
                break;

            case 6:
                System.out.println("hoy es sabado");
                break;

            case 7:
                System.out.println("hoy es domingo");
                break;

            default:
                System.out.println("Esta no es la opcion correcta");
                break;
        }
    }
}
