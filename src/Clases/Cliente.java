
package Clases;

public class Cliente extends Persona{
    
    private String Codigo_Cliente;

  
     public Cliente() {
    }
    
    public Cliente(String codigo_cliente) {
        this.Codigo_Cliente = codigo_cliente;
    }

    public String getCodigo_Cliente() {
        return Codigo_Cliente;
    }

    public void setCodigo_Cliente(String codigo_cliente) {
        this.Codigo_Cliente = codigo_cliente;
    }
   
    
    
}
