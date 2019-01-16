
package Clases;


public class Empleado extends Persona{
    
    private Double Sueldo;
    private String Acceso;
    private String Login;
    private String Password;
    private String Estado;

    
     public Empleado() {
    }
     
    public Empleado(Double Sueldo, String Acceso, String Login, String Password, String Estado) {
        this.Sueldo = Sueldo;
        this.Acceso = Acceso;
        this.Login = Login;
        this.Password = Password;
        this.Estado = Estado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getAcceso() {
        return Acceso;
    }

    public void setAcceso(String Acceso) {
        this.Acceso = Acceso;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    

}
