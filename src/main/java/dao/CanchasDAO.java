/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Canchas;
import conexion.Conexion;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author alonzo
 */
public class CanchasDAO {
    
    public boolean insertarCancha(Canchas cancha){
        String sql = "INSERT INTO canchas (nombreCancha, tipoCancha, estadoCancha) VALUES (?,?,?)";
        try {Connection con = Conexion.getConexion();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, cancha.getNombreCancha());
        ps.setString(2, cancha.getTipoCancha().name());
        ps.setString(3, cancha.getEstadoCancha().name());
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
            System.err.println("Error al insertar cancha: " + e.getMessage());
            return false;
        }
    
    }
    
}
