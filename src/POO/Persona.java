package POO;

public class Persona {
    // Atributos
    String nombre;
    char genero;
    int edad;
    String direccion;

    // --------------------------------------------------------------------------------------------------------------------//
    // constructores
    public Persona() {

    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    // ---------------------------------------------------------------------------------------------------------------------//
    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ---------------------------------------------------------------------------------------------------------------------//
    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    // ---------------------------------------------------------------------------------------------------------------------//
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // ---------------------------------------------------------------------------------------------------------------------//
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // ---------------------------------------------------------------------------------------------------------------------//
    // Generamos un to string para que nos retorne una cadena de caracteres con los
    // datos
    @Override
    public String toString() {
        return "Persona [direccion=" + direccion + ", edad=" + edad + ", genero=" + genero + ", nombre=" + nombre + "]";
    }

}
