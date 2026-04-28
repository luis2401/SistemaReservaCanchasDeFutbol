
package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Tarifas;

/**
 *
 * @author alonzo
 */
public class TarifasDAO {
    
    public List<Tarifas> listarTarifas(){
        List<Tarifas> lista = new ArrayList<>();
        String sql = "SELECT * FROM tarifas";
        try {Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               Tarifas tarifa = new Tarifas();
               
               tarifa.setIdTarifa(rs.getInt("idTarifa"));
               tarifa.setCategoria(Tarifas.categoria.valueOf(rs.getString("categoria")));
               tarifa.setPrecioHora(rs.getDouble("precioHora"));
               
               lista.add(tarifa);
               
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("Error al mostrar la lista: " +e.getMessage());
            return  null;
        }
    }
    
}
