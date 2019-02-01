
package Clases;

public class Producto {
  
  private int idproducto;
  private String nombre;
  private String descripcion;
  private String unidad_medida;
  private Double precio_venta;

    public Producto() {
    }

    public Producto(int idproducto, String nombre, String descripcion, String unidad_medida, Double precio_venta) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidad_medida = unidad_medida;
        this.precio_venta = precio_venta;
    }

   

    public int getIdProducto() {
        return idproducto;
    }

    public void setIdProducto(int IdProducto) {
        this.idproducto = IdProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public String getUnidad_Medida() {
        return unidad_medida;
    }

    public void setUnidad_Medida(String Unidad_Medida) {
        this.unidad_medida = Unidad_Medida;
    }

    public Double getPrecio_Venta() {
        return precio_venta;
    }

    public void setPrecio_Venta(Double Precio_Venta) {
        this.precio_venta = Precio_Venta;
    }

   
}
