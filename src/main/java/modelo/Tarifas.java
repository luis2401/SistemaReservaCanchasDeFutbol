
package modelo;

/**
 *
 * @author alonzo
 */
public class Tarifas {

    private int idTarifa;
    private categoria categoria;
    private double precioHora;
    

    public enum categoria {
        DIURNO, NOCHE, DIURNOFERIADO, NOCHEFERIADO;
    }

    public Tarifas() {
    }

    public Tarifas(categoria categoria, double precioHora) {
        this.categoria = categoria;
        this.precioHora = precioHora;
    }

    public int getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    public categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    
    
}
