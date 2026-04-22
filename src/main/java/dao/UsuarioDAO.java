package dao;

import com.mysql.cj.xdevapi.Result;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author alonzo
 */
public class UsuarioDAO {
    
    public List<Usuario> listarUsuarios(){
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        try {Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Usuario user = new Usuario();
                user.setNombreUsuario(rs.getString("nombreUsuario"));
                user.setContrasenaUsuario(rs.getString("contrasenaUsuario"));
                
                lista.add(user);
               
            }
             return lista;
        } catch (SQLException e) {
            System.out.println("Error al listarUsuario: " +e.getMessage());
            return null;
        }
    }
    
}
