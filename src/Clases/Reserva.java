
package Clases;

import java.sql.Date;


public class Reserva {
 
    private int idreserva;
    private int idhabitacion;
    private int idcliente;
    private int idempleado;
    private String tipo_reserva;
    private Date fecha_reserva;
    private Date fecha_ingresa;
    private Date fecha_salida;
    private Double costoalojamiento;
    private String estado;

    public Reserva() {
    }

    public Reserva(int idreserva, int idhabitacion, int idcliente, int idempleado, String tipo_reserva, Date fecha_reserva, Date fecha_ingresa, Date fecha_salida, Double costoalojamiento, String estado) {
        this.idreserva = idreserva;
        this.idhabitacion = idhabitacion;
        this.idcliente = idcliente;
        this.idempleado = idempleado;
        this.tipo_reserva = tipo_reserva;
        this.fecha_reserva = fecha_reserva;
        this.fecha_ingresa = fecha_ingresa;
        this.fecha_salida = fecha_salida;
        this.costoalojamiento = costoalojamiento;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idreserva;
    }

    public void setIdReserva(int IdReserva) {
        this.idreserva = IdReserva;
    }

    public int getIdHabitacion() {
        return idhabitacion;
    }

    public void setIdHabitacion(int IdHabitacion) {
        this.idhabitacion = IdHabitacion;
    }

    public int getIdCliente() {
        return idcliente;
    }

    public void setIdCliente(int IdCliente) {
        this.idcliente = IdCliente;
    }

    public int getIdEmpleado() {
        return idempleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.idempleado = IdEmpleado;
    }

    public String getTipo_Reserva() {
        return tipo_reserva;
    }

    public void setTipo_Reserva(String Tipo_Reserva) {
        this.tipo_reserva = Tipo_Reserva;
    }

    public Date getFecha_Reserva() {
        return fecha_reserva;
    }

    public void setFecha_Reserva(Date Fecha_Reserva) {
        this.fecha_reserva = Fecha_Reserva;
    }

    public Date getFecha_Ingreso() {
        return fecha_ingresa;
    }

    public void setFecha_Ingreso(Date Fecha_Ingreso) {
        this.fecha_ingresa = Fecha_Ingreso;
    }

    public Date getFecha_Salida() {
        return fecha_salida;
    }

    public void setFecha_Salida(Date Fecha_Salida) {
        this.fecha_salida = Fecha_Salida;
    }

    public Double getCosto_Alojamiento() {
        return costoalojamiento;
    }

    public void setCosto_Alojamiento(Double Costo_Alojamiento) {
        this.costoalojamiento = Costo_Alojamiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }
    
    
    
    
}
