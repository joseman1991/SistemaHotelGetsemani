package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    public String db;
    public String url;
    public String user = "postgres";
    public String pass = "postgres";

    public Conexion() {
        db = "sistemahotelgetsemani";
        url = "jdbc:postgresql://localhost:5432/" + db;
        user = "postgres";
        pass = "postgres";
    }

    public Connection conectar() throws SQLException, ClassNotFoundException {
        Connection link = null;
        Class.forName("org.postgresql.Driver");
        link = DriverManager.getConnection(this.url, this.user, this.pass);
        return link;
    }

}
