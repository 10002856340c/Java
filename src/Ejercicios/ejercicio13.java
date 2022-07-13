package Ejercicios;

public class ejercicio13 {
    // Datos Personales
    // 1) Atributos
    private int cedula;
    private double estura;
    private String genero;
    private String NombrePersona;

    public ejercicio13() {

    }

    public ejercicio13(int cedula, double estura, String genero, String nombrePersona) {
        this.cedula = cedula;
        this.estura = estura;
        this.genero = genero;
        this.NombrePersona = nombrePersona;
    }

    // -------------------------------------------------------------------------------------------------------//
    // Creamos los get para demostrar o pasar ese valor de los atributos
    public int getCedula() {
        return cedula;
    }

    public double getEstura() {
        return estura;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombrePersona() {
        return NombrePersona;
    }

    // -----------------------------------------------------------------------------------------------------//
    // Creamos los set para poder cambiar los atributos

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setEstura(double estura) {
        this.estura = estura;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNombrePersona(String nombrePersona) {
        this.NombrePersona = nombrePersona;
    }

}
