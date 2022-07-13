package Ejercicios;

// 1)  creamos la clase 
// 2) hacemos los atributos
public class Ejercicio8 {
    // 2) hacemos los atributos y asignamos si van hacer publico o privados
    private String codigo;
    private String nombre;
    private String raza;
    private String color;
    private int altura;

    // 3 llamamos a la clase de una forma vacia
    public Ejercicio8() {

    }

    // 4 llamamos a la clase con sus atributos
    public Ejercicio8(String codigo, String nombre, String raza, String color, int altura) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.altura = altura;

    }

    // -----------------------------------------------------------------------------------------------------------//

    // 5) cuando se pone en privado los atributos, nos va acrear un get y un set

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // -----------------------------------------------------------------------------------------------------------//
    // 6) cuando se pone en privado los atributos, nos va acrear un get y un set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // -----------------------------------------------------------------------------------------------------------//

    // 7) cuando se pone en privado los atributos, nos va acrear un get y un set
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // -----------------------------------------------------------------------------------------------------------//
    // 8) cuando se pone en privado los atributos, nos va acrear un get y un set
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // -----------------------------------------------------------------------------------------------------------//

    // 9) cuando se pone en privado los atributos, nos va acrear un get y un set
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
