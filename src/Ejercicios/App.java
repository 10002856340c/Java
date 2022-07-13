package Ejercicios;

//1) creamos la clase 

public class App {

        public static void main(String[] args) {
                // Ejemplo con el constructor Vacio
                // 1) llamamos al modulo y despues asiganomos el nombre de la variable , y por
                // consecuente llamamos al constructor vacio()
                ejercicio13 variable1 = new ejercicio13();
                // 2)Atravez del set vamos a asignarle los valores a nuestro metodo
                // "ejercicio13"
                variable1.setNombrePersona("Cristian");
                variable1.setCedula(1000256445);
                // 3) imprimimos para ver nuestro resultado llamando al get de cada atributo
                System.out.println("el nombre de la persona es :" + variable1.getNombrePersona()
                                + "el numero de identificacion es :" + variable1.getCedula());

                // -----------------------------------------------------------------------------------------------------------------------------------------------------------------//
                // Ejemplo con el construtor con sus variables
                // 1) llamamos al modulo y despues asiganomos el nombre de la variable , y por
                // consecuente llamamos al constructor lleno es decir con sus atributos
                ejercicio13 variable2 = new ejercicio13(1000256340, 1.69, "masculino", "Cristian");
                // 3) imprimimos para ver nuestro resultado llamando al get de cada atributo
                System.out.println("El nombre es " + variable2.getNombrePersona() + "La Cedula es:"
                                + variable2.getCedula()
                                + "con estatura " + variable2.getEstura() + "de genero " + variable2.getGenero());
                variable2.setNombrePersona("Maria");
                System.out.println("El nombre es " + variable2.getNombrePersona() + "La Cedula es:"
                                + variable2.getCedula()
                                + "con estatura " + variable2.getEstura() + "de genero " + variable2.getGenero());

        }

}
