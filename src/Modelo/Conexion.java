package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

//    protected Connection conexion = null; //Cargar el Drive
//    PreparedStatement st; //Conecta al motor 
//    ResultSet rs; //Procesa las consultas  (INFORMACION)
    public String db;
    public String url;
    public String user = "postgres";
    public String pass = "postgres";

    public Conexion() {
        db = "sistemahotelgetsamani";
        url = "jdbc:postgresql://localhost:5432/" + db;
        user = "postgres";
        pass = "postgres";
    }

    public Connection conectar() throws SQLException {
        Connection link = null;
        try {  System.out.println(url);
            Class.forName("org.postgresql.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);          
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return link;
    }

}
