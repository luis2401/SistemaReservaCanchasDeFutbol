
package controlador;

import dao.UsuarioDAO;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author alonzo
 */
public class UsuarioServicio {
    
    private UsuarioDAO daoUsuario;
    
    public boolean validarUsuario(String usuario, String contrasena){
        this.daoUsuario = new UsuarioDAO();
        List<Usuario> lista = daoUsuario.listarUsuarios();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombreUsuario().equals(usuario) && lista.get(i).getContrasenaUsuario().equals(contrasena)) {
                System.out.println("Bienvenido al sistema");
                return true;
            }
        }
        System.out.println("acceso denegado");
        return false;
    }
    
}
