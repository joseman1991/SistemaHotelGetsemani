
package Clases;


public class Empleado extends Persona{
    
    private Double sueldo;
    private String acceso;
    private String login;
    private String password;
    private String estado;

    
     public Empleado() {
    }
     
    public Empleado(Double sueldo, String acceso, String login, String password, String estado) {
        this.sueldo = sueldo;
        this.acceso = acceso;
        this.login = login;
        this.password = password;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double Sueldo) {
        this.sueldo = Sueldo;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String Acceso) {
        this.acceso = Acceso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String Login) {
        this.login = Login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }
    
    

}
