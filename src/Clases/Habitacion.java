
package Clases;

public class Habitacion {
  
//VARIABLES DE HABITACION 
    private  int idhabitacion;
    private  String  numero;
    private  String piso;
    private  String descripcion;
    private  String caracteristicas;
    private  double precio_dia;
    private String estado;
    private String tipo_habitacion;

    // CONSTRUCTOR 

    public Habitacion(int idhabitacion, String numero, String piso, String descripcion, String caracteristicas, double precio_dia, String estado, String tipo_habitacion) {
        this.idhabitacion = idhabitacion;
        this.numero = numero;
        this.piso = piso;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.precio_dia = precio_dia;
        this.estado = estado;
        this.tipo_habitacion = tipo_habitacion;
    }

   

    public Habitacion() {
       
    }
   
   //GET Y SET PARA SER ALMACENADOS EN LA TABLA HABITACION 

    public int getIdHabitacion() {
        return idhabitacion;
    }

    public void setIdHabitacion(int id_Habitacion) {
        this.idhabitacion = id_Habitacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String Numero) {
        this.numero = Numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String Piso) {
        this.piso = Piso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.caracteristicas = Caracteristicas;
    }

    public double getPrecio_Dia() {
        return precio_dia;
    }

    public void setPrecio_Dia(double Precio_Dia) {
        this.precio_dia = Precio_Dia;
    }
    

    public String getTipo_Habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_Habitacion(String Tipo_Habitacion) {
        this.tipo_habitacion = Tipo_Habitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }

   
    
}
    
    
    
    
    
            
    

