
package POO;

import java.util.Date;

public class Cliente extends Persona {
    // Atributos
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;

    private static int ContadorCliente;

    // ------------------------------------------------------------------------------------------------------------------//
    // Constructores
    public Cliente() {

    }

    public Cliente(Date fechaRegistro, boolean vip) {
        // Incrementamos esta variable a travez del ++
        this.idCliente = ++ContadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    // -----------------------------------------------------------------------------------------------------------------//
    // getters and setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    // ------------------------------------------------------------------------------------------------------------------//
    @Override
    public String toString() {
        return "Cliente =" + super.getNombre() + "\n" + "Feacha de registro = " + " " + fechaRegistro + "\n"
                + "idCliente = "
                + idCliente + "\n"
                + "vip = "
                + vip + " ";
    }

}
