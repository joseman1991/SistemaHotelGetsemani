
package Clases;

public class Producto {
  
  private int Id_Producto;
  private String Nombre;
  private String Descripcion;
  private String Unidad_Medida;
  private Double Precio_Venta;

    public Producto() {
    }

    public Producto(int Id_Producto, String Nombre, String Descripcion, String Unidad_Medida, Double Precio_Venta) {
        this.Id_Producto = Id_Producto;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Unidad_Medida = Unidad_Medida;
        this.Precio_Venta = Precio_Venta;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getUnidad_Medida() {
        return Unidad_Medida;
    }

    public void setUnidad_Medida(String Unidad_Medida) {
        this.Unidad_Medida = Unidad_Medida;
    }

    public Double getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(Double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

   
}
