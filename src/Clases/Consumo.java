
package Clases;


public class Consumo {
    
    private int idconsumo;
    private int idreserva;
    private int idproducto;
    private int cantidad;
    private Double precio_venta;
    private String estado;

    public Consumo() {
    }

    public Consumo(int idconsumo, int idreserva, int idproducto, int cantidad, Double precio_venta, String estado) {
        this.idconsumo = idconsumo;
        this.idreserva = idreserva;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.precio_venta = precio_venta ;
        this.estado = estado;
    }

    public int getIdConsumo() {
        return idconsumo;
    }

    public void setIdConsumo(int IdConsumo) {
        this.idconsumo = IdConsumo;
    }

    public int getIdReserva() {
        return idreserva;
    }

    public void setIdReserva(int IdReserva) {
        this.idreserva = IdReserva;
    }

    public int getIdProducto() {
        return idproducto;
    }

    public void setIdProducto(int IdProducto) {
        this.idproducto = IdProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.cantidad = Cantidad;
    }

    public Double getPrecio_Venta() {
        return precio_venta;
    }

    public void setPrecio_Venta(Double Precio_Venta) {
        this.precio_venta = Precio_Venta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }
    
    
    
    
}
