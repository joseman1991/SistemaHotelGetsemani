
package Clases;

import java.sql.Date;


public class Pago {
    
    
    private int idpago;
    private int idreserva;
    private String tipo_comprobante;
    private String num_comprobante;
    private Double iva;
    private Double total_pago;
    private Date fecha_emision;
    private Date fecha_pago;

    public Pago() {
    }

    public Pago(int idpago, int idreserva, String tipo_comprobante, String num_comprobante, Double iva, Double total_pago, Date fecha_emision, Date fecha_pago) {
        this.idpago = idpago;
        this.idreserva = idreserva;
        this.tipo_comprobante = tipo_comprobante;
        this.num_comprobante = num_comprobante;
        this.iva = iva;
        this.total_pago = total_pago;
        this.fecha_emision = fecha_emision;
        this.fecha_pago = fecha_pago;
    }

    

    public int getIdPago() {
        return idpago;
    }

    public void setIdPago(int IdPago) {
        this.idpago = IdPago;
    }

    public int getIdReserva() {
        return idreserva;
    }

    public void setIdReserva(int Idreserva) {
        this.idreserva = Idreserva;
    }

    public String getTipo_Comprobante() {
        return tipo_comprobante;
    }

    public void setTipo_Comprobante(String Tipo_Comprobante) {
        this.tipo_comprobante = Tipo_Comprobante;
    }

    public String getNumero_Comprobante() {
        return num_comprobante;
    }

    public void setNum_Comprobante(String Numero_Comprobante) {
        this.num_comprobante = Numero_Comprobante;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double Iva) {
        this.iva = Iva;
    }

    public Double getTotal_Pago() {
        return total_pago;
    }

    public void setTotal_Pago(Double Total_Pago) {
        this.total_pago = Total_Pago;
    }

    public Date getFecha_Emision() {
        return fecha_emision;
    }

    public void setFecha_Emision(Date Fecha_Emision) {
        this.fecha_emision = Fecha_Emision;
    }

    public Date getFecha_Pago() {
        return fecha_pago;
    }

    public void setFecha_Pago(Date Fecha_Pago) {
        this.fecha_pago = Fecha_Pago;
    }

   
    
    
}
