package dao;

import modelo.Canchas;
import conexion.Conexion;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alonzo
 */
public class CanchasDAO {

    public List<Canchas> listarCanchas() {
        List<Canchas> lista = new ArrayList<>();
        String sql = "SELECT * FROM canchas";
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Canchas cancha = new Canchas();
                 
                cancha.setIdCancha(rs.getInt("idCancha"));
                cancha.setNombreCancha(rs.getString("nombreCancha"));
                cancha.setTipoCancha(Canchas.tipoCancha.valueOf(rs.getString("tipoCancha").toUpperCase()));
                cancha.setEstadoCancha(Canchas.estadoCancha.valueOf(rs.getString("estadoCancha").toUpperCase()));

                lista.add(cancha);
            }
            return lista;
        } catch (SQLException e) {
            System.err.println("Error al insertar cancha: " + e.getMessage());
            return null;
        }

    }

    public boolean insertarCancha(Canchas cancha) {
        String sql = "INSERT INTO canchas (nombreCancha, tipoCancha, estadoCancha) VALUES (?,?,?)";
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cancha.getNombreCancha());
            ps.setString(2, cancha.getTipoCancha().name());
            ps.setString(3, cancha.getEstadoCancha().name());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al insertar cancha: " + e.getMessage());
            return false;
        }

    }

    public boolean eliminarCancha(Integer idCancha) {
        String sql = "DELETE FROM canchas WHERE idCancha = " + idCancha;
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar cancha: " + e.getMessage());
            return false;
        }
    }

}
