
package Clases;

public class Persona {
    private int IdPersona;
    private String Nombre;
    private String A_Paterno;
    private String A_Materno;
    private String Tipo_Documento;
    private String Numero_Documento;
    private String Direccion;
    private String Telefono;
    private String Email;

    public Persona() {
    }

    public Persona(int IdPersona, String Nombre, String A_Paterno, String A_Materno, String Tipo_Documento, String Numero_Documento, String Direccion, String Telefono, String Email) {
        this.IdPersona = IdPersona;
        this.Nombre = Nombre;
        this.A_Paterno = A_Paterno;
        this.A_Materno = A_Materno;
        this.Tipo_Documento = Tipo_Documento;
        this.Numero_Documento = Numero_Documento;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getA_Paterno() {
        return A_Paterno;
    }

    public void setA_Paterno(String A_Paterno) {
        this.A_Paterno = A_Paterno;
    }

    public String getA_Materno() {
        return A_Materno;
    }

    public void setA_Materno(String A_Materno) {
        this.A_Materno = A_Materno;
    }

    public String getTipo_Documento() {
        return Tipo_Documento;
    }

    public void setTipo_Documento(String Tipo_Documento) {
        this.Tipo_Documento = Tipo_Documento;
    }

    public String getNumero_Documento() {
        return Numero_Documento;
    }

    public void setNumero_Documento(String Numero_Documento) {
        this.Numero_Documento = Numero_Documento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }




    
}


