
package modelo;

/**
 *
 * @author alonzo
 */
public class Clientes {
    
    private int idCliente;
    private String nombreCliente;
    private String telefono;
    private String dni;

    public Clientes() {
    }

    public Clientes(String nombreCliente, String telefono, String dni) {
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        this.dni = dni;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", telefono=" + telefono + ", dni=" + dni + '}';
    }
    
    
    
}
