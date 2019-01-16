
package Clases;


public class Consumo {
    
    private int Id_Consumo;
    private int Id_Reserva;
    private int Id_Producto;
    private Double Cantidad;
    private Double Precio_Venta;
    private String Estado;

    public Consumo() {
    }

    public Consumo(int Id_Consumo, int Id_Reserva, int Id_Producto, Double Cantidad, Double Precio_Venta, String Estado) {
        this.Id_Consumo = Id_Consumo;
        this.Id_Reserva = Id_Reserva;
        this.Id_Producto = Id_Producto;
        this.Cantidad = Cantidad;
        this.Precio_Venta = Precio_Venta;
        this.Estado = Estado;
    }

    public int getId_Consumo() {
        return Id_Consumo;
    }

    public void setId_Consumo(int Id_Consumo) {
        this.Id_Consumo = Id_Consumo;
    }

    public int getId_Reserva() {
        return Id_Reserva;
    }

    public void setId_Reserva(int Id_Reserva) {
        this.Id_Reserva = Id_Reserva;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

    public Double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Double getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(Double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
    
}
