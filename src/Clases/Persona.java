
package Clases;

public class Persona {
    private int idpersona;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String tipo_documento;
    private String num_documento;
    private String direccion;
    private String telefono;
    private String email;

    public Persona() {
    }

    public Persona(int idpersona, String nombre, String apaterno, String amaterno, String tipo_documento, String num_documento, String direccion, String telefono, String email) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.tipo_documento = tipo_documento;
        this.num_documento = num_documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public int getIdPersona() {
        return idpersona;
    }

    public void setIdPersona(int IdPersona) {
        this.idpersona = IdPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getA_Paterno() {
        return apaterno;
    }

    public void setA_Paterno(String A_Paterno) {
        this.apaterno = A_Paterno;
    }

    public String getA_Materno() {
        return amaterno;
    }

    public void setA_Materno(String A_Materno) {
        this.amaterno = A_Materno;
    }

    public String getTipo_Documento() {
        return tipo_documento;
    }

    public void setTipo_Documento(String Tipo_Documento) {
        this.tipo_documento = Tipo_Documento;
    }

    public String getNumero_Documento() {
        return num_documento;
    }

    public void setNumero_Documento(String Numero_Documento) {
        this.num_documento = Numero_Documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String Telefono) {
        this.telefono = Telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }




    
}


