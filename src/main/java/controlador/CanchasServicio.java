
package controlador;

import modelo.Canchas;
import dao.CanchasDAO;
import java.util.List;
/**
 *
 * @author alonzo
 */
public class CanchasServicio {
    
    private CanchasDAO daoCanchas;
  
    
    public List<Canchas> listarCanchas(){
        this.daoCanchas = new CanchasDAO();
        return daoCanchas.listarCanchas();
    }
    
    public void guardarCancha(String a, String b, String c){
        this.daoCanchas = new CanchasDAO();
        Canchas.tipoCancha tipo = Canchas.tipoCancha.valueOf(b);
        Canchas.estadoCancha estado = Canchas.estadoCancha.valueOf(c);
        
        Canchas cancha = new Canchas(a, tipo, estado);
        daoCanchas.insertarCancha(cancha);
        
    }
    
    public void eliminarCancha(Integer id){
        this.daoCanchas = new CanchasDAO();
        daoCanchas.eliminarCancha(id);
    }
    
    
    
    
}
