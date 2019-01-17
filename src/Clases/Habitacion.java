
package Clases;

public class Habitacion {
  
//VARIABLES DE HABITACION 
    private  int IdHabitacion;
    private  String  Numero;
    private  String Piso;
    private  String Descripcion;
    private  String Caracteristicas;
    private  double Precio_Dia;
    private String Estado;
    private String Tipo_Habitacion;

    // CONSTRUCTOR 

    public Habitacion(int IdHabitacion, String Numero, String Piso, String Descripcion, String Caracteristicas, double Precio_Dia, String Estado, String Tipo_Habitacion) {
        this.IdHabitacion = IdHabitacion;
        this.Numero = Numero;
        this.Piso = Piso;
        this.Descripcion = Descripcion;
        this.Caracteristicas = Caracteristicas;
        this.Precio_Dia = Precio_Dia;
        this.Estado = Estado;
        this.Tipo_Habitacion = Tipo_Habitacion;
    }

    public Habitacion() {
       
    }
   
   

   //GET Y SET PARA SER ALMACENADOS EN LA TABLA HABITACION 

    public int getIdHabitacion() {
        return IdHabitacion;
    }

    public void setIdHabitacion(int id_Habitacion) {
        this.IdHabitacion = id_Habitacion;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getPiso() {
        return Piso;
    }

    public void setPiso(String Piso) {
        this.Piso = Piso;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    public double getPrecio_Dia() {
        return Precio_Dia;
    }

    public void setPrecio_Dia(double Precio_Dia) {
        this.Precio_Dia = Precio_Dia;
    }
    

    public String getTipo_Habitacion() {
        return Tipo_Habitacion;
    }

    public void setTipo_Habitacion(String Tipo_Habitacion) {
        this.Tipo_Habitacion = Tipo_Habitacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

   
    
}
    
    
    
    
    
            
    

