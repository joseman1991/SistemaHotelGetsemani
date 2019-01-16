
package Clases;

import java.sql.Date;


public class Pago {
    
    
    private int Id_Pago;
    private int Id_Reserva;
    private String Tipo_Comprobante;
    private String Numero_Comprobante;
    private Double Iva;
    private Double Total_Pago;
    private Date Fecha_Emision;
    private Date Fecha_Pago;

    public Pago() {
    }

    public Pago(int Id_Pago, int Id_Reserva, String Tipo_Comprobante, String Numero_Comprobante, Double Iva, Double Total_Pago, Date Fecha_Emision, Date Fecha_Pago) {
        this.Id_Pago = Id_Pago;
        this.Id_Reserva = Id_Reserva;
        this.Tipo_Comprobante = Tipo_Comprobante;
        this.Numero_Comprobante = Numero_Comprobante;
        this.Iva = Iva;
        this.Total_Pago = Total_Pago;
        this.Fecha_Emision = Fecha_Emision;
        this.Fecha_Pago = Fecha_Pago;
    }

    public int getId_Pago() {
        return Id_Pago;
    }

    public void setId_Pago(int Id_Pago) {
        this.Id_Pago = Id_Pago;
    }

    public int getId_Reserva() {
        return Id_Reserva;
    }

    public void setId_Reserva(int Id_reserva) {
        this.Id_Reserva = Id_reserva;
    }

    public String getTipo_Comprobante() {
        return Tipo_Comprobante;
    }

    public void setTipo_Comprobante(String Tipo_Comprobante) {
        this.Tipo_Comprobante = Tipo_Comprobante;
    }

    public String getNumero_Comprobante() {
        return Numero_Comprobante;
    }

    public void setNum_Comprobante(String Numero_Comprobante) {
        this.Numero_Comprobante = Numero_Comprobante;
    }

    public Double getIva() {
        return Iva;
    }

    public void setIva(Double igv) {
        this.Iva = Iva;
    }

    public Double getTotal_Pago() {
        return Total_Pago;
    }

    public void setTotal_Pago(Double Total_Pago) {
        this.Total_Pago = Total_Pago;
    }

    public Date getFecha_Emision() {
        return Fecha_Emision;
    }

    public void setFecha_Emision(Date Fecha_Emision) {
        this.Fecha_Emision = Fecha_Emision;
    }

    public Date getFecha_Pago() {
        return Fecha_Pago;
    }

    public void setFecha_Pago(Date Fecha_Pago) {
        this.Fecha_Pago = Fecha_Pago;
    }

   
    
    
}
