
package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author alonzo
 */
public class Reservas {
    private int idReserva;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private double montoTotal;
    private Clientes cliente;
    private Canchas cancha;
    private Tarifas tarifa;

    public Reservas() {
    }

    public Reservas(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, double montoTotal, Clientes cliente, Canchas cancha, Tarifas tarifa) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.montoTotal = montoTotal;
        this.cliente = cliente;
        this.cancha = cancha;
        this.tarifa = tarifa;
    }
    
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Canchas getCancha() {
        return cancha;
    }

    public void setCancha(Canchas cancha) {
        this.cancha = cancha;
    }

    public Tarifas getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifas tarifa) {
        this.tarifa = tarifa;
    }
    
    
}
