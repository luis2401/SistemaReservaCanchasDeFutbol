
package modelo;

/**
 *
 * @author alonzo
 */
public class Clientes {
    
    private Long idCliente;
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

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
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
    
    
    
}
