
package Clases;

import java.sql.Date;


public class Reserva {
 
    private int Id_Reserva;
    private int Id_Habitacion;
    private int Id_Cliente;
    private int Id_Empleado;
    private String Tipo_Reserva;
    private Date Fecha_Reserva;
    private Date Fecha_Ingreso;
    private Date Fecha_Salida;
    private Double Costo_Alojamiento;
    private String Estado;

    public Reserva() {
    }

    public Reserva(int Id_Reserva, int Id_Habitacion, int Id_Cliente, int Id_Empleado, String Tipo_Reserva, Date Fecha_Reserva, Date Fecha_Ingreso, Date Fecha_Salida, Double Costo_Alojamiento, String Estado) {
        this.Id_Reserva = Id_Reserva;
        this.Id_Habitacion = Id_Habitacion;
        this.Id_Cliente = Id_Cliente;
        this.Id_Empleado = Id_Empleado;
        this.Tipo_Reserva = Tipo_Reserva;
        this.Fecha_Reserva = Fecha_Reserva;
        this.Fecha_Ingreso = Fecha_Ingreso;
        this.Fecha_Salida = Fecha_Salida;
        this.Costo_Alojamiento = Costo_Alojamiento;
        this.Estado = Estado;
    }

    public int getId_Reserva() {
        return Id_Reserva;
    }

    public void setId_Reserva(int Id_Reserva) {
        this.Id_Reserva = Id_Reserva;
    }

    public int getId_Habitacion() {
        return Id_Habitacion;
    }

    public void setId_Habitacion(int Id_Habitacion) {
        this.Id_Habitacion = Id_Habitacion;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    public int getId_Empleado() {
        return Id_Empleado;
    }

    public void setId_Empleado(int Id_Empleado) {
        this.Id_Empleado = Id_Empleado;
    }

    public String getTipo_Reserva() {
        return Tipo_Reserva;
    }

    public void setTipo_Reserva(String Tipo_Reserva) {
        this.Tipo_Reserva = Tipo_Reserva;
    }

    public Date getFecha_Reserva() {
        return Fecha_Reserva;
    }

    public void setFecha_Reserva(Date Fecha_Reserva) {
        this.Fecha_Reserva = Fecha_Reserva;
    }

    public Date getFecha_Ingreso() {
        return Fecha_Ingreso;
    }

    public void setFecha_Ingreso(Date Fecha_Ingreso) {
        this.Fecha_Ingreso = Fecha_Ingreso;
    }

    public Date getFecha_Salida() {
        return Fecha_Salida;
    }

    public void setFecha_Salida(Date Fecha_Salida) {
        this.Fecha_Salida = Fecha_Salida;
    }

    public Double getCosto_Alojamiento() {
        return Costo_Alojamiento;
    }

    public void setCosto_Alojamiento(Double Costo_Alojamiento) {
        this.Costo_Alojamiento = Costo_Alojamiento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
    
}
