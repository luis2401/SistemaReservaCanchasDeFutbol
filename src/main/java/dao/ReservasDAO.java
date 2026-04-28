/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import modelo.Canchas;
import modelo.Clientes;
import modelo.Tarifas;

/**
 *
 * @author alonzo
 */
public class ReservasDAO {
    
    LocalDate fechaHoy = LocalDate.now();
    LocalTime horaInicio = LocalTime.of(18, 0);
    LocalTime horaFin = LocalTime.of(19, 0);
    
    public boolean insertarReserva(Canchas cancha, Clientes cliente, Tarifas tarifa){
        String sql = "INSERT INTO reservas(fecha, horaInicio, horaFin, montoTotal, idCancha, idCliente, idTarifa) values(?,?,?,?,?,?,?)";
        try {Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
        ps.setObject(1, fechaHoy);
        ps.setObject(2, horaInicio); 
        ps.setObject(3, horaFin);
        ps.setDouble(4, tarifa.getPrecioHora());
        ps.setInt(5, cancha.getIdCancha());
        ps.setInt(6, cliente.getIdCliente());
        ps.setInt(7, tarifa.getIdTarifa());
        return ps.executeUpdate()>0;
        } catch (SQLException e) {
            System.err.println("Error al insertar reserva: " + e.getMessage());
            return false;
        }
    }
    
}
