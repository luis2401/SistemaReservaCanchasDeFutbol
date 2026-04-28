
package dao;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Clientes;

/**
 *
 * @author alonzo
 */
public class ClientesDAO {
    
    public boolean insertarCliente(Clientes cliente){
        String sql = "INSERT INTO clientes(dni, nombre, telefono) values(?,?,?)";
        try {Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getDni());
            ps.setString(2, cliente.getNombreCliente());
            ps.setString(3, cliente.getDni());
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
            System.out.println("Error al insertar cliente: " + e.getMessage());
            return false;
        }
    }
    
    
    public List<Clientes> listarClientes(){
        String sql = "SELECT * FROM clientes";
        List<Clientes> listaCliente = new ArrayList();
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Clientes cliente = new Clientes();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombreCliente(rs.getString("nombre"));
                cliente.setDni(rs.getString("dni"));
                cliente.setTelefono(rs.getString("telefono"));
                
                listaCliente.add(cliente);
                
            }
            
            return listaCliente;
        } catch (SQLException e) {
             System.err.println("Error al listar clientes: " + e.getMessage());
            return null;
        }
    }


}
