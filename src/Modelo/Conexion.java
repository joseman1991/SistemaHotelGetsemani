package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    public String db;
    public String url;
    public String user = "postgres";
    public String pass = "0202572723";

    public Conexion() {
        db = "sistemahotelgetsemani";
        url = "jdbc:postgresql://localhost:5432/" + db;
        user = "postgres";
        pass = "0202572723";
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
