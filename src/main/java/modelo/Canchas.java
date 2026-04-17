
package modelo;

/**
 *
 * @author alonzo
 */
public class Canchas {
    
    private Integer idCancha;
    private String nombreCancha;
    private tipoCancha tipoCancha;
    private estadoCancha estadoCancha;
    
    public enum tipoCancha {
        GRASS, LOSA;
    }

    public enum estadoCancha {
        DISPONIBLE, MANTENIMIENTO, OCUPADA;
        
        public static final estadoCancha DEFAULT = DISPONIBLE;
    }

    public Canchas() {
    }

    public Canchas(String nombreCancha, tipoCancha tipoCancha, estadoCancha estadoCancha) {
        this.nombreCancha = nombreCancha;
        this.tipoCancha = tipoCancha;
        this.estadoCancha = estadoCancha;
    }

    public Integer getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(Integer idCancha) {
        this.idCancha = idCancha;
    }

    public String getNombreCancha() {
        return nombreCancha;
    }

    public void setNombreCancha(String nombreCancha) {
        this.nombreCancha = nombreCancha;
    }

    public tipoCancha getTipoCancha() {
        return tipoCancha;
    }

    public void setTipoCancha(tipoCancha tipoCancha) {
        this.tipoCancha = tipoCancha;
    }

    public estadoCancha getEstadoCancha() {
        return estadoCancha;
    }

    public void setEstadoCancha(estadoCancha estadoCancha) {
        this.estadoCancha = estadoCancha;
    }
    
    
    
}
